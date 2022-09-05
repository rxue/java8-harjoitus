package rx.practice.ocpkasi.corejava.concurrency;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DemoExecutorService {

	public static void demoShutdownNow() {
		ExecutorService es = Executors.newSingleThreadExecutor();
		es.submit(() -> {
			try {
				Thread.sleep(TimeUnit.SECONDS.toMillis(5));
				System.out.println("-------");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			while(true);
		});
		es.shutdownNow();
	}

	private static Void runWithSleep(int seconds) throws InterruptedException {
		System.out.println("Thread " + Thread.currentThread().getId() + " is going to sleep " + seconds + " seconds");
		TimeUnit.SECONDS.sleep(seconds);
		System.out.println("Thread " + Thread.currentThread().getId() + " woke up");
		return null;
	}
	public static void demoInvokeAll() throws InterruptedException {
		ExecutorService executorService = Executors.newWorkStealingPool(5);
		Collection<Callable<Void>> tasks = new ArrayList<>();
		tasks.add(() -> runWithSleep(5));
		tasks.add(() -> runWithSleep(8));
		executorService.invokeAll(tasks);
		System.out.println("I thought I should come before the thread output");
	}
	public static void main(String[] args) throws InterruptedException {
		demoInvokeAll();
	}

}
