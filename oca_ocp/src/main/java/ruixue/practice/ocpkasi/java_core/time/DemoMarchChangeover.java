package ruixue.practice.ocpkasi.java_core.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DemoMarchChangeover {

	public static void main(String[] args) {
		ZoneId zone = ZoneId.of("US/Eastern");
		LocalDate date = LocalDate.of(2016, 3, 13);
		LocalTime time = LocalTime.of(2, 15);
		ZonedDateTime a = ZonedDateTime.of(date, time, zone);
		System.out.println(a);
	}

}
