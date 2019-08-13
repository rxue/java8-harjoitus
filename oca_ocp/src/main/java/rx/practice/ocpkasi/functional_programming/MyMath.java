package rx.practice.ocpkasi.functional_programming;
import java.util.stream.LongStream;
public class MyMath {
	
	public static double pow(int root, int e) {
		return LongStream.generate(() -> root)
			.limit(e >= 0 ? e : -e)
			.reduce(1, (r, x) -> e >= 0 ? r*x : r * (1/x));
	}

}
