import com.gitlab.kordlib.kordx.emoji.Emojis
import com.gitlab.kordlib.kordx.emoji.SkinTone
import org.junit.Test
import kotlin.test.assertEquals


class EmojiTest {

    @Test
    fun `emoji lookup handles skin tones`() {
        val expected = Emojis.man.withTone(SkinTone.Dark)

        val actual = Emojis[expected.unicode]

        assertEquals(expected = expected, actual = actual)
    }

}