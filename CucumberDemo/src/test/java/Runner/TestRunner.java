package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun=false,
		strict=true,
		monochrome=true,
		features = {"src/test/resources/"},
		glue={"stepDefinitions"},
		plugin= { "pretty",
				"html:target/site/cucumber-html",
				"json:target/cucumber1.json"}
		
		)







public class TestRunner {

}
