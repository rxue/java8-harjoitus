package ruixue.practice.ocpkasi.java_core.nio.file;

import java.nio.file.Path;
import java.nio.file.Paths;

public class DemoPathMethods {

	public static void main(String[] args) {
		Path p = Paths.get(".");
		System.out.println(p);
		System.out.println("Absolute path is: " + p.toAbsolutePath());
		System.out.println("Normalized absolute path is: " + p.toAbsolutePath().normalize());
	}

}
