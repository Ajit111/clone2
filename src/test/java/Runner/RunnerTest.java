package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/Features",
    glue = {"StepDefinition"},
    plugin = {
        "pretty",
        "json:target/cucumber.json",
        "html:target/cucumber-html-report"
    },
    monochrome = true,
    tags = "@login"
)
public class RunnerTest {
    // JSON always generate hota hai, agar tests fail bhi ho to empty file create hoti hai
}
