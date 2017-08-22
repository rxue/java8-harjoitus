package practice.ocpkasi.exceptions;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.ConcurrentModificationException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import practice.ocpkasi.java_core.string.TestStringConcatenation;

public class TestConcurrentModificationException {
	private static final Logger logger = LogManager.getLogger(TestStringConcatenation.class);
	@Test
	public void testConcurrentModificationException() {
		List<String> list = new ArrayList<>();
		list.add("hello");
		list.add("world");
		list.add("jesus");
		assertThrows(ConcurrentModificationException.class, () -> {
			for (String current : list)
				list.add(current);
		});
		logger.info("Exception came from the line, where the for loop is!");
	}
}
