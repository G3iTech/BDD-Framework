
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber" },tags = {"@run"}) // tag the same as in the @tag1 INCLUDES Scenario to run
																				// homepage.feature
																				// ~@ Scenario not to run (excludes) use not @homepage

public class RunnerClass {

}
