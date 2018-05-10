package ruixue.practice.ocpkasi.core_java.nio.file;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

public class TestFilesDelete {
	@Test
	public void testDeleteNonexistentDirectory() {
		Path p = Paths.get("to_delete");
		Path childFile = p.resolve("file");
		try {
			Files.createDirectory(p);
			Files.createFile(childFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertThrows(DirectoryNotEmptyException.class, () -> Files.delete(p));
		
		try {
			Files.delete(childFile);
			Files.delete(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
