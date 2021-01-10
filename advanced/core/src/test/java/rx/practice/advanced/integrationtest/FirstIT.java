package rx.practice.advanced.integrationtest;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


@Tag("IntegrationTest")
public class FirstIT {
    @Test
    public void testStub() {
        assertTrue(true, "This is the first integration test");
    }
}
