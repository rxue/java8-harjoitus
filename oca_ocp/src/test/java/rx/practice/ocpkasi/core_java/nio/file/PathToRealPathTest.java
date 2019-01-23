package rx.practice.ocpkasi.core_java.nio.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PathToRealPathTest {
	private static String baseDir  = "/tmp/" + PathToRealPathTest.class.getSimpleName();
	private static Path symbolicLink;
	private static Path existingPath;
	private static Path nonexistentPath;
	@BeforeAll
	public static void init() {
		
		symbolicLink = Paths.get(baseDir, "link");
		existingPath = Paths.get(baseDir, "linked_dir", "final");
		nonexistentPath = Paths.get("nonexistingpath");
		try {
			Files.createDirectories(existingPath);
			if (!Files.exists(symbolicLink))
				Files.createSymbolicLink(symbolicLink, existingPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@AfterAll
	public static void destroy() {
		try {
			Files.delete(symbolicLink);
			Files.delete(existingPath);
			Files.delete(Paths.get(baseDir, "linked_dir"));
			Files.delete(Paths.get(baseDir));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testFollowLink() {
		try {
			assertEquals(symbolicLink.toRealPath(), existingPath.toRealPath());
			assertNotEquals(symbolicLink.toRealPath(LinkOption.NOFOLLOW_LINKS), existingPath.toRealPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testToRealPathWithNonExistingPath() {
		try {
			nonexistentPath.toRealPath();
		} catch (IOException e) {
			assertTrue(e instanceof NoSuchFileException);
		}
	}
	
}
