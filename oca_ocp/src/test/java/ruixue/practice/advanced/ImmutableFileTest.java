package ruixue.practice.advanced;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ImmutableFileTest {
	@Test
	public void testLength() {
		String filePath = "test.txt";
		Path path = Paths.get(filePath);
		try {
			Files.createFile(path);
			File file = new File(filePath);
			assertEquals(0, file.length());
			List<String> it = Arrays.asList("hello", "world");
			Files.write(path, it);
			assertTrue(file.length() > 0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
