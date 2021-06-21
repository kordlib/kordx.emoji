package dev.kord.x.emoji

import dev.kord.core.behavior.MessageBehavior
import dev.kord.core.entity.ReactionEmoji

enum class SkinTone(val unicode: String) {
    Dark("\uD83C\uDFFF"),
    MediumDark("\uD83C\uDFFE"),
    Medium("\uD83C\uDFFD"),
    MediumLight("\uD83C\uDFFC"),
    Light("\uD83C\uDFFB"),
    Default("");

    companion object
}

/**
 * A Unicode emoji supported by Discord's client.
 */
sealed class DiscordEmoji {

    /**
     * The hex value of this emoji.
     */
    abstract val unicode: String

    /**
     * An emoji that supports [SkinTones][SkinTone].
     */
    data class Diverse(val code: String, val tone: SkinTone = SkinTone.Default) : DiscordEmoji() {
        fun withTone(tone: SkinTone): Diverse = copy(code = code, tone = tone)

        override val unicode: String
            get() = "$code${tone.unicode}"

        /**
         * Checks [other] to be the same emote but ignores [tone].
         */
        fun isSimilar(other: Diverse?): Boolean = code == other?.code

        override fun toString(): String = unicode
    }

    /**
     * An generic emoji that does not support [SkinTones][SkinTone].
     */
    data class Generic(override val unicode: String) : DiscordEmoji() {
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
suspend fun MessageBehavior.addReaction(emoji: DiscordEmoji) = addReaction(emoji.toReaction())

/**
 * Requests to delete all [emoji] reactions from this message.
 */
suspend fun MessageBehavior.deleteReaction(emoji: DiscordEmoji) = deleteReaction(emoji.toReaction())

/**
 * Requests to delete an emoji from this message made by this bot.
 */
suspend fun MessageBehavior.deleteOwnReaction(emoji: DiscordEmoji) = deleteOwnReaction(emoji.toReaction())

/**
 * Transforms the emoji into a [ReactionEmoji.Unicode] emoji.
 */
fun DiscordEmoji.toReaction() = ReactionEmoji.Unicode(unicode)
/**
 * transforms a [DiscordEmoji] into a reaction.
 *
 * @param emoji the emoji to transform into a reaction.
 */
fun ReactionEmoji.Companion.from(emoji: DiscordEmoji) = emoji.toReaction()

internal fun String.toSkinTone(): SkinTone? = SkinTone.values().firstOrNull { this.endsWith(it.unicode) }

internal fun String.removeTone(): String = SkinTone.values().fold(this) { acc, skinTone -> acc.removeSuffix(skinTone.unicode) }

