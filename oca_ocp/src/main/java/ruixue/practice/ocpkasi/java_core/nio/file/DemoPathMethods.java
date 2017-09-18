package ruixue.practice.ocpkasi.java_core.nio.file;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DemoPathMethods {

	public static void main(String[] args) {
		Path p = Paths.get(".");
		System.out.println(p);
		System.out.println("Absolute path is: " + p.toAbsolutePath());
		System.out.println("Normalized absolute path is: " + p.toAbsolutePath().normalize());
		p = Paths.get("/", "testxxxxx");
		//URI u = p.toUri();
		p.resolve(Paths.get("y"));
		System.out.println(p.toAbsolutePath());
	}
}
