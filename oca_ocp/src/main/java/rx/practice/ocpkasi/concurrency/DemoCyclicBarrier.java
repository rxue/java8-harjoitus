package rx.practice.ocpkasi.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoCyclicBarrier {

	public void arrival() {
		System.out.println("Arrived in McDonald");
	}
	public void eatInMcDonald(CyclicBarrier b) {
		arrival();
		try {
			b.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Eat now");
	}
	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(4);
			DemoCyclicBarrier db = new DemoCyclicBarrier();
			CyclicBarrier cb = new CyclicBarrier(4, () -> System.out.println("everyone has come!"));
			for (int i = 0; i< 4; i++)
				service.submit(() -> db.eatInMcDonald(cb));
		} finally {
			if (service != null) service.shutdown();
		}

	}

}
