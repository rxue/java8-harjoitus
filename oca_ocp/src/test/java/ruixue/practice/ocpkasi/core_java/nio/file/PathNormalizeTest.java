package ruixue.practice.ocpkasi.core_java.nio.file;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PathNormalizeTest {
	
	@Test
	public void testNormalize() {
		Path p = Paths.get("x/y/.././z");
		assertEquals(Paths.get("x/z"), p.normalize());
	}
	
	@Test
	public void testNormalizeCurrentDirectory() {
		Path currentPath = Paths.get(".");
		assertEquals(Paths.get(""), currentPath.normalize());
	}
	
	
}
