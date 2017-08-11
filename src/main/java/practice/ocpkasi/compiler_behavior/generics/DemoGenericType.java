package practice.ocpkasi.compiler_behavior.generics;

import java.util.ArrayList;
import java.util.List;

public class DemoGenericType {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("String");
		String s = list.get(0);
	}
}
