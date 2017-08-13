package practice.ocpkasi.java_core.util.stream;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestReduce {
	@Test
	public void testReduce() {
		Stream<CharSequence> stream = Stream.of("w", "o", "l", "f");
		StringBuilder sb = new StringBuilder();
		stream.reduce(sb, (s1, s2) -> ((StringBuilder)s1).append(s2));
		assertEquals("wolf", sb.toString());
	}
}