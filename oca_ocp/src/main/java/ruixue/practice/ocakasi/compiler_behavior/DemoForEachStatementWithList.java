package ruixue.practice.ocakasi.compiler_behavior;

import java.util.ArrayList;
import java.util.List;

public class DemoForEachStatementWithList {

	public static void main(String[] args) {
		List<String> values = new ArrayList<>();
		for (String value : values) 
			System.out.println(value);
	}

}
