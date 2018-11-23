package ruixue.ocpkasi.compiler_behavior.exception;

import java.io.FileNotFoundException;

class CheckedException extends Exception {
	public CheckedException(String message) {
		super(message);
	}
}

public class DemoStandardExceptionDeclarationIsMissing {

	public void actionForTest() throws CheckedException, FileNotFoundException {
		throw new CheckedException("I am a checked exception");
	}
	public static void main(String[] args) throws CheckedException {
		final DemoStandardExceptionDeclarationIsMissing demo = new DemoStandardExceptionDeclarationIsMissing();
		try {
			demo.actionForTest();
		} catch (Exception e) {
			throw e;
		} finally {System.out.println("finally come here");}
	}


}
