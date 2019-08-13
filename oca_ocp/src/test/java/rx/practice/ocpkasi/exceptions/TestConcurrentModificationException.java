package rx.practice.ocpkasi.exceptions;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.ConcurrentModificationException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

public class TestConcurrentModificationException {
	private static final Logger logger = LogManager.getLogger(TestConcurrentModificationException.class);
	@Test
	public void testConcurrentModificationException() {
		List<String> list = new ArrayList<>();
		list.add("hello");
		list.add("world");
		list.add("jesus");
		assertThrows(ConcurrentModificationException.class, () -> {
			for (String current : list)
				list.add(current);
		});
		logger.info("Exception came from the line, where the for loop is!");
	}
	
	@Test
	public void testConcurrentModificationExceptionOnSynchronizedCollection() {
		List<String> list = new ArrayList<>();
		list.add("hello");
		list.add("world");
		list.add("jesus");
		List<String> synchronizedList = Collections.synchronizedList(list);
		assertThrows(ConcurrentModificationException.class, () -> {
			for (String current : synchronizedList)
				synchronizedList.add(current);
		});
		logger.info("Exception came from the line, where the for loop is!");
	}
	
	@Test
	public void testConcurrentModificationExceptionOnOldVector() {
		Vector<String> vector = new Vector<>();
		vector.add("hello");
		vector.add("world");
		vector.add("jesus");
		assertThrows(ConcurrentModificationException.class, () -> {
			for (String current : vector)
				vector.add(current);
		});
		logger.info("Exception came from the line, where the for loop is!");
	}
	
	@Test
	public void testConcurrentModificationExceptionOnModification() {
		ArrayList<String> list = new ArrayList<>();
		list.add("hello");
		list.add("world");
		int i = 0;
		for (String current : list) {
			if (i == 0) list.set(++i, "new value");
			System.out.println(current);
		}
	}
}
