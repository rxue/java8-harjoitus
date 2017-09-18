package ruixue.practice.creating_objects.static_factory_method;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class TestPrimitiveTypeWrapper {

	@Test
	@DisplayName("Test the Boolean objects instantiated differently")
	public void testBoolean() {
		Boolean b1 = Boolean.valueOf(true);
		Boolean b2 = Boolean.valueOf(true);
		assertSame(b1, b2);
		Boolean b3 = new Boolean(true);
		Boolean b4 = new Boolean(true);
		assertNotSame(b1, b3);
		assertNotSame(b3, b4);
	}
	@Test
	@DisplayName("Test the Byte objects instantiated differently")
	public void testByte() {
		Byte b3 = Byte.valueOf((byte)120);
		Byte b4 = Byte.valueOf((byte)120);
		assertSame(b4, b3);
		Byte b1 = new Byte((byte)120);
		Byte b2 = new Byte((byte)120);
		assertNotSame(b1, b2);
	}
	
	@Test
	@DisplayName("Test the Integer objects instantiated differently")
	public void testInteger() {
		Integer i1 = Integer.valueOf(10);
		Integer i2 = Integer.valueOf(10);
		assertSame(i1, i2);
		Integer i3 = new Integer(10);
		Integer i4 = new Integer(10);
		assertNotSame(i3, i4);

	}
}
