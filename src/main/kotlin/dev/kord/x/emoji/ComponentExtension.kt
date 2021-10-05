package dev.kord.x.emoji

import dev.kord.common.annotation.KordPreview
import dev.kord.common.entity.DiscordPartialEmoji
import dev.kord.rest.builder.component.ButtonBuilder

/**
 * Allows setting [ButtonBuilder.emoji] to a [DiscordEmoji].
 *
 * Example:
 * ```kotlin
 * interactionButton(ButtonStyle.Primary, "id") {
 *     discordEmoji = Emojis.checkMark
 * }
 * ```
 *
 * @see ButtonBuilder.emoji
 */
@KordPreview
var ButtonBuilder.discordEmoji: DiscordEmoji?
    get() = emoji?.name?.let { unicode ->
        Emojis[unicode]
    }
    set(value) {
        emoji = value?.let { DiscordPartialEmoji(name = it.unicode) }
    }
