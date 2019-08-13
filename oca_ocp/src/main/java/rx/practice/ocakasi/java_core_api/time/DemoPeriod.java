package rx.practice.ocakasi.java_core_api.time;

import java.time.Period;

public class DemoPeriod {

	public static void main(String[] args) {
		Period wrong = Period.ofYears(1).ofWeeks(1);
		System.out.println(wrong.getDays());
		System.out.println("Warning! Static method should be accessed in a tatic way");
	}

}
