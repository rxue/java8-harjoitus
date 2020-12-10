package rx.practice.advanced.learningtests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClassTest {
    @Test
    public void testIsInstance() {
        String one = "hello";
        assertTrue(String.class.isInstance(one));
    }
}
