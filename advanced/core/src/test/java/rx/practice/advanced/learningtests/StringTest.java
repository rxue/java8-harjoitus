package rx.practice.advanced.learningtests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringTest {
	private static class Address {
		private final String value;
		public Address(String value) {
			this.value  = value;
		}
		public String toString() {
			return value;
		}
	}
	@Test
	public void testSplitStringWithoutSeparator() {
		assertEquals(1, "hello".split(",").length);
	}

	@Test
	public void testReplace_multipleOccurrence() {
		String origin = "hello##_#";
		assertEquals("hello____", origin.replace("#","_"));
	}
	@Test
	public void testTrimWithReplaceAll() {
		String original = "hello this is like python";
		String underscored = "_" +original+ "_";
		assertEquals(original, underscored.replaceAll("^_|_$", ""));
		assertEquals(original, original.replaceAll("^_|_$", ""));
	}
	@Test
	public void testIntern() {
		String sentence = "Hello World";
		String newedSameSentence = new String("Hello World");
		assertNotSame(sentence,newedSameSentence);
		assertSame(sentence,newedSameSentence.intern());
	}

	/**
	 * Refer to Puzzle 13: Animal Farm in Java Puzzlers
	 */
	@Test
	public void testInternConcatValueFromFunctionCall() {
		Address address = new Address("Test");
		String pooled = "" + address.toString();
		assertNotSame(address.toString(), pooled);
		assertSame(address.toString(), pooled.intern());
	}

}