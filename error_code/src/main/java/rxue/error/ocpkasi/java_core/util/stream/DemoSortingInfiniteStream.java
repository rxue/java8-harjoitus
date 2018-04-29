package rxue.error.ocpkasi.java_core.stream;

import java.util.stream.Stream;

public class DemoSortingInfiniteStream {

	public static void main(String[] args) {
		Stream<Character> chars = Stream.generate(() -> 'a');
		chars.filter(c -> c < 'b')
			.sorted()
			.findFirst().ifPresent(System.out::print);

	}

}
