package ruixue.practice.ocpkasi.java_core.nio.file;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPathMethodsReturnNull {
	@Test
	public void testGetRootOfRelativePath() {
		Path p = Paths.get("../here");
		assertNull(p.getRoot());
	}
	@Test
	public void testGetParentOfRoot() {
		Path p = Paths.get("/");
		assertNull(p.getParent());
		p = Paths.get("E://");
		assertNull(p.getParent());
	}

}
