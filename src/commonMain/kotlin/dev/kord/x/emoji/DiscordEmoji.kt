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

    public companion object
}

/**
 * A Unicode emoji supported by Discord's client.
 */
public sealed class DiscordEmoji {

    /**
     * The hex value of this emoji.
     */
    public abstract val unicode: String

    /**
     * An emoji that supports [SkinTones][SkinTone].
     */
    public data class Diverse(val code: String, val tone: SkinTone = SkinTone.Default) : DiscordEmoji() {
        public fun withTone(tone: SkinTone): Diverse = copy(code = code, tone = tone)

        override val unicode: String
            get() = "$code${tone.unicode}"

        /**
         * Checks [other] to be the same emote but ignores [tone].
         */
        public fun isSimilar(other: Diverse?): Boolean = code == other?.code

        override fun toString(): String = unicode
    }

    /**
     * A generic emoji that does not support [SkinTones][SkinTone].
     */
    public data class Generic(override val unicode: String) : DiscordEmoji() {
        override fun toString(): String = unicode

        override fun hashCode(): Int = unicode.hashCode()

        override fun equals(other: Any?): Boolean {
            if (other !is Generic) return false

            return unicode == other.unicode
        }
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

internal fun String.toSkinTone(): SkinTone? = enumValues<SkinTone>().firstOrNull { this.endsWith(it.unicode) }

internal fun String.removeTone(): String = enumValues<SkinTone>().fold(this) { acc, skinTone ->
    acc.removeSuffix(skinTone.unicode)
}

