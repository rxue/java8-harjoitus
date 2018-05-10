package ruixue.ocpkasi.core_java.util.stream;

import java.util.Arrays;
import java.util.Collection;

public class DemoBadPeekPractice {
	int count = 0;
	public void sneak(Collection<String> coll) {
		coll.stream().peek(r -> {count++; System.out.println(r);}).findFirst();
	}

	public static void main(String[] args) {
		DemoBadPeekPractice c = new DemoBadPeekPractice();
		c.sneak(Arrays.asList("weasel"));
	}

}
