package ruixue.practice.ocpkasi.core_java.util;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ListResourceBundleTest {
	@Test
	public void testMissingResourceException() {
		String bundleName = "ruixue.practice.ocpkasi.core_java.util.HeaderListResourceBundle";
		ResourceBundle rb = ResourceBundle.getBundle(bundleName, Locale.US);
		assertTrue(rb instanceof ListResourceBundle);
		assertEquals(bundleName, rb.getBaseBundleName());
		assertThrows(MissingResourceException.class, () -> rb.getString("nav2"));
		assertThrows(MissingResourceException.class, () -> rb.getString("nav1"));
	}
}