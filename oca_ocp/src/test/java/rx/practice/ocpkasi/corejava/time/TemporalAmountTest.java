package rx.practice.ocpkasi.corejava.time;

import java.time.Duration;
import java.time.Period;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemporalAmountTest {

	@Test
	public void testDurationDaysEqualsPeriodDays() {
		Duration oneDayDuration = Duration.ofDays(2);
		Period oneDayPeriod = Period.ofDays(2);
		assertFalse(oneDayDuration.equals(oneDayPeriod));
	}

}
