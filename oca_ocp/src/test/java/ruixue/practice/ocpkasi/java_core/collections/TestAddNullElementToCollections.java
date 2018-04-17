package ruixue.practice.ocpkasi.java_core.collections;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeMap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestAddNullElementToCollections {
	@Test
	public void testToTreeMap() {
		TreeMap<String,String> treeMap = new TreeMap<>();
		assertThrows(NullPointerException.class, () -> treeMap.put(null, "null value"));
		LinkedList<String> l = new LinkedList<>();
	}

	@Test
	public void testToArrayDeque() {
		ArrayDeque<String> arrayDeque = new ArrayDeque<>();
		assertThrows(NullPointerException.class, () -> arrayDeque.offer(null));
	}
	
	@Test
	public void testToLinkedList() {
		LinkedList<String> list = new LinkedList<>();
		assertTrue(list.offer(null));
	}
}
