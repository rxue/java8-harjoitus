package practice.ocakasi.java_core_api.lang;

public class DemoStringBuilder {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder("Hello");
		String subString = stringBuilder.substring(1, stringBuilder.length());
		System.out.println(subString);
		stringBuilder.replace(1, stringBuilder.length()+100, "hotxx");
		System.out.println("After replacement, the StringBuilder is " + stringBuilder);
		stringBuilder.delete(1, stringBuilder.length() + 100);
		System.out.println(stringBuilder);
	}

}
