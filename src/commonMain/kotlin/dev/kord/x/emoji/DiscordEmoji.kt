package dev.kord.x.emoji

import dev.kord.core.behavior.MessageBehavior
import dev.kord.core.entity.ReactionEmoji

public enum class SkinTone(public val unicode: String) {
    Dark("\uD83C\uDFFF"),
    MediumDark("\uD83C\uDFFE"),
    Medium("\uD83C\uDFFD"),
    MediumLight("\uD83C\uDFFC"),
    Light("\uD83C\uDFFB"),
    Default("");
}

public enum class HairStyle(public val unicode: String) {
    RedHair("🦰"),
    CurlyHair("🦱"),
    WhiteHair("🦳"),
    Bald("🦲"),
    Default("");
}

/**
 * A Unicode emoji supported by Discord's client.
 */
public sealed interface DiscordEmoji {

    /**
     * The hex value of this emoji.
     */
    public val unicode: String

    /**
     * List of names for this emoji.
     */
    public val names: List<String>

    /**
     * The first name for this emoji.
     */
    public val name: String get() = names.first()

    /**
     * An emoji that supports [SkinTones][SkinTone].
     */
    public data class Diverse(
        public val code: String,
        override val names: List<String>,
        val tone: SkinTone = SkinTone.Default,
        val hairStyle: HairStyle = HairStyle.Default
    ) : DiscordEmoji {
        @Deprecated("Replaced by with", ReplaceWith("with(tone = tone)"))
        public fun withTone(tone: SkinTone): Diverse = copy(tone = tone)

        /**
         * Creates a new instance of this [DiscordEmoji] with [tone] and [hairStyle].
         */
        public fun with(tone: SkinTone = this.tone, hairStyle: HairStyle = this.hairStyle): Diverse =
            copy(tone = tone, hairStyle = hairStyle)

        override val unicode: String
            get() = buildString {
                append(code)
                if (tone != SkinTone.Default) {
                    append(tone.unicode)
                }
                if (hairStyle != HairStyle.Default) {
                    append("\u200D")
                    append(hairStyle.unicode)
                }
            }

        /**
         * Checks [other] to be the same emote but ignores [tone].
         */
        public fun isSimilar(other: Diverse?): Boolean = code == other?.code

        override fun toString(): String = unicode
    }

    /**
     * A generic emoji that does not support [SkinTones][SkinTone].
     */
    public data class Generic(override val unicode: String, override val names: List<String>) : DiscordEmoji {
        override fun toString(): String = unicode

        override fun hashCode(): Int = unicode.hashCode()

        override fun equals(other: Any?): Boolean {
            if (other !is Generic) return false

            return unicode == other.unicode
        }
    }

    public companion object {
        private val byName: Map<String, DiscordEmoji> = Emojis.all.flatMap { emoji ->
            emoji.names.map { name -> name to emoji }
        }.toMap()
        private val byUnicode: Map<String, DiscordEmoji> = Emojis.all.associateBy {
            when (it) {
                is Diverse -> it.code
                is Generic -> it.unicode
            }
        }

        /**
         * Finds an emoji by its [unicode].
         *
         * @throws IllegalArgumentException if the emoji was not found
         */
        public fun findByUnicode(unicode: String): DiscordEmoji =
            requireNotNull(findByUnicodeOrNull(unicode)) { "Could not find emoji: $unicode" }

        /**
         * Finds an emoji by its [unicode] or `null`.
         */
        public fun findByUnicodeOrNull(unicode: String): DiscordEmoji? {
            val tone = unicode.toSkinTone() ?: SkinTone.Default
            val hairStyle = unicode.toHairStyle() ?: HairStyle.Default
            val withoutDiversity = unicode.removeTone().removeHairStyle()
            val emoji = byUnicode[withoutDiversity]

            return if (emoji is Diverse) emoji.copy(tone = tone, hairStyle = hairStyle) else emoji
        }

        /**
         * Finds an emoji by its [name].
         *
         * @throws IllegalArgumentException if the emoji was not found
         */
        public fun findByName(name: String): DiscordEmoji =
            requireNotNull(findByNameOrNull(name)) { "Could not find emoji: $name" }

        /**
         * Finds an emoji by its [name] or `null`.
         */
        public fun findByNameOrNull(name: String): DiscordEmoji? = byName[name]
    }
}

/**
 * Requests to add the [emoji] to the messages.
 */
public suspend fun MessageBehavior.addReaction(emoji: DiscordEmoji): Unit = addReaction(emoji.toReaction())

/**
 * Requests to delete all [emoji] reactions from this message.
 */
public suspend fun MessageBehavior.deleteReaction(emoji: DiscordEmoji): Unit = deleteReaction(emoji.toReaction())

/**
 * Requests to delete an emoji from this message made by this bot.
 */
public suspend fun MessageBehavior.deleteOwnReaction(emoji: DiscordEmoji): Unit = deleteOwnReaction(emoji.toReaction())

/**
 * Transforms the emoji into a [ReactionEmoji.Unicode] emoji.
 */
public fun DiscordEmoji.toReaction(): ReactionEmoji.Unicode = ReactionEmoji.Unicode(unicode)

/**
 * transforms a [DiscordEmoji] into a reaction.
 *
 * @param emoji the emoji to transform into a reaction.
 */
public fun ReactionEmoji.Companion.from(emoji: DiscordEmoji): ReactionEmoji.Unicode = emoji.toReaction()

internal fun String.toSkinTone(): SkinTone? = SkinTone.entries.firstOrNull { contains(it.unicode) }
internal fun String.toHairStyle(): HairStyle? = HairStyle.entries.firstOrNull { endsWith(it.unicode) }

internal fun String.removeTone(): String = SkinTone.entries.fold(this) { acc, skinTone ->
    acc.removeSuffix(skinTone.unicode)
}

internal fun String.removeHairStyle(): String = HairStyle.entries.fold(this) { acc, hairStyle ->
    acc.removeSuffix(hairStyle.unicode)
}
