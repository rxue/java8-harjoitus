package rx.practice.ocpkasi.corejava.nio.file;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DemoPathMethods {
	public static void demoNormalize() {
		Path p = Paths.get(".");
		System.out.println(p);
		System.out.println(". is normalized to: " + p.normalize());
		System.out.println("But its name count is still " + p.normalize().getNameCount());
	}
	public static void demoResolve() {
		Path p = Paths.get("/x");
		Path p2 = Paths.get("y");
		Path result = p.resolve(p2);
		System.out.println(result);
	}
	public static void demoGetParent() {
		System.out.println(Paths.get("/root").getParent());
		System.out.println(Paths.get("E:root").getParent());
	}
	public static void demoGetRoot() {
		System.out.println(Paths.get("/root").getRoot());
		System.out.println(Paths.get("E://root").getRoot());
	}
	
	public static void demoGetName() {
		System.out.println(Paths.get("/root").getName(0));
		System.out.println(Paths.get("/root/one").getName(1));
	}

	public static void main(String[] args) {
		demoGetParent();
		demoGetRoot();
		demoGetName();
		Path p = Paths.get(".");
		System.out.println(p);
		System.out.println("Absolute path is: " + p.toAbsolutePath());
		System.out.println("Normalized absolute path is: " + p.toAbsolutePath().normalize());
		p = Paths.get("/", "testxxxxx");
		//URI u = p.toUri();
		p.resolve(Paths.get("y"));
		System.out.println(p.toAbsolutePath());
		p = Paths.get("testxxxxx");
		System.out.println(p.toAbsolutePath());
		demoNormalize();
		demoResolve();
		System.out.println(FileSystems.getDefault());
	}
	
}
