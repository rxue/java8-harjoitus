package rx.practice.advanced;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("rx.practice.advanced.learningtests.time.format")
public class SuiteTest {
}
