package rx.practice.ocpkasi.javacompiler.trywithresource;

class PrimaryException extends Exception {
	private static final long serialVersionUID = 1L;
	
}

class SuppressedWindowException extends Exception {
	private static final long serialVersionUID = 1L;
}

class SuppressedDoorException extends Exception {
	private static final long serialVersionUID = 1L;
}

public class DemoTryWithResource {
	static class Door implements AutoCloseable {
		@Override
		public void close() throws SuppressedDoorException{
			System.out.println("implicit finally - close the door");
			throw new SuppressedDoorException();
		}	
	}
	static class Window implements AutoCloseable {
		public void close() throws SuppressedWindowException {
			System.out.println("implicit finally - close the window");
			throw new SuppressedWindowException();
		}
	}

	public static void main(String[] args) {
		try(Door d = new Door(); Window w = new Window()) {
			System.out.println("try block");
			throw new PrimaryException();
		} catch (Exception e) {
			System.out.println("caught exception is " + (e instanceof PrimaryException ? "PrimaryException" : "not PrimaryException"));
			Throwable[] suppressedExceptions = e.getSuppressed();
			for (Throwable t : suppressedExceptions)
				System.out.println(t);
		} finally {
			System.out.println("finally block");
		}

	}

}
