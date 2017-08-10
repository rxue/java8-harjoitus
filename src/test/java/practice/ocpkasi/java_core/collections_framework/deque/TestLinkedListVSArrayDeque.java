package practice.ocpkasi.java_core.collections_framework.deque;

import java.util.LinkedList;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class TestLinkedListVSArrayDeque {
	private Deque<String> linkedList;
	private Deque<String> arrayDeque;
	
	@BeforeEach
	public void initEach() {
		arrayDeque = new ArrayDeque<>(1);
		linkedList = new LinkedList<>();
	}
	
	@Test
	public void testAddNullElement() {
        linkedList.add(null);
        linkedList.offer(null);
		assertEquals(2, linkedList.size());
		assertThrows(NullPointerException.class, () -> arrayDeque.add(null));
		assertThrows(NullPointerException.class, () -> arrayDeque.offer(null));
	}
	@Test
	public void testRemoveFromEmptyDeque() {
		assertThrows(NoSuchElementException.class, () -> arrayDeque.remove());
        assertNull(arrayDeque.poll());	
    }
}
