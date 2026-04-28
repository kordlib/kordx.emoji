import dev.kord.x.emoji.DiscordEmoji
import dev.kord.x.emoji.Emojis
import dev.kord.x.emoji.SkinTone
import kotlin.js.JsName
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class EmojiTest {
    @Test
    @JsName("test1")
    fun `emoji lookup handles skin tones`() {
        val expected = Emojis.man.with(tone = SkinTone.Dark)
        val actual = DiscordEmoji.findByUnicodeOrNull(expected.unicode)

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    @JsName("test2")
    fun `equals on generic emote`() {
        val emote = Emojis.`100`
        val emote2 = DiscordEmoji.findByUnicodeOrNull(emote.unicode)

        assertEquals(emote, emote2)
        assertEquals(emote2, emote)
    }

    @Test
    @JsName("test3")
    fun `equals on diverse emote`() {
        val emote = Emojis.thumbsup
        val emote2 = DiscordEmoji.findByUnicodeOrNull(emote.unicode)
        require(emote2 is DiscordEmoji.EmojiWithSkinTone)

        assertEquals(emote, emote2)
        assertEquals(emote2, emote)
        val emote3 = emote.withSkinTone(tone = SkinTone.Dark)
        assertTrue(emote.isSimilar(emote3))
    }
}

