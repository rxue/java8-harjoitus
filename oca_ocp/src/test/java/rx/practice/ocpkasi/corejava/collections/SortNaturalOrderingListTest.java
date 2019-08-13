package rx.practice.ocpkasi.corejava.collections;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class SortNaturalOrderingListTest {
	@Test
	public void testListWithNullElement() {
		List<Integer> list = Arrays.asList(1, null, 2);
		assertThrows(NullPointerException.class, () -> Collections.sort(list));
	}

}
