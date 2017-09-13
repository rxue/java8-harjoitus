package ruixue.practice.ocpkasi.java_core.nio.file;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestPathMethods {
	
	@Test
	public void testResolve() {
		Path p1 = Paths.get("x");
		Path p2 = p1.resolve(Paths.get("y"));
		assertEquals(Paths.get("x/y"), p2);
		Path p3 = Paths.get("/y");
		assertEquals(Paths.get("/y"), p1.resolve(p3));
	}
}
