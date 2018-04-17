package ruixue.practice.ocpkasi.java_core.collections;

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
	public void testRemoveFirstElementFromEmptyDeque() {
		assertThrows(NoSuchElementException.class, () -> arrayDeque.remove());
		assertThrows(NoSuchElementException.class, () -> arrayDeque.pop());
		assertNull(arrayDeque.poll());
		assertThrows(NoSuchElementException.class, () -> linkedList.remove());
		assertThrows(NoSuchElementException.class, () -> linkedList.pop());
		assertNull(linkedList.poll());
    }
	@Test 
	public void testGetFirstElementFromEmptyDeque() {
		assertThrows(NoSuchElementException.class, () -> arrayDeque.element());
		assertNull(arrayDeque.peek());
		assertThrows(NoSuchElementException.class, () -> linkedList.element());
		assertNull(linkedList.peek());
	}
	@Test
	public void testArrayDequeAsStack() {
		assertTrue(arrayDeque.isEmpty());
		arrayDeque.push("hello");
		arrayDeque.push("world");
		assertEquals("world", arrayDeque.pop());
	}
}
