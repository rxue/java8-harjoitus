package rx.practice.ocpkasi.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class RunnableWithParameters implements Runnable {
	private Object lock;
	public RunnableWithParameters(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		synchronized(lock) {
			try {
				System.out.println("Before wait, the state of thread " + Thread.currentThread().getId() + " is " + Thread.currentThread().getState());
				lock.wait();
				for(long i = 10; i < 1_000_000_000; i++);
				System.out.println("After wait, the state of thread " + Thread.currentThread().getId() + " is " + Thread.currentThread().getState());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("When out of critical section, state of thread " + Thread.currentThread().getId() + " is " + Thread.currentThread().getState());
	}
	
}

public class DemoThreadStates {
	
	public static void main(String[] args) {
		List<Thread> threads = new ArrayList<>();
		int startInclusive = 0;
		int endExclusive = 3;
		Object lock = new Object();
		final int waitIndex = 1;
		IntStream.range(startInclusive, endExclusive)
			.forEach(i -> {
				Thread threadToAdd = i == waitIndex ?
						new Thread(new RunnableWithParameters(lock)) : new Thread(new RunnableWithParameters(lock));
				System.out.println("After initialization, the state of thread " + threadToAdd.getId() + " is " + threadToAdd.getState());
				threads.add(threadToAdd);
				threadToAdd.start();
			});
		try {
			Thread.currentThread().sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		IntStream.range(startInclusive, endExclusive)
		.forEach(i -> {
			//if (i == interruptIndex) threads.get(i).interrupt();
			System.out.println("Currently state of thread " + threads.get(i).getId() + " is " + threads.get(i).getState());
		});
		synchronized(lock) {
			lock.notifyAll();
		}
		IntStream.range(startInclusive, endExclusive)
		.forEach(i -> {
			//if (i == interruptIndex) threads.get(i).interrupt();
			System.out.println("Last, state of thread " + threads.get(i).getId() + " is " + threads.get(i).getState());
		});
		
	}

}
