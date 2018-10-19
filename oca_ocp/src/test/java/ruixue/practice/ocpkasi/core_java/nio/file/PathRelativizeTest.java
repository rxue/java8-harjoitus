package ruixue.practice.ocpkasi.core_java.nio.file;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PathRelativizeTest {
	@Test
	public void testOnIrrelativePathsWithIllegalArgumentException() {
		Path base = Paths.get("/x");
		Path other = Paths.get("y");
		assertThrows(IllegalArgumentException.class, () -> base.relativize(other));
	}

}
