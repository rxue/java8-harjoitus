package rx.practice.ocpkasi.functional_programming;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ListHandlerTest {
	@Test
	public void testGetSortedDistinctElements() {
		List<Integer> list = Arrays.asList(3, 2, 1, 5, 4, 4, 2);
		ListHandler listHandler = new ListHandler();
		assertEquals(Arrays.asList(1, 2, 3, 4, 5), listHandler.getSortedDistinctElements(list));
	}

}
