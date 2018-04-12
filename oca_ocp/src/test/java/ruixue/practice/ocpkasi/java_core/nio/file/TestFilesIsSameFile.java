package ruixue.practice.ocpkasi.java_core.nio.file;

import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestFilesIsSameFile {
	@Test
	public void testSamePathButNonExists() {
		Path currentDir = Paths.get(".");
		Path p1 = currentDir.toAbsolutePath().normalize().resolve("test");
		Path p2 = Paths.get("test");
		assertThrows(NoSuchFileException.class, () -> Files.isSameFile(p1, p2));
	
	}

}
