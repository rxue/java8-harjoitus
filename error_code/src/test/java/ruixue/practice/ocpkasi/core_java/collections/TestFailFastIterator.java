package ruixue.practice.ocpkasi.core_java.collections;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.Test;

public class TestFailFastIterator {
	
	/**
	 * If a thread modifies a collection directly while it is iterating over the collection with a fail-fast iterator, the iterator will throw this exception
	 */
	@Test
	public void testAddOnArrayListInForEachLoop() {
		List<String> list = new ArrayList<>();
		list.add("hello");
		list.add("world");
		list.add("jesus");
		assertThrows(ConcurrentModificationException.class, () -> {
			for (String current : list) {
				list.add(current);
				System.out.println("This text displays, meaning the root cause of ConcurrentModificationException is the Iterator rather than the modification on the collection");
			}
		});
	}
	@Test
	public void testAddOnArrayListDuringIteration() {
		List<String> list = new ArrayList<>();
		list.add("hello");
		list.add("world");
		Iterator<String> it = list.iterator();
		it.next();
		list.add("new element");
		assertThrows(ConcurrentModificationException.class, () -> {
			it.next();
		});
	}
	
	/**
	 * The update of data is on the existing fail-fast iterator of ArrayList is allowed. However, it is not recommended 
	 */
	@Test
	public void testSetOnArrayListDuringIteration() {
		List<String> list = new ArrayList<>();
		list.add("hello");
		list.add("world");
		int i = 0;
		for (String current : list) {
			String changedString = "changed";
			if (i == 0) list.set(i+1, changedString);
			if (i == 1) assertEquals(changedString, current);
			i++;
		}
	}
	
	@Test
	public void testAddOnSynchronizedCollectionInForEachLoop() {
		List<String> list = new ArrayList<>();
		list.add("hello");
		list.add("world");
		list.add("jesus");
		List<String> sList = Collections.synchronizedList(list);
		assertThrows(ConcurrentModificationException.class, () -> {
			for (String current : sList) {
				sList.add(current);
				System.out.println("This text displays, meaning the root cause of ConcurrentModificationException is the Iterator rather than the modification on the collection");
			}
		});
	}

}
