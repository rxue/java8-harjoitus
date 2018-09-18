package ruixue.practice.ocpkasi.core_java.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;

public class OptionalTest {
	@Test
	public void testGetRepeatedly() {
		Optional<String> opt = Optional.of("test");
		assertEquals("test",opt.get());
		assertEquals("test",opt.get());
		assertEquals("test",opt.get());
	}
	
	public void testZeroLengthStringOptional() {
		Optional<String> opt = Optional.of("");
		assertTrue(opt.isPresent());
	}

}
