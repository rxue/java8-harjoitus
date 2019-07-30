package rx.practice.advanced.design_pattern.structural.object.proxy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DynamicProxyTest {

	@Test
	public void testProxy() {
		Subject subjectProxy = ProxyUtil.getProxy(new RealSubject(), Subject.class);
		Integer income = subjectProxy.calculateIncome();
		assertEquals(new Integer(1000), income);
	}

}
