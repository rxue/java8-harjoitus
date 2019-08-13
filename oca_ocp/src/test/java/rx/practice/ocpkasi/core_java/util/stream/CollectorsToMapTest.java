package rx.practice.ocpkasi.core_java.util.stream;

import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CollectorsToMapTest {
	@Test
	public void testToMapWithCollision() {
		Stream<String> stream = Stream.of("one", "two", "three");
		Collector<String, ?, Map<Integer,String>> collector = Collectors.toMap(String::length, s->s);
		assertThrows(IllegalStateException.class, () -> stream.collect(collector));
	}
	
	@Test
	public void testToMapWithMergeFunction() {
		Stream<String> stream = Stream.of("one", "two", "three");
		Collector<String, ?, Map<Integer,String>> collector = Collectors.toMap(String::length, s->s, (s1,s2) -> s1+ "," + s2);
		Map<Integer,String> m = stream.collect(collector);
		assertEquals("one,two", m.get(3));
	}

}
