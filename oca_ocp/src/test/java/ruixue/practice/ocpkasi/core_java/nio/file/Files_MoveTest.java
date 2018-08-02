package ruixue.practice.ocpkasi.core_java.nio.file;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.junit.jupiter.api.Test;

public class Files_MoveTest {
	
	@Test
	public void testOverwriteExistingFile() {
		Path source = Paths.get("file_to_overwrite");
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
	public void testMoveFileToExistingEmptyDirectory_REPLACE_EXISTING() {
		Path source = Paths.get("file_to_move");
		Path target = Paths.get("target_dir");
		try {
			Files.createFile(source);
			Files.createDirectory(target);
			assertTrue(Files.isDirectory(target));
			Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
			assertFalse(Files.isDirectory(target));
			Files.delete(target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testMoveFileToExistingNoEmptyDirectory_REPLACE_EXISTING() {
		Path source = Paths.get("file_to_move");
		Path targetDir = Paths.get("target_dir");
		Path fileInTargetDir = targetDir.resolve(targetDir);
		try {
			Files.createFile(source);
			Files.createDirectory(targetDir);
			Files.createFile(fileInTargetDir);
			assertThrows(DirectoryNotEmptyException.class, () -> Files.move(source, targetDir, StandardCopyOption.REPLACE_EXISTING));
			Files.delete(source);
			Files.delete(fileInTargetDir);
			Files.delete(targetDir);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
