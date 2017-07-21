package practice.ocakasi.exception;

class FinallyException extends Exception {}
class SwallowedException extends Exception  {}
public class ThrowSecondExceptionInFinally {
	public void openDrawbridge() throws Exception {
		try {
			throw new SwallowedException();
		} catch (SwallowedException e) {
			System.out.println("The caught exception is not handled, i.e. SWALLOWED");
			throw new Exception("a second Exception");
		} finally {
			throw new FinallyException();
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