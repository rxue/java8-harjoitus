package ruixue.ocpkasi.exception;

public class UncaughtException {
	public int play(String dogName) throws Exception {
		return 0;
	}
	public static void main(String[] args) throws RuntimeException {
		new UncaughtException().play("webby");
	}

}
