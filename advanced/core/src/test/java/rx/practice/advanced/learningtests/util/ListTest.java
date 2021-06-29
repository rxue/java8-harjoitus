package rx.practice.advanced.learningtests.util;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ListTest {
    @Test
    public void addNull() {
        List<String> list = new ArrayList<>();
        assertTrue(list.add(null));
        assertTrue(list.add(null));
        assertTrue(list.size() == 2);
    }
}
