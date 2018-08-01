package ruixue.practice.ocpkasi.core_java.nio.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Files_IsDirectoryTest {
	@Test
	public void testIsDirectoryWithSymbolicLink() {
		Path targetDir = Paths.get("target_dir");
		Path symbolicLink = Paths.get("link");
		try {
			Files.createDirectory(targetDir);
			Files.createSymbolicLink(symbolicLink, targetDir);
			assertTrue(Files.isDirectory(symbolicLink));
			assertFalse(Files.isDirectory(symbolicLink, LinkOption.NOFOLLOW_LINKS));
			Files.delete(symbolicLink);
			Files.delete(targetDir);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
