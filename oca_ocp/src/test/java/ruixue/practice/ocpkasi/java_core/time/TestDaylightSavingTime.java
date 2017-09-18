package ruixue.practice.ocpkasi.java_core.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestDaylightSavingTime {
	@Test
	public void testUSEastern() {
		ZoneId zone = ZoneId.of("US/Eastern");
		LocalDate date = LocalDate.of(2016, 3,13);
		LocalTime time = LocalTime.of(2, 15);
		ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);
		assertEquals(3, zonedDateTime.getHour());
		ZonedDateTime zonedDateTime2 = ZonedDateTime.of(date, LocalTime.of(3, 15), zone);
		Duration d = Duration.between(zonedDateTime, zonedDateTime2);
		assertEquals(Duration.ofSeconds(0), d);
	}

}
