package practice.ocakasi.java_core_api;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * 
 * @author rxue
 *
 */
public class DemoLocalTime {

	public static void main(String[] args) {
		LocalTime time = LocalTime.of(10, 20, 0, 10);
		System.out.println(time);
		System.out.println("Nanosecond is " + time.getNano());
		time = LocalTime.of(10, 20, 20, 950);
		System.out.println(time);
		time = LocalTime.of(10, 20, 20, 1000);
		System.out.println(time);
		System.out.println("code: time = LocalTime.of(10, 20, 20, 2000000);");
		time = LocalTime.of(10, 20, 20, 2000000);
		System.out.println("output: " + time);
		System.out.println("The output above proves that Java is smart enough to hide seconds and nanoseconds when we aren't using them");
		System.out.println("Java provides a class called DateTimeFormatter to format any type and/or time object");
		DateTimeFormatter formatter =DateTimeFormatter.ofPattern("HH:mm:ss.nnnnnnnnn");
		System.out.println(formatter.format(time));
	}

}
