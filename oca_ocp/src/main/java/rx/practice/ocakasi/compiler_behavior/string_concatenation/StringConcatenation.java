package rx.practice.ocakasi.compiler_behavior.string_concatenation;

public class StringConcatenation {
	static final int INT = 100;
	public static void main(String[] args) {
		String original = "Hello";
		String concatenated = (new StringBuilder(String.valueOf(original))).append(" world").toString();
	}
}
