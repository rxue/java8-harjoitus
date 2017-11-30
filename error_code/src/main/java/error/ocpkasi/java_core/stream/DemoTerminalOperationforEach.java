package error.ocpkasi.java_core.stream;

import java.util.List;
import java.util.stream.Stream;
import java.util.LinkedList;

public class DemoTerminalOperationforEach {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("Archie");
		list.add("X-Men");
		
		Stream<String> s = list.stream();
		s.forEach(System.out::println);
		s.forEach(System.out::println);
	}

}
