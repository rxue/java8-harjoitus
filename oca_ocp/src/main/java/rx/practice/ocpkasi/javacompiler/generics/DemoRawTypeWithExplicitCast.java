package rx.practice.ocpkasi.javacompiler.generics;

import java.util.ArrayList;
import java.util.List;

public class DemoRawTypeWithExplicitCast {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("String");
		String s = (String) list.get(0);
	}

}
