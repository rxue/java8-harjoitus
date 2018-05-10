package ruixue.practice.ocpkasi.core_java.util.stream;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPrimitiveStream {
	
	@Test
	public void testIntStream() {
		IntStream stream = IntStream.empty();
		OptionalDouble avg = stream.average();
		assertEquals(Double.NaN, avg.orElseGet(() -> Double.NaN));
	}

}
