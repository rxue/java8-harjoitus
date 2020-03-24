package rx.practice.advanced.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringTest {
	@Test
	public void testSplitStringWithoutSeparator() {
		assertEquals(1, "hello".split(",").length);
	}

	@Test
	public void testReplace_multipleOccurrence() {
		String origin = "hello##_#";
		assertEquals("hello____", origin.replace("#","_"));
	}
}