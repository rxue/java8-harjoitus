package rx.practice.ocpkasi.core_java.util;

import java.util.Locale;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LocaleTest {
	@Test
	public void testLocale() {
		Locale locale = new Locale.Builder().setLanguage("fi").build();
		assertEquals(new Locale("fi"), locale);
	}
}