package cucumbercourse.testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/cucumbercourse/features/MenuManagement.feature",
        glue = "cucumbercourse/steps",
        plugin = {"pretty",
                "html:taget/SystemTestReports/html/report.html",
                "json:taget/SystemTestReports/json/report.json",
                "junit:taget/SystemTestReports/junit/report.xml"})
public class MenuManagementTest {
}
