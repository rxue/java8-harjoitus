package ruixue.practice.ocpkasi.core_java.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.UnsupportedTemporalTypeException;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LocalDateTest {

	@Test
	public void testPlusMismatachedTemporalAmount() {
		LocalDate date = LocalDate.now();
		Duration temporalAmount = Duration.ofDays(1);
		assertThrows(UnsupportedTemporalTypeException.class, () -> date.plus(temporalAmount));
	}

}
