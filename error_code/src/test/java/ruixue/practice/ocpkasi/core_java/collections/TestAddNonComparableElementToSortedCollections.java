package ruixue.practice.ocpkasi.core_java.collections;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

public class TestAddNonComparableElementToSortedCollections {
	@Test
	public void testAddObjectToTreeSet() {
		Set<Object> set = new TreeSet<>();
		assertThrows(ClassCastException.class, () -> set.add(new Object()));
	}

}
