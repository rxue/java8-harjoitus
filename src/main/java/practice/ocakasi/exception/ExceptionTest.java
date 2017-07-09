package practice.ocakasi.exception;

class SpecialException extends Exception {
	public SpecialException(String message) {
		super(message);
		System.out.println(message);
	}
}

public class ExceptionTest {

	public static final void main(String[] args) {
		try {
			doSth();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	public static void doSth() throws SpecialException {
		int[] ages = new int[4];
		ages[4]=17;
		doSthElse();
	}
	public static void doSthElse() throws SpecialException {
		throw new SpecialException("Thrown");
	}

}
