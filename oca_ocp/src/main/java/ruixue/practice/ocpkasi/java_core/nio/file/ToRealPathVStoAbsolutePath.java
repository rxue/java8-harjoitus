package ruixue.practice.ocpkasi.java_core.nio.file;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ToRealPathVStoAbsolutePath {
	public static void demoToAbsolutePath() {
		Path one = Paths.get("/xxx");
		Path p = one.toAbsolutePath();
		System.out.println(p);
		
	}
	public static void main(String[] args) {
		demoToAbsolutePath();
	}

}
