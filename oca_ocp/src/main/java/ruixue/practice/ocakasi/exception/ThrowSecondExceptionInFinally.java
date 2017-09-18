package ruixue.practice.ocakasi.exception;

class FinallyException extends Exception {
	public FinallyException (String message) {
		super(message);
	}
}
class SwallowedException extends Exception  {}
public class ThrowSecondExceptionInFinally {
	public void openDrawbridge() throws Exception {
		try {
			throw new SwallowedException();
		} catch (SwallowedException e) {
			System.out.println("The caught exception is not handled, i.e. SWALLOWED");
			throw new Exception("a second Exception");
		} finally {
			throw new FinallyException("This last thrown exception aborted the previous thrown exception");
		}
	}
	public static void main(String[] arg) {
		try {
			new ThrowSecondExceptionInFinally().openDrawbridge();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
