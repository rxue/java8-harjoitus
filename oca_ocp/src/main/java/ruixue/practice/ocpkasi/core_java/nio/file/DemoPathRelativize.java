package ruixue.practice.ocpkasi.core_java.nio.file;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DemoPathRelativize {

	public static void main(String[] args) {
		Path p1 = Paths.get("/", "data");
		Path p2 = Paths.get("/", "user", "home");
		Path relativePath = p1.relativize(p2);
		System.out.println(relativePath);
		System.out.println(p1.resolve(relativePath));
		System.out.println(p1.resolve(relativePath).normalize());
		try {
			System.out.println(Paths.get(".").toRealPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(p1.relativize(p2).normalize().toAbsolutePath().normalize());
	}

}
