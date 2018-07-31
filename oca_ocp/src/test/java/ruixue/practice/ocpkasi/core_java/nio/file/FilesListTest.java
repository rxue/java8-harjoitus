package ruixue.practice.ocpkasi.core_java.nio.file;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class FilesListTest {
	@Test
	public void testListNoFollowSymbolicLink() {
		Path symbolicLink = Paths.get("link");
		Path target = Paths.get("src");
		try {
			Files.createSymbolicLink(symbolicLink, target);
			Stream<Path> listResult = Files.list(symbolicLink);
			assertEquals(0, listResult.count());
			Files.delete(symbolicLink);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
