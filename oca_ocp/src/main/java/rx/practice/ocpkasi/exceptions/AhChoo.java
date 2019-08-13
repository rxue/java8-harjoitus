package rx.practice.ocpkasi.exceptions;
public class AhChoo {
	static class SneezeException extends Exception { }
	static class SniffleException extends SneezeException { }
	public static void main(String[] args) throws SneezeException {
		try {
			throw new SneezeException();
		} catch (SneezeException e) {
			//e = new RuntimeException(); //cannot convert from RuntimeException to SneezeException
			throw e;
		}
	} 
}
