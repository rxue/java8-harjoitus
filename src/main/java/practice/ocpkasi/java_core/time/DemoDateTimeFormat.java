package practice.ocpkasi.java_core.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DemoDateTimeFormat {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(11, 20, 10);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		DateTimeFormatter shortDateTime =
				DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(shortDateTime.format(dateTime)); // 1/20/20
		System.out.println(dateTime.format(shortDateTime));
		System.out.println(shortDateTime.format(date)); // 1/20/20
		//System.out.println(shortDateTime.format(time)); // UnsupportedTemporalTypeException
		
		LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
//		Period p = Period.of(1, 2, 3);
//		d = d.minus(p);
		DateTimeFormatter f = DateTimeFormatter.
		ofLocalizedTime(FormatStyle.SHORT);
		System.out.println(d.format(f));
		System.out.println(f.format(d));
	}

}
