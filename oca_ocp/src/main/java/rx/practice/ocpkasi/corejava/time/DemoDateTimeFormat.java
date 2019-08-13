package rx.practice.ocpkasi.corejava.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DemoDateTimeFormat {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(11, 20, 10);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		DateTimeFormatter shortDateTime =
				DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(shortDateTime.format(dateTime)); // 1/20/20
		System.out.println(dateTime.format(shortDateTime));
		DateTimeFormatter shortDate =
				DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(dateTime.format(shortDate));
		DateTimeFormatter shortTime =
				DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println(time.format(shortTime));
		System.out.println(shortDateTime.format(date)); // 1/20/20
		
		//System.out.println(shortDateTime.format(time)); // UnsupportedTemporalTypeException
	}

}
