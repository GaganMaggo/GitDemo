package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/gaganmaggo/eclipse-workspace/Automation/src/test/java/features",dryRun=false,monochrome=true,
		glue = "stepDefinations",stepNotifications = true, tags = "@RegTest"
		)

public class TestRunner {
	
	

}
