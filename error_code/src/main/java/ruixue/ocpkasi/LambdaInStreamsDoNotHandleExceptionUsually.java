package ruixue.ocpkasi;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class LambdaInStreamsDoNotHandleExceptionUsually {
	public void demoConsumerInForEach() {
		BlockingDeque<Integer> deque = new LinkedBlockingDeque<>();
		IntStream.iterate(1, i -> i+1).limit(5).parallel()
			.forEach(s -> deque.pollFirst(5, TimeUnit.MINUTES));
	}

}
