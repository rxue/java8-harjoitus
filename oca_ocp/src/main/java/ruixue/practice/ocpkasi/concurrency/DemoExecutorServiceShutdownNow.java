package ruixue.practice.ocpkasi.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DemoExecutorServiceShutdownNow {

	public static void main(String[] args) {
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

}
