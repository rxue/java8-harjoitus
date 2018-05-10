package ruixue.practice.ocpkasi.core_java.nio.file;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.junit.jupiter.api.Test;

public class TestFilesMove {
	
	@Test
	public void testOverwriteExistingFile() {
		Path source = Paths.get("file_to_move");
		Path target = Paths.get("target_file");
		try {
			Files.createFile(source);
			Files.createFile(target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertThrows(FileAlreadyExistsException.class, () -> Files.move(source, target));
		try {
			Files.delete(source);
			Files.delete(target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	public void testMoveDirectoryToExistingTargetDirectory_REPLACE_EXISTING() {
		Path source = Paths.get("dir_to_move");
		Path target = Paths.get("target_dir");
		try {
			Files.createDirectory(source);
			Files.createDirectory(target);
			Files.createFile(target.resolve("file"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertThrows(DirectoryNotEmptyException.class, () -> Files.move(source, target, StandardCopyOption.REPLACE_EXISTING));
		try {
			Files.delete(target.resolve("file"));
			Files.delete(target);
			Files.delete(source);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
