package rx.practice.advanced;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 *
 */
public class ResourcesDirectoryTest {
    /**
     * This test tells the root directory of test is not src/test/resources
     * @throws IOException
     */
    @Test
    public void getPropertiesFile() throws IOException {
        Assertions.assertThrows(IOException.class, () -> Files.newInputStream(Paths.get("test.properties")));
    }

    /**
     * Test test tells the root directory of test is not src/test/resources but the project root
     * @throws IOException
     */
    @Test
    public void getPropertiesFileFromTestResources() throws IOException {
        assertNotNull(Files.newInputStream(Paths.get("src","test","resources", "test.properties")));
    }
}
