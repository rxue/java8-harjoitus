package ruixue.practice.ocpkasi.core_java.collections;

import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ModificationOnIteratorTest {
	
	@Test
	public void testInsertToSkipListDuringIteration() {
		Set<String> list = new ConcurrentSkipListSet<>();
		String one = "one";
		String two = "two";
		list.add(one);
		list.add(two);
		for (String e : list) {
			System.out.println("in loop");
			if (e.equals(one))
				list.remove(two);
		}
		assertEquals(1, list.size());
	}

}
