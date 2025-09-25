// package Runner;

// import org.junit.runner.RunWith;

// import io.cucumber.junit.Cucumber;
// import io.cucumber.junit.CucumberOptions;

// @RunWith(Cucumber.class)
// @CucumberOptions(features="src/test/java/Features", tags="@login",glue = {"StepDefinition","base"},
// plugin = {"pretty", "html:target/HTML-reports/test.html","json:target/cucumber-report/cucumber.json"})


// public class RunnerTest {

// }

package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/Features",          // Feature files ka path
    glue = {"StepDefinition"},                    // Step definitions ka package
    plugin = {
        "pretty",
        "json:target/cucumber.json",              // JSON report (CI/CD me jaruri)
        "html:target/cucumber-html-report",       // Local HTML report
        "junit:target/cucumber.xml"               // JUnit XML (Jenkins/GitLab me kaam aata hai)
    },
    monochrome = true,
    publish = true                                // Cucumber cloud link (optional)
)
public class RunnerTest {
}
