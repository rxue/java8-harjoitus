package rx.practice.ocpkasi.core_java.util.stream;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FlatMapTest {

	@Test
	public void testFlattenParallelStreamsAlwaysReturnSequentialStream() {
		Stream<String> s1 = Stream.of("Hello", "world").parallel();
		Stream<String> s2 = Stream.of("This", "is", "Java").parallel();
		Stream<String> flattenStream = Stream.of(s1, s2).flatMap(s -> s);
		assertFalse(flattenStream.isParallel());
	}

}
