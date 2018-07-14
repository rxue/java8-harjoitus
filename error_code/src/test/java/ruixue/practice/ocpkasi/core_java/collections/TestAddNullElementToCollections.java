package ruixue.practice.ocpkasi.core_java.collections;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestAddNullElementToCollections {
	@Test
	public void testToTreeMap() {
		TreeMap<String,String> treeMap = new TreeMap<>();
		assertThrows(NullPointerException.class, () -> treeMap.put(null, "null value"));
	}

	@Test
	public void testAddNullToArrayDeque() {
		ArrayDeque<String> arrayDeque = new ArrayDeque<>();
		assertThrows(NullPointerException.class, () -> arrayDeque.add(null));
		assertThrows(NullPointerException.class, () -> arrayDeque.offer(null));
	}
	
	@Test
	public void testAddNullToLinkedList() {
		LinkedList<String> list = new LinkedList<>();
		assertTrue(list.offer(null));
	}
	
	@Test
	public void testAddNullToConcurrentHashMap() {
		ConcurrentHashMap<String,String> concurrentHashMap = new ConcurrentHashMap<>();
		assertThrows(NullPointerException.class, () -> concurrentHashMap.put(null, "value of a null key"));
		assertThrows(NullPointerException.class, () -> concurrentHashMap.put("key of a null value", null));
	}
}
