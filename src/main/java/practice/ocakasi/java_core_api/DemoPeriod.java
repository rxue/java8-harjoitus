package practice.ocakasi.java_core_api;

import java.time.Period;

public class DemoPeriod {

	public static void main(String[] args) {
		Period wrong = Period.ofYears(1).ofWeeks(1);
		System.out.println(wrong.getDays());
		String s = "";
		System.out.println(s.concat("hello ").concat("world"));
	}

}
