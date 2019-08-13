package rx.practice.ocpkasi.core_java.time;

import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.UnsupportedTemporalTypeException;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LocalTimeTest {

	@Test
	public void testPlusMismatachedTemporalAmount() {
		LocalTime time = LocalTime.now();
		Period temporalAmount = Period.ofDays(1);
		assertThrows(UnsupportedTemporalTypeException.class, () -> time.plus(temporalAmount));
	}

}
