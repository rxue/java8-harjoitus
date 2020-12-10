package rx.practice.advanced.learningtests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemainderTest {
    @Test
    public void testDoubleRemainderSharp() {
        double doubleValue = 5.5;
        assertEquals(0.5, doubleValue % 1);
    }
    @Test
    public void testDoubleRemainder() {
        double doubleValue = 5.55;
        assertEquals(0.55, doubleValue % 1, 0.01);
    }
    @Test
    public void testFloatRemainderSharp() {
        float floatValue = 5.5f;
        assertEquals( 0.5, floatValue % 1);
    }
    @Test
    public void testFloatRemainder() {
        float floatValue = 5.4f;
        assertEquals( 0.4, floatValue % 1, 0.01);
    }
}
