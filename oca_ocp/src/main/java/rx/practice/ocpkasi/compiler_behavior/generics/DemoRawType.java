package rx.practice.ocpkasi.compiler_behavior.generics;

import java.util.ArrayList;
import java.util.List;

public class DemoRawType {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("String");
		Object s = list.get(0);
	}

}
