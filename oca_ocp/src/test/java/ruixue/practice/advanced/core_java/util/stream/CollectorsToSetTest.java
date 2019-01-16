package ruixue.practice.advanced.core_java.util.stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class CollectorsToSetTest {
	/**
	 * collect(Collectors.toSet()) returns a HashSet by default
	 */
	@Test
	public void testToSetReturnHashSet() {
		List<String> list = Arrays.asList("one", "two", "one", "three");
		Set<String> set = list.stream().collect(Collectors.toSet());
		assertTrue(set instanceof HashSet);
	}

}
