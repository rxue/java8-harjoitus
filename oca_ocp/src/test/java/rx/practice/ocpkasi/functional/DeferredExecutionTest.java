package rx.practice.ocpkasi.functional;

import java.util.stream.LongStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.junit.jupiter.api.Assertions.*;

public class DeferredExecutionTest {
	private static final Logger logger = LogManager.getLogger(DeferredExecutionTest.class);
	//@Test
	public void testDeferredExecution() {
		long upTo = 200_000_000;
		assertTrue(benchmarkNormalLogging(upTo) > 30 * benchmarkLambdaLogging(upTo));
		logger.info("Deferred execution of lambda in Java enhanced the performance");
	}
	
	private long benchmarkNormalLogging(long times) {
		long before = System.currentTimeMillis();
		LongStream.range(1, times)
			.forEach(l -> {
				logger.trace("" + System.currentTimeMillis());
			});
		return System.currentTimeMillis() - before;
	}
	
	private long benchmarkLambdaLogging(long times) {
		long before = System.currentTimeMillis();
		LongStream.range(1, times)
			.forEach(l -> {
				logger.trace(() -> System.currentTimeMillis());
			});
		return System.currentTimeMillis() - before;
	}

}
