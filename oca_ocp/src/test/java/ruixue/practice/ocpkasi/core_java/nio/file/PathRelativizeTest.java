package ruixue.practice.ocpkasi.core_java.nio.file;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.junit.jupiter.api.Test;

public class PathRelativizeTest {
	@Test
	public void testOnIrrelativePathsWithIllegalArgumentException() {
		Path base = Paths.get("/x");
		Path other = Paths.get("y");
		assertThrows(IllegalArgumentException.class, () -> base.relativize(other));
	}

}
