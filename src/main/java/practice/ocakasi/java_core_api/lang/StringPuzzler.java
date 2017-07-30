package practice.ocakasi.java_core_api.lang;
/**
 * 
 * @author Rui Xue
 *
 */
public class StringPuzzler {

	public static void main(String[] args) {
		String x = "hello";
		String sub = x.substring(x.length(),x.length());
		//System.out.println("x.subtring(x.length(), x.length()) returns " + sub);
		String y = "hello" + true;
		System.out.println("(y.substring(0, y.length()) == y) returns " +  (y.substring(0, y.length()) == y));
	}

}
