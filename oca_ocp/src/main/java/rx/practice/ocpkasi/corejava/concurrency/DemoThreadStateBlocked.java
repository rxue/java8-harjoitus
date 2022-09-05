package rx.practice.ocpkasi.corejava.concurrency;

class SynchronizedClass {
	
	public synchronized void synchCall(Thread t) {
		for (long i = 0; i < Integer.MAX_VALUE; i++);
		if (t != null)
		System.out.println("The other thread state is " + t.getState());
	}
}

public class DemoThreadStateBlocked {

	public static void main(String[] args) {
		SynchronizedClass s = new SynchronizedClass();
		Thread t1 = new Thread(() -> s.synchCall(null));
		Thread t2 = new Thread(() -> s.synchCall(t1));
		t2.start();
		for (long i = 0; i < Integer.MAX_VALUE/10; i++);
		t1.start();
	}

}
