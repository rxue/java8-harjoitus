package rx.practice.ocpkasi.exceptions;

class CheckedException extends Throwable {
	private static final long serialVersionUID = 1L;
	
}

public class DemoCheckedThrowable {

	public void check() throws CheckedException {
		
	}

	public static void main(String[] args) {
		DemoCheckedThrowable demo = new DemoCheckedThrowable();
		try {
			demo.check();
		} catch (CheckedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
