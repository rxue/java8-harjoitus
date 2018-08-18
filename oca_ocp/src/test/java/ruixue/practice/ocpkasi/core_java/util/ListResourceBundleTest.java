package ruixue.practice.ocpkasi.core_java.util;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ListResourceBundleTest {
	@Test
	public void testMissingResourceException() {
		String bundleName = "ruixue.practice.ocpkasi.core_java.util.HeaderListResourceBundle";
		ResourceBundle rb = ResourceBundle.getBundle(bundleName, Locale.US);
		assertEquals(bundleName, rb.getBaseBundleName());
		assertTrue(rb instanceof HeaderListResourceBundle_en);
		assertThrows(MissingResourceException.class, () -> rb.getString("nav1"));
	}
	
	@Test
	public void testGetString() {
		String bundleName = "ruixue.practice.ocpkasi.core_java.util.HeaderListResourceBundle";
		ResourceBundle rb = ResourceBundle.getBundle(bundleName, Locale.US);
		assertEquals(bundleName, rb.getBaseBundleName());
		assertTrue(rb instanceof HeaderListResourceBundle_en);
		assertEquals("value", rb.getString("nav"));
	}
}