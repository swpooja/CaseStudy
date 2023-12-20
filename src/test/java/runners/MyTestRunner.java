package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test//resources//features//placeOrder.feature" ,
		glue = {"stepDefs"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty" ,
				"html:target//Report//HtmlReport.html",
		}
		//tags = "@SmokeTest",
		//tags= "@RegressionTest"
		)
public class MyTestRunner extends AbstractTestNGCucumberTests{

}
