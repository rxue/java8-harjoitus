package ruixue.practice.advanced;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Parent {
	protected int x;
	
	public Parent() {
		x = 10;
	}
	public int dynamicBinding() {
		return 1;
	}
}

class Child extends Parent {
	protected int x;
	public Child() {
		x = 100;
	}
	@Override
	public int dynamicBinding() {
		return 2;
	}
}

public class TestBinding {
	@Test
	public void testStaticBinding() {
		Parent p = new Child();
		assertEquals(10, p.x);
		Child c = new Child();
		assertEquals(100, c.x);
	}
	
	@Test
	public void testDynamicBinding() {
		Parent p = new Child();
		assertEquals(2, p.dynamicBinding());
		Child c = new Child();
		assertEquals(2, c.dynamicBinding());
	}

}
