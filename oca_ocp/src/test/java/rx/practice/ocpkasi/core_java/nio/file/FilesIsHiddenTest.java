package ruixue.practice.ocpkasi.core_java.nio.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FilesIsHiddenTest {
	@Test
	public void testWhenPathDoesNotExist() {
		Path pathToTest = Paths.get("no_exist");
		try {
			assertFalse(Files.isHidden(pathToTest));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
