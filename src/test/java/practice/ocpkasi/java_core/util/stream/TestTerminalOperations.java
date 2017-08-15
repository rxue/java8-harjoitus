package practice.ocpkasi.java_core.util.stream;

import java.util.function.Predicate;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTerminalOperations {
	@Test
	public void testCallTerminalOperationTwice() {
		Predicate<? super String> predicate = s -> s.length() > 3;
		Stream<String> stream = Stream.iterate("-", (s) -> s + s);
		stream.noneMatch(predicate);
		assertThrows(IllegalStateException.class, () -> stream.anyMatch(predicate));
		
	}
}
