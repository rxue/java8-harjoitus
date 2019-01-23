package ruixue.practice.ocpkasi.core_java.nio.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilesWalkTest {

	@Test
	public void testWithZeroDepth() {
		Path src = Paths.get("src");
		try {
			assertEquals(1, Files.walk(src, 0).count());
			Files.walk(src, 0).forEach(e -> assertEquals(e, src));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
