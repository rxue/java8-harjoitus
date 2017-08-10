package practice.ocpkasi.java_core.collections_framework.deque;

import java.util.LinkedList;

import java.util.ArrayDeque;
import java.util.Deque;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestLinkedListVSArrayDeque {
	
	@Test
	public void testInsertNullElementToLinkedList() {
		Deque<String> deque = new LinkedList<>();
        deque.add(null);
		assertFalse(deque.isEmpty());
	}
	
	@Test
	public void testInsertNullElementToArrayDeque() {
		Deque<String> deque = new ArrayDeque<>();
		assertThrows(NullPointerException.class, () -> deque.add(null));
	}

}
