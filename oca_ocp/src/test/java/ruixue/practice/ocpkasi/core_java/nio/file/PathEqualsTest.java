package ruixue.practice.ocpkasi.core_java.nio.file;
import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author dingding
 *
 */
public class PathEqualsTest {
	@Test
	public void testTrueWithNonexistentPath() {
		String fileName = "not_exists";
		Path p1 = Paths.get(fileName);
		Path p2 = Paths.get(fileName);
		assertTrue(p1.equals(p2));
	}
	
	@Test
	public void testFalseWithNormalizedSamePath() {
		Path p1 = Paths.get("/x/not_exists");
		Path p2 = Paths.get("/y/../x/not_exists");
		assertFalse(p1.equals(p2));
	}

}
