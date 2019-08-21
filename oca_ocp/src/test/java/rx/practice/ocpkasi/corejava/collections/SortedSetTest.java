package rx.practice.ocpkasi.corejava.collections;

import org.junit.jupiter.api.Test;

import java.util.SortedSet;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortedSetTest {
    @Test
    public void testTreeSet() {
        SortedSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("C");
        set.add("B");
        assertEquals("C", set.last());
    }
}
