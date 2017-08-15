package practice.ocpkasi.java_core.util.stream;

import java.util.function.Predicate;
import java.util.stream.Stream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestTerminalOperations {
	private static final Logger logger = LogManager.getLogger(TestTerminalOperations.class);
	@Test
	public void testCallTerminalOperationTwice() {
		Predicate<? super String> predicate = s -> s.length() > 3;
		Stream<String> stream = Stream.iterate("-", (s) -> s + s);
		stream.noneMatch(predicate);
		logger.info("The stream is no longer valid after a terminal operation completes");
		assertThrows(IllegalStateException.class, () -> stream.anyMatch(predicate));
		
	}
}
