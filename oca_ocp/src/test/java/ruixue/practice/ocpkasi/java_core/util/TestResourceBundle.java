package ruixue.practice.ocpkasi.java_core.util;

import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestResourceBundle {
	@Test
	public void testPropertyResourceBundle() {
		Locale.setDefault(new Locale("en"));
		ResourceBundle rb = ResourceBundle.getBundle("Buggy");
		assertTrue(rb instanceof PropertyResourceBundle);
		assertEquals(rb.getString("color"), "black");
		
	}
}