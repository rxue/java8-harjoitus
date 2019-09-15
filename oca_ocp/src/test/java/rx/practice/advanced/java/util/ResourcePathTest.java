package rx.practice.advanced.java.util;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ResourcePathTest {
    @Test
    public void testTestResourcePath() throws IOException {
        Path testPropertyFile = Paths.get("src", "test", "resources", "test.properties");
        InputStream in = Files.newInputStream(testPropertyFile);
        Properties prop = new Properties();
        prop.load(in);
        assertNotNull(prop.getProperty("test.name"));
    }
    @Test
    public void testMainResourcePath() throws IOException {
        Path propertyFile = Paths.get("src", "main", "resources", "ResourceBundle_en.properties");
        InputStream in = Files.newInputStream(propertyFile);
        Properties prop = new Properties();
        prop.load(in);
        assertNotNull(prop.getProperty("hello"));
    }
}
