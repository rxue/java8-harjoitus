package rx.practice.ocpkasi.core_java.util;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PropertyResourceBundleTest {
	@Test
	public void testMissingResourceException() {
		String bundleName = "PropertyResourceBundle";
		ResourceBundle rb = ResourceBundle.getBundle(bundleName, Locale.US);
		assertEquals(bundleName, rb.getBaseBundleName());
		assertTrue(rb instanceof PropertyResourceBundle);
		assertThrows(MissingResourceException.class, () -> rb.getString("none"));
	}
	
	@Test
	public void testGetString() {
		String bundleName = "PropertyResourceBundle";
		ResourceBundle rb = ResourceBundle.getBundle(bundleName, Locale.US);
		assertEquals(bundleName, rb.getBaseBundleName());
		assertTrue(rb instanceof PropertyResourceBundle);
		assertEquals("black", rb.getString("color"));
		assertEquals("I am the default value", rb.getString("default_val"));
	}
}