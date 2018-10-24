package ruixue.practice.ocpkasi.core_java.nio.file;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class FilesListTest {
	@Test
	public void testListNonrecursively() {
		Path symbolicLink = Paths.get("link");
		Path target = Paths.get("src");
		try {
			Files.createSymbolicLink(symbolicLink, target);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return;
		}
		try (Stream<Path> listResult = Files.list(symbolicLink)){	
			assertEquals(2, listResult.count());
			assertTrue(listResult.anyMatch(e -> Arrays.asList("main", "test").contains(e.toString())));
			Files.delete(symbolicLink);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
