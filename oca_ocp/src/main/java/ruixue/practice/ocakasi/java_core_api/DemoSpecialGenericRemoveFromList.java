package ruixue.practice.ocakasi.java_core_api;

import java.util.List;
import java.util.ArrayList;

public class DemoSpecialGenericRemoveFromList {

	public static void main(String[] args) {
		List<Number> list = new ArrayList<>();
		list.add(10);
		list.add(10L);
		Object o = 10L;
		list.remove(o);
		System.out.println("Object o cannot be added directly to the list as its generic type is Number, but it can be removed as the remove method parameter is Object");
		System.out.println(list.size());
	}

}
