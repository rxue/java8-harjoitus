package rx.practice.ocpkasi.corejava.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExecutorServiceSubmitTest {
	
	@Test
	public void testSubmitRunnableWithSuccessfulCancel() throws InterruptedException, ExecutionException {
		ExecutorService singleThreadService = Executors.newCachedThreadPool();
		List<Object> list = new ArrayList<>();
		Runnable task = () -> {
				try {
					Thread.sleep(1000*100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				list.add(new Object());
		};
		Future<?> f = singleThreadService.submit(task);
		assertTrue(f.cancel(true));
		singleThreadService.shutdown();
		assertEquals(0, list.size());
	}
}
