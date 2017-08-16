package practice.ocpkasi.java_core.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestStringConcatenation {
	private static final Logger logger = LogManager.getLogger(TestStringConcatenation.class);
	@Test
	public void testStringConcatenation() {
		String concatenatedWithPlusOperator = "hello" + " world";
		String concatenated = "hello".concat(" world");
		assertNotSame(concatenatedWithPlusOperator, concatenated);
		assertSame(concatenatedWithPlusOperator, concatenated.intern());
		logger.info("This test demonstrated that the concatenated result with plus operator is put into string pool whereas that with concat() method is not pool");

	}

}
