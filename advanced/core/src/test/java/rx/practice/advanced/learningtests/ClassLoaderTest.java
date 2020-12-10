package rx.practice.advanced.learningtests;

import org.junit.jupiter.api.Test;

import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ClassLoaderTest {
    @Test
    public void getResourceAsStream() {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("test.properties");
        assertNotNull(is);
    }
}