package ruixue.practice.ocpkasi.core_java.io;

import java.io.Console;
import java.io.IOException;
import java.io.InputStream;

/**
 * This demo demonstrates that the Console takes care of char encoding, whereas 
 * the InputStream of System.in does not 
 * 
 * @author dingding
 *
 */
public class DemoReadFromStdin {

	public static void demoWithInputStream() {
		System.out.println("Test with InputStream of System.in, press CTRL+D to input EOF");
		InputStream is = System.in;
		char[] bytes = new char[1024];
		int i = 0;
		int currentChar;
		try {
			while ((currentChar = is.read()) != -1) {
				bytes[i++] = (char)currentChar;
				if (bytes[i-1] == '\n') {
					System.out.println(bytes);
					
				} 
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void demoWithConsole() {
		System.out.println("Test with Console");
		Console c = System.console();
		String input;
		input = c.readLine();
		System.out.println(input);
	}
	
	public static void main(String[] args) {
		System.out.println("Plz try with some special encoded chars, such as Chinese etc.");
		demoWithInputStream();
		demoWithConsole();
	}

}
