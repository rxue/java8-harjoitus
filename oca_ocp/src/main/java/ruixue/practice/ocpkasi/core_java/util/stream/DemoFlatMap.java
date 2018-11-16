package ruixue.practice.ocpkasi.core_java.util.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoFlatMap {

	public static void demo() {
		List<Integer> numbers2 = Arrays.asList(3, 4);
		Stream.of(1,2,3)
				.flatMap(x -> numbers2.stream()
						.map(y -> new int[]{x,y})
				).forEach(e -> System.out.println("(" + e[0] + "," + e[1] + ")"));
	}

	public static void main(String[] args) {
		demo();
	}

}
//TODO Auto-// TODO Auto-generated method stubgenerated method stub