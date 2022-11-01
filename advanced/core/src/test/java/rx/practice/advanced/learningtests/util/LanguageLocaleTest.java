package rx.practice.advanced.learningtests.util;

import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

public class LanguageLocaleTest {
    @Test
    public void test_English() {
        Locale english = Locale.ENGLISH;
        assertEquals("en", english.getLanguage());
        assertEquals("en", english.toLanguageTag());
        assertSame(Locale.ENGLISH, Locale.forLanguageTag("en"));
    }
    @Test
    public void test_EnglishUS() {
        Locale englishUS = Locale.US;
        assertEquals("en", englishUS.getLanguage());
        assertEquals("en-US", englishUS.toLanguageTag());
        assertSame(Locale.US, Locale.forLanguageTag("en-US"));
    }

    @Test
    public void test_simplifiedChinese() {
        Locale simplifiedChinese = Locale.SIMPLIFIED_CHINESE;
        assertEquals("zh", simplifiedChinese.getLanguage());
        assertEquals("zho", simplifiedChinese.getISO3Language());
        assertEquals("Chinese", simplifiedChinese.getDisplayLanguage());

        assertEquals("zh-CN", simplifiedChinese.toLanguageTag());
        assertSame(Locale.SIMPLIFIED_CHINESE, Locale.forLanguageTag("zh-CN"));
        assertNotEquals(Locale.SIMPLIFIED_CHINESE, new Locale("zh-CN"));

    }

    @Test
    public void test_traditionalChinese() {
        Locale traditionalChinese = Locale.TRADITIONAL_CHINESE;
        assertEquals("zh", traditionalChinese.getLanguage());
        assertEquals("zho", traditionalChinese.getISO3Language());
        assertEquals("Chinese", traditionalChinese.getDisplayLanguage());

        assertEquals("zh-TW", traditionalChinese.toLanguageTag());
        assertSame(Locale.TRADITIONAL_CHINESE, Locale.forLanguageTag("zh-TW"));

    }

    @Test
    public void test_Finnish() {
        Locale finnish = Locale.forLanguageTag("fi");
        assertEquals(finnish, new Locale("fi"));
    }
}
