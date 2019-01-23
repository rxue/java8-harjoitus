package ruixue.practice.ocpkasi.core_java.nio.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FilesIsSameFileTest {
	@Test
	public void testSameNonExistentPath() {
		String fileName = "not_exists";
		Path p1 = Paths.get(fileName);
			try {
				Files.deleteIfExists(p1);
				Path p2 = Paths.get(fileName);
				assertTrue(Files.isSameFile(p1, p2));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
	}
	
	@Test
	public void testSymbolicLinkWithTargetFile() {
		String fileName = "targetFile";
		String link = "link";
		Path target = Paths.get(fileName);
		Path linkPath = Paths.get(link);
			try {
				Files.createFile(target);
				Files.createLink(linkPath, target);				
				assertTrue(Files.isSameFile(target, linkPath));
				Files.delete(linkPath);
				Files.delete(target);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
	}
	
	@Test
	public void testNoSuchFileException() {
		Path currentDir = Paths.get(".").toAbsolutePath();
		Path p1 = currentDir.resolve("sneakers");
		try {
			Files.deleteIfExists(p1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Path p2 = Paths.get("sneakers");
		assertThrows(NoSuchFileException.class, () -> Files.isSameFile(p1, p2));
	}
}
