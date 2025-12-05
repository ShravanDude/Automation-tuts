package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\Features\\Login.feature",
		glue = {"StepDefinitions"},
		monochrome = true,
		plugin = {
				"pretty",
				"html:target/HtmlReports/index.html",
				"json:target/JsonReports/report.json"
		},
		tags = "@Regression"
		)
public class LoginRunner {
}

