package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = "/Users/gaganmaggo/eclipse-workspace/Automation/src/test/java/features",
		glue = "stepDefinations",
		plugin = {"pretty","html:target/cucumberreports.html","json:target/jsonreports.json","junit:target/junitreport.xml"}
		)

public class TestNgTestRunner extends AbstractTestNGCucumberTests {

}
