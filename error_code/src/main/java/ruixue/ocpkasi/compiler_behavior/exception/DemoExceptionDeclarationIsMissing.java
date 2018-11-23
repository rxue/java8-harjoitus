package ruixue.ocpkasi.compiler_behavior.exception;

public class DemoExceptionDeclarationIsMissing {

	public void actionForTest(String exception) throws Exception {
		try {
			throw new RuntimeException(exception);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) throws RuntimeException {
		new DemoExceptionDeclarationIsMissing().actionForTest("Exception is declared in this method");
	}

}
