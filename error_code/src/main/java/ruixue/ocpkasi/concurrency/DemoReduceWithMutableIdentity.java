package ruixue.ocpkasi.concurrency;

import java.util.Arrays;
import java.util.List;

public class DemoReduceWithMutableIdentity {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("1","2","3","4","5","6","7","8");
		StringBuilder result = list.parallelStream().reduce(new StringBuilder(), 
				(StringBuilder b, String s) -> {
					Thread t = Thread.currentThread();
					System.out.println("ACUMULATOR in thread " + t + " with ID " + t.getId() + "\n"
							+ "\tCurrent builder has String - \"" + b.toString() + "\"\n with hash code " + b.hashCode() + "\n"
							+ "\tCurrent String to append is " + s + "\n");
					return b.append(s);
				}, 
				(StringBuilder b1, StringBuilder b2) -> {
					Thread t = Thread.currentThread();
					System.out.println("COMBINER in thread " + t + " with ID " + t.getId() + "\n"
							+ "\tb1 has String - \"" + b1.toString() + "\" with hash code " + b1.hashCode() + "\n"
							+ "\tb2 has String - \"" + b2.toString() + "\" with hash code " + b2.hashCode() + "\n");
					return b1.append(b2);
				});
		System.out.println(result.toString());

	}

}
