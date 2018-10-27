package ruixue.practice.ocpkasi.core_java.nio.file;

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
	private static Path symbolicLink;
	private static Path existingPath;
	private static Path nonexistentPath;
	@BeforeAll
	public static void init() {
		symbolicLink = Paths.get("link");
		existingPath = Paths.get("linked_dir/final");
		nonexistentPath = Paths.get("nonexistingpath");
		try {
			Files.createDirectories(existingPath);
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
			Files.delete(Paths.get("linked_dir"));
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
//	@Test
//	public void testGetName_platformDependent() {
//		FileSystem currentSystem = FileSystems.getDefault(); 
//		Path p = Paths.get("/x/y");
//		assertEquals(Paths.get("x"), p.getName(0));
//		if (currentSystem.toString().contains("Unix"))
//			assertEquals(Paths.get("E:"), Paths.get("E:", "x", "y"));
//	}
	
}
