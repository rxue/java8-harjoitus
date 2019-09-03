package rx.practice.advanced.designpatterns.structural.object.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggerHandler implements InvocationHandler {
	private Object target;
	public LoggerHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		String methodName = method.getName();
		System.out.println("Method " + methodName + " is called");
		return method.invoke(target, args);
	}

}
