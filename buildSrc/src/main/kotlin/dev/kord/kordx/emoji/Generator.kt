package dev.kord.kordx.emoji

import com.squareup.kotlinpoet.*
import kotlinx.serialization.Serializable
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.builtins.MapSerializer
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.json.Json
import org.apache.commons.text.StringEscapeUtils
import org.gradle.api.Plugin
import org.gradle.api.Project
import java.nio.charset.Charset
import java.nio.file.Paths

private object Generator

sealed class EmojiType {
    abstract val name: ClassName

    object Base : EmojiType() {
        override val name: ClassName
            get() = ClassName("dev.kord.kordx.emoji", "DiscordEmoji")
    }

    object Generic : EmojiType() {
        override val name: ClassName
            get() = ClassName("dev.kord.kordx.emoji", "DiscordEmoji.Generic")
    }

    object Diverse : EmojiType() {
        override val name: ClassName
            get() = ClassName("dev.kord.kordx.emoji", "DiscordEmoji.Diverse")
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

val EmojiItem.unicode: String get() = StringEscapeUtils.escapeJava(surrogates)

@Suppress("MemberVisibilityCanBePrivate")
class EmojiPlugin : Plugin<Project> {
    private val snakeCase = Regex("""_\w""")

    override fun apply(project: Project) {
        generate(project)
    }

    private fun generate(project: Project) {
        val emojis: Map<String, List<EmojiItem>> = parseEmojis()
        val file = with(FileSpec.builder("dev.kord.kordx.emoji", "EmojiList")) {
            val emojisObject = buildObject("Emojis") {
                addKdoc("""
                List of all supported discord emojis.
                """.trimIndent())

                //disabled for now
                generateMapGetter()
                generateMap(emojis)
                emojis.values.asSequence().flatten().forEach { apply(it) }
            }

            addType(emojisObject)
            build()
        }

        val directory = Paths.get(project.rootProject.rootDir.absolutePath, "src/main/kotlin")
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
                .addParameter("unicode", typeNameOf<String>())
                .returns(EmojiType.Base.name.copy(nullable = true))
                .addStatement("val tone = unicode.toSkinTone()")
                .addStatement("val withoutTone = unicode.removeTone()")
                .addStatement("val emoji = Emojis.all[withoutTone]")
                .addStatement("")
                .addStatement("return if (emoji is %T) emoji.copy(tone = tone!!) else emoji", EmojiType.Diverse.name)
                .build()

        addFunction(getter)
    }

    fun TypeSpec.Builder.generateMap(emojis: Map<String, List<EmojiItem>>) {
        val type = with(ParameterizedTypeName) {
            Map::class.asTypeName().parameterizedBy(typeNameOf<String>(), ClassName("dev.kord.kordx.emoji", "DiscordEmoji"))
        }

        val property = buildProperty("all", type) {
            initializer("""mapOf(
                    |${
            emojis.values.asSequence().flatten().joinToString(",\n") {
                "        \"${it.unicode}\" to `${it.names.first().toCamelCase()}`"
            }
            }    
                    |)""".trimMargin())
            addModifiers(KModifier.PRIVATE)
        }

        addProperty(property)
    }

    fun TypeSpec.Builder.apply(item: EmojiItem): Unit = when (item.hasDiversity) {
        true -> applyDiverse(item)
        else -> applyGeneric(item)
    }

    fun TypeSpec.Builder.applyDiverse(item: EmojiItem) {
        item.names.forEach { name ->
            val property = buildProperty(name.toCamelCase(), EmojiType.Diverse.name) {
                getter(FunSpec.getterBuilder().addStatement("return %T(\"%L\")", EmojiType.Diverse.name, item.unicode).build())
            }
            addProperty(property)
        }
    }

    fun String.toCamelCase() = snakeCase.replace(decapitalize()) { result -> result.value.drop(1).toUpperCase() }

    inline fun buildProperty(name: String, type: TypeName, builder: PropertySpec.Builder.() -> Unit) = with(PropertySpec.builder(name, type)) {
        builder()
        build()
    }

    inline fun<reified T> buildProperty(name: String, builder: PropertySpec.Builder.() -> Unit) = with(PropertySpec.builder(name, typeNameOf<T>())) {
        builder()
        build()
    }

    inline fun buildObject(name: String, builder: TypeSpec.Builder.() -> Unit) = with(TypeSpec.objectBuilder(name)) {
        builder()
        build()
    }

    fun TypeSpec.Builder.applyGeneric(item: EmojiItem) {
        item.names.forEach { name ->
            val property = buildProperty(name.toCamelCase(), EmojiType.Generic.name) {
                getter(FunSpec.getterBuilder().addStatement("return %T(\"%L\")", EmojiType.Generic.name, item.unicode).build())
            }
            addProperty(property)
        }
    }

    private fun parseEmojis(): Map<String, List<EmojiItem>> {
        val content = String(Generator::class.java.classLoader.getResourceAsStream("emojis.json")!!.readAllBytes(), Charset.forName("UTF-8"))
        val pair = Pair(String.serializer(), ListSerializer(EmojiItem.serializer()))
        val serializer = MapSerializer(pair.first, pair.second)
        return Json.decodeFromString(serializer, content)
    }
}