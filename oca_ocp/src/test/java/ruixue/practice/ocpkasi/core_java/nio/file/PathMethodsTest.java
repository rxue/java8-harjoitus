package ruixue.practice.ocpkasi.core_java.nio.file;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PathMethodsTest {
	
	@Test
	public void testResolve() {
		Path p1 = Paths.get("x");
		Path p2 = p1.resolve(Paths.get("y"));
		assertEquals(Paths.get("x/y"), p2);
		Path p3 = Paths.get("/y");
		assertEquals(Paths.get("/y"), p1.resolve(p3));
	}
	
	@Test
	public void testToRealPathAndToAbsolutePath() {
		Path symbolicLink = Paths.get("link");
		Path linkTarget = Paths.get("linkTarget/final");
		try {
			Files.createDirectories(linkTarget);
			Files.createSymbolicLink(symbolicLink, linkTarget);
			assertNotEquals(symbolicLink.toAbsolutePath(), linkTarget.toAbsolutePath());
			assertEquals(symbolicLink.toRealPath(), linkTarget.toRealPath());
			assertNotEquals(symbolicLink.toRealPath(LinkOption.NOFOLLOW_LINKS), linkTarget.toRealPath());
			Files.delete(symbolicLink);
			Files.delete(linkTarget);
			Files.delete(Paths.get("linkTarget"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testGetName_platformDependent() {
		FileSystem currentSystem = FileSystems.getDefault(); 
		Path p = Paths.get("/x/y");
		assertEquals(Paths.get("x"), p.getName(0));
		if (currentSystem.toString().contains("Unix"))
			assertEquals(Paths.get("E:"), Paths.get("E:", "x", "y"));
	}
	
}
