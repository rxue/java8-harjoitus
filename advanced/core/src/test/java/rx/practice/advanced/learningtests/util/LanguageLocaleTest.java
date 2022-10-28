package rx.practice.advanced.learningtests.util;

import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LanguageLocaleTest {
    @Test
    public void test_English() {
        Locale english = Locale.ENGLISH;
        assertEquals("en", english.getLanguage());
        assertEquals("en", english.toLanguageTag());
        assertEquals(Locale.forLanguageTag("en"), Locale.ENGLISH);
    }

    @Test
    public void test_simplifiedChinese() {
        Locale simplifiedChinese = Locale.SIMPLIFIED_CHINESE;
        assertEquals("zh", simplifiedChinese.getLanguage());
        assertEquals("zho", simplifiedChinese.getISO3Language());
        assertEquals("Chinese", simplifiedChinese.getDisplayLanguage());

        assertEquals("zh-CN", simplifiedChinese.toLanguageTag());
        assertEquals(Locale.forLanguageTag("zh-CN"), Locale.SIMPLIFIED_CHINESE);
    }

    @Test
    public void test_traditionalChinese() {
        Locale traditionalChinese = Locale.TRADITIONAL_CHINESE;
        assertEquals("zh", traditionalChinese.getLanguage());
        assertEquals("zho", traditionalChinese.getISO3Language());
        assertEquals("Chinese", traditionalChinese.getDisplayLanguage());

        assertEquals("zh-TW", traditionalChinese.toLanguageTag());
        assertEquals(Locale.forLanguageTag("zh-TW"), Locale.TRADITIONAL_CHINESE);

    }
}
