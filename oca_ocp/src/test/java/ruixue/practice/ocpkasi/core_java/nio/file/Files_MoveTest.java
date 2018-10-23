package ruixue.practice.ocpkasi.core_java.nio.file;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Files_MoveTest {
	private Path sourceFile;
	@BeforeEach
	public void init() {
		sourceFile = Paths.get("originalFile");
		try {
			sourceFile = Files.createFile(sourceFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testRenameFile() {
		Path renamedFile = Paths.get("renamedFile");
		try {
			assertNotNull(Files.move(sourceFile, renamedFile));
			Files.delete(renamedFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testOverwriteExistingFile() {
		Path target = Paths.get("target_file");
		try {
			Files.createFile(target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertThrows(FileAlreadyExistsException.class, () -> Files.move(sourceFile, target));
		try {
			Files.delete(sourceFile);
			Files.delete(target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	public void testMoveFileToEmptyDirectory() {
		Path emptyDirectory = Paths.get("target_emptyDir");
		try {
			Files.createDirectory(emptyDirectory);
			assert Files.isDirectory(emptyDirectory);
			Path targetPath = Files.move(sourceFile, emptyDirectory, StandardCopyOption.REPLACE_EXISTING);
			assertTrue(Files.isRegularFile(targetPath));
			Files.delete(targetPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	@Test
//	public void testMoveFileToExistingNoEmptyDirectory_REPLACE_EXISTING() {
//		Path source = Paths.get("file_to_move");
//		Path targetDir = Paths.get("target_dir");
//		Path fileInTargetDir = targetDir.resolve(targetDir);
//		try {
//			Files.createFile(source);
//			Files.createDirectory(targetDir);
//			Files.createFile(fileInTargetDir);
//			assertThrows(DirectoryNotEmptyException.class, () -> Files.move(source, targetDir, StandardCopyOption.REPLACE_EXISTING));
//			Files.delete(source);
//			Files.delete(fileInTargetDir);
//			Files.delete(targetDir);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}
