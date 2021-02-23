package rx.practice.advanced.learningtests.util;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ModificationOnIteratorTest {


    @Test
    public void testAddElementInWhileLoop() {
        List<String> collection = new ArrayList<>();
        collection.add("first");
        Iterator<String> iterator = collection.iterator();
        assertThrows(ConcurrentModificationException.class, () ->
            {
                while(iterator.hasNext()) {
                    String current = iterator.next();
                    if(current.equals("first"))
                        collection.add("second");
                }
            }
        );
    }

    @Test
    public void testRemoveAfterInvokingNext() {
        List<String> collection = new ArrayList<>();
        collection.add("first");
        Iterator<String> iterator = collection.iterator();
        while(iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        assertSame(0, collection.size());
    }

    @Test
    public void testRemoveWithouInvokingNext() {
        List<String> collection = new ArrayList<>();
        collection.add("first");
        Iterator<String> iterator = collection.iterator();
        assertThrows(IllegalStateException.class, () -> {
            while(iterator.hasNext())
                iterator.remove();
        });
    }
}
