package rx.practice.advanced.designpatterns.structural.object.proxy;

import java.lang.reflect.Proxy;

public class ProxyUtil {

	private ProxyUtil() {}
	
	@SuppressWarnings("unchecked")
	public static <E extends T, T> T getProxy(E target, Class<T> subjectInterface) {
		return (T) Proxy.newProxyInstance(
				subjectInterface.getClassLoader(), 
				new Class<?>[] {subjectInterface}, new LoggerHandler(target));		
	}

}
