package rx.practice.ocpkasi.functional;

import java.util.Arrays;
import java.util.Collection;

class Cheater {
	int count = 0;
	public void sneak(Collection<String> coll) {
		coll.stream().peek(r -> { count++; System.out.println(r);}).findFirst();
	}
}

public class DemoEffectivelyFinalInLambda {

	public static void main(String[] args) {
		Cheater c = new Cheater();
		c.sneak(Arrays.asList("weasel"));
	}

}
