package rx.practice.ocpkasi.core_java.collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class MapComputeTest {
	
	@Test
	public void testComputeIfAbsent() {
		Map<String,String> map = new HashMap<>();
		String expectedValue = "random value";
		assertEquals(expectedValue, map.computeIfAbsent("test", e -> expectedValue));
	}

}
