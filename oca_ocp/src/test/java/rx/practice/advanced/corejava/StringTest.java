package rx.practice.advanced.corejava;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringTest {
	@Test
	public void testSplitStringWithoutSeparator() {
		assertEquals(1, "hello".split(",").length);
	}

}
