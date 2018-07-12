package ruixue.ocpkasi.concurrency;

class DeadLock implements Runnable {
	private DeadLock otherLock;
	@Override
	public synchronized void run() {
		System.out.println("Thread " + Thread.currentThread().getId() + " got resource ");
		synchronized(otherLock) {
			System.out.println("Thread " + Thread.currentThread().getId() + " got resource");
		}
	}
	public void setOtherLock(DeadLock otherLock) {
		this.otherLock = otherLock;
	}
}


public class DemoSimpleDeadLock {

	public static void main(String[] args) {
		DeadLock l1 = new DeadLock();
		DeadLock l2 = new DeadLock();
		l1.setOtherLock(l2);
		l2.setOtherLock(l1);
		new Thread(l1).start();
		new Thread(l2).start();

	}

}
