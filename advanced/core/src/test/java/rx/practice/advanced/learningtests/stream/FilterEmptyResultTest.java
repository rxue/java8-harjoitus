package rx.practice.advanced.learningtests.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FilterEmptyResultTest {
    @Test
    public void testEmptyFilteredResult() {
        List<String> originalList = Arrays.asList("hello");
        List<String> result = originalList.stream().filter(s -> s.equals("world")).collect(toList());
        assertNotNull(result);
        assertEquals(0, result.size());
    }
}
