package rx.practice.ocakasi.compiler_behavior;

import java.util.ArrayList;
import java.util.List;

public class DemoNormalForStatementWithList {

	public static void main(String[] args) {
		List<String> values = new ArrayList<>();
		for (java.util.Iterator<String> i = values.iterator(); i.hasNext(); ) {
			String value = i.next();
			System.out.println(value);
		}

	}

}
