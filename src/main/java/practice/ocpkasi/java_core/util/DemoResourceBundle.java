package practice.ocpkasi.java_core.util;

import java.util.Locale;
import java.util.ResourceBundle;

public class DemoResourceBundle {
	
	public static void main(String[] args) {
		Locale enLocale = Locale.ENGLISH;
		ResourceBundle rb = ResourceBundle.getBundle("ResourceBundle", enLocale);
		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("open"));
	}

}
