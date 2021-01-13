package cucumbercourse.testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/cucumbercourse/features/MenuManagement.feature",
        glue = "cucumbercourse/steps",
        plugin = {"pretty",
                "html:target/SystemTestReports/html/report.html",
                "json:target/SystemTestReports/json/report.json",
                "junit:target/SystemTestReports/junit/report.xml"})
public class MenuManagementTest {
}
