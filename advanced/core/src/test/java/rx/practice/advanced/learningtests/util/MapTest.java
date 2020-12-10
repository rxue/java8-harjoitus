package rx.practice.advanced.learningtests.util;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MapTest {
    @Test
    public void testReplace() {
        Map<String,String> map = new HashMap<>();
        map.put("one", "yksi");
        String targetKey = "two";
        map.put(targetKey, "kaksi");
        map.replace(targetKey, "two");
        assertEquals("two", map.get(targetKey));
    }
    @Test
    public void testGetOrDefault_withExistingMappedValueAsNull() {
        Map<String,String> map = new HashMap<>();
        String key = "key";
        map.put(key, null);
        assertNull(map.getOrDefault(key, "hello"));
    }
    @Test
    public void testGetOrDefault_withoutExistingMappedValue() {
        Map<String,String> map = new HashMap<>();
        String key = "key";
        String defaultValue = "default value";
        assertEquals(map.getOrDefault(key, defaultValue), defaultValue);
    }
}
