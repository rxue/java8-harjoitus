package ruixue.practice.ocpkasi.functional_programming;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathTest {
	@Test
	public void testPowPositive() {
		assertEquals(MyMath.pow(3, 20), Math.pow(3, 20), 0.01);
		assertEquals(MyMath.pow(-3, 19), Math.pow(-3, 19), 0.01);
	}
	
	@Test
	public void testPowNegative() {
		assertEquals(MyMath.pow(3, -20), Math.pow(3, -20), 0.01);
		assertEquals(MyMath.pow(-3, -19), Math.pow(-3, -19), 0.01);
	}
	
	@Test
	public void testPowZero() {
		assertEquals(MyMath.pow(3, 0), Math.pow(3, 0), 0.01);
		assertEquals(MyMath.pow(0, 10), Math.pow(0, 10), 0.01);
	}
}
