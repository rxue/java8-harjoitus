package ruixue.practice.ocpkasi.core_java.nio.file;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

public class PathSpecialCaseTest {
	@Test
	public void testEmptyStringPath() {
		Path currentPath = Paths.get("");
		assertEquals(1, currentPath.getNameCount());
		assertEquals(currentPath, currentPath.getName(0));
	}
	
	@Test
	public void testCurrentDirectoryPath() {
		Path currentDirectoryPath = Paths.get(".");
		Path emptyStringPath = Paths.get("");
		assertEquals(emptyStringPath, currentDirectoryPath.normalize());
	}

}
