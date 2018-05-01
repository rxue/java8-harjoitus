package ruixue.practice.ocpkasi.compiler_behavior.try_with_resource;

import java.io.Closeable;

public class DemoTryWithResource {
	static class Door implements AutoCloseable {
		@Override
		public void close() {
			System.out.println("implicit finally - close the door");
		}	
	}
	static class Window implements Closeable {
		public void close() {
			System.out.println("implicit finally - close the window");
			throw new RuntimeException();
		}
	}

	public static void main(String[] args) {
		try(Door d = new Door(); Window w = new Window()) {
			System.out.println("try block");
		} catch (Exception e) {
			System.out.println("catch block - exception handler");
		} finally {
			System.out.println("finally block");
		}

	}

}
