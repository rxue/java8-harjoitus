package rx.practice.ocpkasi.corejava.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task implements Runnable {
	private List<String> member;
	
	public Task(List<String> member) {
		this.member = member;
	}

	@Override
	public void run() {
		System.out.println("I am going to sleep");
		try {
			Thread.sleep(1000*5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		member.add("element");
	}
	
}

public class FutureTaskTest {

	@Test
	public void testRunningInMainThread() {
		Thread currentThread = Thread.currentThread();
		FutureTask<?> futureTask = new FutureTask<>(() -> {
			assertEquals(currentThread, Thread.currentThread());
			return null;
		}
				);
		futureTask.run();
	}
	@Test
	public void testRunningInNewThread() {
		Thread currentThread = Thread.currentThread();
		FutureTask<Long> futureTask = new FutureTask<>(() -> {
			Thread.sleep(1000*2);
			return Thread.currentThread().getId();
		}
				);
		ExecutorService s = Executors.newSingleThreadExecutor();
		s.execute(futureTask);
		try {
			assertNotEquals(currentThread.getId(), futureTask.get().longValue());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	public void testRunRunnableWithReturnValue() {
		List<String> list = new ArrayList<>();
		FutureTask<List<String>> futureTask = new FutureTask<>(new Task(list), list);
		futureTask.run();
		try {
			assertFalse(futureTask.get().isEmpty());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
