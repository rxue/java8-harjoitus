package rx.practice.ocpkasi.corejava.util;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ListResourceBundleTest {
	@Test
	public void testMissingResourceException() {
		String bundleName = "rx.practice.ocpkasi.corejava.util.HeaderListResourceBundle";
		ResourceBundle rb = ResourceBundle.getBundle(bundleName, Locale.US);
		assertEquals(bundleName, rb.getBaseBundleName());
		assertTrue(rb instanceof HeaderListResourceBundle_en_US);
		assertThrows(MissingResourceException.class, () -> rb.getString("navx"));
	}
	
	@Test
	public void testGetStringFromParentBundle() {
		String bundleName = "rx.practice.ocpkasi.corejava.util.HeaderListResourceBundle";
		ResourceBundle rb = ResourceBundle.getBundle(bundleName, Locale.US);
		assertEquals(bundleName, rb.getBaseBundleName());
		assertTrue(rb instanceof HeaderListResourceBundle_en_US);
		assertEquals("value", rb.getString("nav"));
	}
}