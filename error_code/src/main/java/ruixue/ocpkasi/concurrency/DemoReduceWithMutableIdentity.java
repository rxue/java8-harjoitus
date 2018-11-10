package ruixue.ocpkasi.concurrency;

import java.util.Arrays;
import java.util.List;

public class DemoReduceWithMutableIdentity {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("1","2","3","4","5","6","7","8");
		StringBuilder result = list.parallelStream().reduce(new StringBuilder(), 
				(StringBuilder b, String s) -> {
					System.out.println("ACUMULATOR: current builder hashcode: " + b.hashCode() + ", current String to append: " + s);
					return b.append(s);
				}, 
				(StringBuilder b1, StringBuilder b2) -> {
					System.out.println("COMBINER b1 hashcode: " + b1.hashCode() + ", b2 hashcode: " + b2.hashCode());
					return b1.append(b2);
				});
		System.out.println(result.toString());

	}

}
