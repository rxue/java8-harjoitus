package ruixue.practice.ocpkasi.core_java.nio.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ToRealPathVStoAbsolutePath {
	public static void demoToAbsolutePath() {
		System.out.println("DEMO: toAbsolutePath");
		Path one = Paths.get("/xxx/..");
		Path p = one.toAbsolutePath();
		System.out.println(p);
		
	}
	public static void demoToRealPath() {
		System.out.println("DEMO: toRealPath");
		Path one = Paths.get("src/main/../x/../test/./java");
		Path p;
		try {
			//System.out.println(nonexisted.toRealPath());
			p = one.toRealPath();
			System.out.println(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		demoToAbsolutePath();
		demoToRealPath();
		File f = new File("/x/test.txt");
//		System.out.println(f.getName());
//		try {
//			Stream<Path> s = Files.list(Paths.get("./pom.xml"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
