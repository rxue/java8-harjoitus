package ruixue.practice.ocpkasi.core_java.nio.file;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

public class TestPathGetParent {
	@Test
	public void testParentIsRoot() {
		FileSystem fs = FileSystems.getDefault();
		Path linuxPath = Paths.get("/root");
		Path windowsPath = Paths.get("E://child");
		if (fs.toString().contains("Linux")) {
			
		}
		else if (fs.toString().contains("Windows")) {
			
		}
	}

}
