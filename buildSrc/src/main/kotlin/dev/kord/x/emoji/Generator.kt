package dev.kord.x.emoji

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import dev.kord.codegen.kotlinpoet.*
import dev.kord.codegen.kotlinpoet.js.jsName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.TaskAction
import org.gradle.kotlin.dsl.register
import kotlin.io.path.Path
import kotlin.io.path.div

val LIST_OF = MemberName("kotlin.collections", "listOf")

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

// File from: https://github.com/github/gemoji/blob/master/db/emoji.json
@Serializable
data class EmojiItem(
    val emoji: String,
    val aliases: List<String>,
    @SerialName("skin_tones")
    val hasSkinTones: Boolean = false
)

@Suppress("MemberVisibilityCanBePrivate")
class EmojiPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.tasks.register<GenerateEmojisTask>("generateEmojisFile")
    }
}

private val jsValidName = "[a-zA-Z0-9]+".toRegex()
private val snakeCase = """_\w""".toRegex()

private abstract class GenerateEmojisTask : DefaultTask() {
    private val targetFile = Path(project.rootProject.rootDir.absolutePath, "src/commonMain/kotlin")
    private val fileName = "EmojisList"

    init {
        outputs.file(targetFile / "$fileName.kt")
    }

    private fun String.escape() = flatMap { it.code.toString(36).toList() }
        .map { if (it in '0'..'9') it + 17 else it }
        .joinToString("")

    @OptIn(DelicateKotlinPoetApi::class)
    @TaskAction
    private fun generate() {
        val emojis = parseEmojis()
        val file = FileSpec("dev.kord.x.emoji", "EmojiList") {
            addKotlinDefaultImports(includeJvm = false, includeJs = false)
            addObject("Emojis") {
                addKdoc(
                    """
                List of all supported discord emojis.
                """.trimIndent()
                )
                addAnnotation(
                    Suppress(
                        "ObjectPropertyName",
                        "MemberVisibilityCanBePrivate",
                        "SpellCheckingInspection",
                        "unused"
                    )
                )

                generateMapGetter()
                generateList(emojis)
                emojis.forEach { apply(it) }
            }
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

    @OptIn(DelicateKotlinPoetApi::class)
    fun TypeSpec.Builder.generateMapGetter() {
        addFunction("get") {
            addAnnotation(
                Deprecated(
                    "Replaced by DiscordEmoji.findByUnicodeOrNull",
                    ReplaceWith("DiscordEmoji.findByUnicodeOrNull(unicode)", "dev.kord.x.emoji.DiscordEmoji")
                )
            )
            addKdoc("Gets a discord emoji with the given [unicode].")
            addModifiers(KModifier.OPERATOR)
            addParameter<String>("unicode")
            returns(EmojiType.Base.name.copy(nullable = true))
            addCode("""return DiscordEmoji.findByUnicodeOrNull(unicode)""")
        }
    }

    fun TypeSpec.Builder.generateList(emojis: List<EmojiItem>) {
        val type = LIST.parameterizedBy(EmojiType.Base.name)
        addProperty("all", type) {
            val initializer = emojis
                .map {
                    val name = MemberName("", it.camelCaseName)
                    CodeBlock.of("%M", name)
                }
                .joinToCode(prefix = "listOf(\n", separator = ",\n", suffix = ")")

            initializer(initializer)
        }
    }

    fun TypeSpec.Builder.apply(item: EmojiItem): Unit = when (item.hasSkinTones) {
        true -> applyEmoji(item, EmojiType.Diverse.name)
        else -> applyEmoji(item, EmojiType.Generic.name)
    }

    private fun PropertySpec.Builder.applyJsNameIfNeeded(name: String) {
        val safeName = when {
            !jsValidName.matches(name) -> name.escape()
            name.first().isDigit() -> "_$name"
            else -> return
        }
        jsName(safeName)
    }

    fun TypeSpec.Builder.applyEmoji(item: EmojiItem, typeName: TypeName) {
        addProperty(item.camelCaseName, typeName) {
            applyJsNameIfNeeded(item.camelCaseName)
            val names = item.aliases.map { CodeBlock.of("%S", it) }.joinToCode(", ")
            getter {
                addStatement("""return %T(%S, %M(%L))""", typeName, item.emoji, LIST_OF, names)
            }
        }
    }


    private fun parseEmojis(): List<EmojiItem> {
        val content = javaClass.classLoader.getResource("emojis.json")!!.readText()
        val json = Json {
            ignoreUnknownKeys = true
        }
        return json.decodeFromString(content)
    }
}

private val EmojiItem.camelCaseName: String
    get() =
        (aliases.firstOrNull { jsValidName.matches(it) } ?: aliases.first()).toCamelCase()

private fun String.toCamelCase() = snakeCase.replace(replaceFirstChar { it.lowercase() }) {
    it.value.drop(1).uppercase()
}
