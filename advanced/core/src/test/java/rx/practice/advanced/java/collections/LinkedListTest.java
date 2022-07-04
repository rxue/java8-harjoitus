package rx.practice.advanced.java.collections;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListTest {
    /**
     * LinkedList accept null elements
     */
    @Test
    public void addNullElement() {
        LinkedList<Object> linkedList = new LinkedList<>();
        assertTrue(linkedList.add(null));
        assertEquals(1, linkedList.size());
    }

    @Test
    public void removeNullElement() {
        LinkedList<Object> linkedList = new LinkedList<>();
        assertTrue(linkedList.add(null));
        assertTrue(linkedList.add(new Object()));
        assertEquals(2, linkedList.size());
        assertEquals(null, linkedList.remove());
        assertEquals(1, linkedList.size());
    }

    /**
     * NOTE!
     */
    @Test
    public void peekNullElement() {
        LinkedList<Object> linkedList = new LinkedList<>();
        assertEquals(null, linkedList.peek());
        assertTrue(linkedList.add(null));
        assertEquals(null, linkedList.peek());
    }
}
