package ruixue.practice.ocpkasi.core_java.nio.file;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FilesMoveTest {
	private Path sourcePath;
	@BeforeEach
	public void init() {
		sourcePath = Paths.get("original_path");
	}
	
	@Test
	public void testRenameFile() {
		Path renamedFile = Paths.get("renamedFile");
		try {
			sourcePath = Files.createFile(sourcePath);
			assertNotNull(Files.move(sourcePath, renamedFile));
			Files.delete(renamedFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testFileAlreadyExistsException() {
		Path target = Paths.get("target_file");
		try {
			sourcePath = Files.createFile(sourcePath);
			Files.createFile(target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertThrows(FileAlreadyExistsException.class, () -> Files.move(sourcePath, target));
		try {
			Files.delete(sourcePath);
			Files.delete(target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testReplaceExistingDirectory() {
		Path fileInSourceDirectory = sourcePath.resolve("file_in_source_dir");
		Path existingTargetDirectory = Paths.get("target_dir");
		try {
			Files.createDirectory(sourcePath);
			Files.createFile(fileInSourceDirectory);
			Files.createDirectory(existingTargetDirectory);
			assertNotNull(Files.move(sourcePath, existingTargetDirectory, StandardCopyOption.REPLACE_EXISTING));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Files.delete(existingTargetDirectory.resolve("file_in_source_dir"));
			Files.delete(existingTargetDirectory);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testMoveNonEmptyDirectoryInTheSameDrive() {
		Path fileInSourceDirectory = sourcePath.resolve("file_in_source_dir");
		Path targetDir = Paths.get("target_dir");
		try {
			Files.createDirectory(sourcePath);
			Files.createFile(fileInSourceDirectory);
			Files.createDirectory(targetDir);
			assert Files.getFileStore(fileInSourceDirectory).equals(Files.getFileStore(targetDir));
			assertNotNull(Files.move(sourcePath, targetDir, StandardCopyOption.REPLACE_EXISTING));
			assertTrue(Files.walk(targetDir).count()>0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Files.delete(targetDir.resolve("file_in_source_dir"));
			Files.delete(targetDir);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
