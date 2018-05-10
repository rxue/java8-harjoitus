package ruixue.practice.ocpkasi.core_java.util;

import java.util.ListResourceBundle;
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
	@Test
	public void testListResourceBundle() {
		ResourceBundle rb = ResourceBundle.getBundle("ruixue.practice.ocpkasi.java_core.util.ClassResource");
		assertTrue(rb instanceof ListResourceBundle);
	}
}