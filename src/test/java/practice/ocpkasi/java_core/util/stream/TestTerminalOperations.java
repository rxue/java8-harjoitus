package practice.ocpkasi.java_core.util.stream;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestTerminalOperations {
	private static final Logger logger = LogManager.getLogger(TestTerminalOperations.class);
	
	@Test
	public void testCallTerminalOperationTwice() {
		Predicate<? super String> predicate = s -> s.length() > 3;
		Stream<String> stream = Stream.iterate("-", (s) -> s + s);
		stream.noneMatch(predicate);
		logger.info("The stream is no longer valid after a terminal operation completes");
		assertThrows(IllegalStateException.class, () -> stream.anyMatch(predicate));
	}
	@Test
	public void testReduce() {
		List<String> list = Arrays.asList("w", "o", "l", "f");
		BinaryOperator<String> op = (String concatenated, String x) -> concatenated += x;
		String result = "";
		for (String x : list)
			result = op.apply(result, x);
		assertEquals(result, list.stream().reduce("", String::concat));
	}
	@Test
	public void testCollect() {
		Stream<String> stream = Stream.of("f","l","o","w");
		StringBuilder finalStringBuilder = stream.collect(StringBuilder::new, (sb, s) -> sb.append(s + ", "), StringBuilder::append);
		finalStringBuilder.insert(0, '[')
			.deleteCharAt(finalStringBuilder.length()-1)
			.setCharAt(finalStringBuilder.length()-1, ']');
		stream = Stream.of("f","l","o","w");
		TreeSet<String> ts = stream.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
		assertEquals(finalStringBuilder.toString(), ts.toString());
		stream = Stream.of("f","l","o","w");
		TreeSet<String> tsByCollectors = stream.collect(Collectors.toCollection(TreeSet::new));
		assertEquals(ts, tsByCollectors);
	}
}
