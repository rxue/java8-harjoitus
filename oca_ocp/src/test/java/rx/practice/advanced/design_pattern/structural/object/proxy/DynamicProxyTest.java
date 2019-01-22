package rx.practice.advanced.design_pattern.structural.object.proxy;

import java.lang.reflect.Proxy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DynamicProxyTest {

	@Test
	public void testProxy() {
		RealSubject realSubject = new RealSubject();
		Class<Subject> subjectClass = Subject.class;
		Subject subjectProxy = (Subject) Proxy.newProxyInstance(
				subjectClass.getClassLoader(), 
				new Class<?>[] {subjectClass}, new LoggerHandler(realSubject));
		Integer income = subjectProxy.calculateIncome();
		assertEquals(new Integer(1000), income);
	}

}
