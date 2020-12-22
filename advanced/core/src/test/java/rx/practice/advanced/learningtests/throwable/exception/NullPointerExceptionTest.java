package rx.practice.advanced.learningtests.throwable.exception;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class NullPointerExceptionTest {
    @Test
    public void testNaturalOrderingOnCollectionsWithBoxedPrimitives() {
        List<Integer> integers = Arrays.asList(2, 1, null);
        assertThrows(NullPointerException.class, () -> integers.sort(Comparator.naturalOrder()));
    }
}
