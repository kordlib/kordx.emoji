import dev.kord.x.emoji.DiscordEmoji
import dev.kord.x.emoji.Emojis
import dev.kord.x.emoji.SkinTone
import kotlin.test.Test
import kotlin.test.assertEquals

class EmojiTest {
    @Test
    fun `emoji lookup handles skin tones`() {
        val expected = Emojis.man.withTone(SkinTone.Dark)
        val actual = Emojis[expected.unicode]

        assertEquals(expected = expected, actual = actual)
    }

    @Test
    fun `equals on generic emote`() {
        val emote = Emojis.`100`
        val emote2 = Emojis[emote.unicode]

        assertEquals(emote, emote2)
        assertEquals(emote2, emote)
    }

    @Test
    fun `equals on diverse emote`() {
        val emote = Emojis.`+1`
        val emote2 = Emojis[emote.unicode]
        require(emote2 is DiscordEmoji.Diverse)

        assertEquals(emote, emote2)
        assertEquals(emote2, emote)
        val emote3 = emote.withTone(SkinTone.Dark)
        assert(emote.isSimilar(emote3))
    }
}

