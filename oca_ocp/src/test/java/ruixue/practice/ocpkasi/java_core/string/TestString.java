package ruixue.practice.ocpkasi.java_core.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestString {
	private static final Logger logger = LogManager.getLogger(TestString.class);
	@Test
	public void testStringConcatenation() {
		String concatenatedWithPlusOperator = "hello" + " world";
		String concatenated = "hello".concat(" world");
		assertNotSame(concatenatedWithPlusOperator, concatenated);
		assertSame(concatenatedWithPlusOperator, concatenated.intern());
		logger.info("This test demonstrated that the concatenated result with plus operator is put into string pool whereas that with concat() method is not pool");

	}
	@Test
	public void testStaticFormat() {
		String str = String.format("%s", "Rui");
		assertEquals("Rui", str);
	}
	

}
