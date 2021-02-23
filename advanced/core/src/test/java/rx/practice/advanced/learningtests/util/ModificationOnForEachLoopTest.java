package rx.practice.advanced.learningtests.util;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ModificationOnForEachLoopTest {
    @Test
    public void testAddInForEach() {
        List<String> collection = new ArrayList<>();
        collection.add("first");
        assertThrows(ConcurrentModificationException.class, () -> {
            for (String current : collection) {
                collection.add("another");
            }
        });
    }

    @Test
    public void testRemoveInForEach() {
        List<String> collection = new ArrayList<>();
        collection.add("first");
        assertThrows(ConcurrentModificationException.class, () -> {
            for (String current : collection) {
                collection.remove("first");
            }
        });
    }

    @Test
    public void testUpdateExistingElementInForEach() {
        List<String> collection = new ArrayList<>();
        collection.add("first");
        String expected = "expected";
        for (String current : collection)
            collection.set(0, expected);
        assertEquals(expected, collection.get(0));
    }
}
