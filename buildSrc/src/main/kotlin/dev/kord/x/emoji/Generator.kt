package dev.kord.x.emoji

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.TaskAction
import kotlin.io.path.Path
import kotlin.io.path.div

sealed class EmojiType {
    abstract val name: ClassName

    object Base : EmojiType() {
        override val name: ClassName
            get() = ClassName("dev.kord.x.emoji", "DiscordEmoji")
    }

    object Generic : EmojiType() {
        override val name: ClassName
            get() = ClassName("dev.kord.x.emoji", "DiscordEmoji.Generic")
    }

    object Diverse : EmojiType() {
        override val name: ClassName
            get() = ClassName("dev.kord.x.emoji", "DiscordEmoji.Diverse")
    }
}

@Serializable
data class EmojiItem(
    val names: List<String>,
    val surrogates: String,
    val unicodeVersion: Double,
    val hasDiversity: Boolean = false,
    val hasMultiDiversity: Boolean = false,
    val diversityChildren: List<EmojiItem> = emptyList(),
    val diversity: List<String> = emptyList(),
    val hasDiversityParent: Boolean = false,
    val hasMultiDiversityParent: Boolean = false
)

@Suppress("MemberVisibilityCanBePrivate")
class EmojiPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.tasks.register("generateEmojisFile", GenerateEmojisTask::class.java)
    }
}

private abstract class GenerateEmojisTask : DefaultTask() {
    private val snakeCase = """_\w""".toRegex()
    private val jsValidName = "[a-zA-Z0-9]+".toRegex()
    private val targetFile = Path(project.rootProject.rootDir.absolutePath, "src/commonMain/kotlin")
    private val fileName = "EmojisList"

    init {
        outputs.file(targetFile / "$fileName.kt")
        inputs.file(project.file("buildSrc/src/main/resources/emojis.json"))
    }

    private fun String.escape() = flatMap { it.code.toString(36).toList() }
        .map { if (it in '0'..'9') it + 17 else it }
        .joinToString("")

    @OptIn(DelicateKotlinPoetApi::class)
    @TaskAction
    private fun generate() {
        val emojis: Map<String, List<EmojiItem>> = parseEmojis()
        val file = with(FileSpec.builder("dev.kord.x.emoji", "EmojiList")) {
            addKotlinDefaultImports(includeJvm = false, includeJs = false)
            val emojisObject = buildObject("Emojis") {
                addKdoc(
                    """
                List of all supported discord emojis.
                """.trimIndent()
                )
                addAnnotation(
                    AnnotationSpec.get(
                        Suppress(
                            "ObjectPropertyName",
                            "MemberVisibilityCanBePrivate",
                            "SpellCheckingInspection",
                            "unused"
                        )
                    )
                )

                //disabled for now
                generateMapGetter()
                generateMap(emojis)
                emojis.values.asSequence().flatten().forEach { apply(it) }
            }

            addType(emojisObject)
            build()
        }

        val directory = Path(project.rootProject.rootDir.absolutePath, "src/commonMain/kotlin")
        file.writeTo(directory)
    }

//    /**
//     * Gets a discord emoji with the given [name].
//     */
//    operator fun Emojis.get(name: String) : DiscordEmoji? {
//        val tone = name.toSkinTone()
//        val emoji = Emojis.all[name.removeTone()]
//
//        return if (emoji is DiscordEmoji.Diverse) emoji.copy(tone = tone!!)
//        else emoji
//    }

    fun TypeSpec.Builder.generateMapGetter() {
        val getter = FunSpec.builder("get")
            .addKdoc("Gets a discord emoji with the given [unicode].")
            .addModifiers(KModifier.OPERATOR)
            .addParameter("unicode", STRING)
            .returns(EmojiType.Base.name.copy(nullable = true))
            .addCode(
                """
                val tone = unicode.toSkinTone()
                val withoutTone = unicode.removeTone()
                val emoji = all[withoutTone]
                
                return if (emoji is %T) emoji.copy(tone = tone!!) else emoji
            """.trimIndent(), EmojiType.Diverse.name
            )
            .build()

        addFunction(getter)
    }

    fun TypeSpec.Builder.generateMap(emojis: Map<String, List<EmojiItem>>) {
        val type = MAP.parameterizedBy(STRING, EmojiType.Base.name)
        val property = buildProperty("all", type) {
            val initializer = emojis.values.flatten()
                .map {
                    val name = MemberName("", it.names.first().toCamelCase())
                    CodeBlock.of("%S to %M", it.surrogates, name)
                }
                .joinToCode(prefix = "mapOf(\n", separator = ",\n", suffix = ")")

            initializer(initializer)
        }

        addProperty(property)
    }

    fun TypeSpec.Builder.apply(item: EmojiItem): Unit = when (item.hasDiversity) {
        true -> applyDiverse(item)
        else -> applyGeneric(item)
    }

    private fun PropertySpec.Builder.applyJsNameIfNeeded(name: String) {
        val safeName = when {
            !jsValidName.matches(name) -> name.escape()
            name.first().isDigit() -> "_$name"
            else -> return
        }
        val jsName = AnnotationSpec
            .builder(ClassName("kotlin.js", "JsName"))
            .addMember("%S", safeName)
            .build()
        addAnnotation(jsName)
    }

    fun TypeSpec.Builder.applyDiverse(item: EmojiItem) {
        item.names.forEach { name ->
            val camelCaseName = name.toCamelCase()
            val property = buildProperty(camelCaseName, EmojiType.Diverse.name) {
                applyJsNameIfNeeded(camelCaseName)
                getter(
                    FunSpec.getterBuilder()
                        .addStatement("""return %T("%L")""", EmojiType.Diverse.name, item.surrogates)
                        .build()
                )
            }
            addProperty(property)
        }
    }

    fun String.toCamelCase() = snakeCase.replace(replaceFirstChar { it.lowercase() }) {
        it.value.drop(1).uppercase()
    }

    inline fun buildProperty(name: String, type: TypeName, builder: PropertySpec.Builder.() -> Unit) =
        with(PropertySpec.builder(name, type)) {
            builder()
            build()
        }

    inline fun buildObject(name: String, builder: TypeSpec.Builder.() -> Unit) =
        with(TypeSpec.objectBuilder(name)) {
            builder()
            build()
        }

    fun TypeSpec.Builder.applyGeneric(item: EmojiItem) {
        item.names.forEach { name ->
            val camelCaseName = name.toCamelCase()
            val property = buildProperty(camelCaseName, EmojiType.Generic.name) {
                applyJsNameIfNeeded(camelCaseName)
                getter(
                    FunSpec.getterBuilder()
                        .addStatement("""return %T("%L")""", EmojiType.Generic.name, item.surrogates)
                        .build()
                )
            }
            addProperty(property)
        }
    }

    private fun parseEmojis(): Map<String, List<EmojiItem>> {
        val content = javaClass.classLoader.getResource("emojis.json")!!.readText()
        return Json.decodeFromString(content)
    }
}
