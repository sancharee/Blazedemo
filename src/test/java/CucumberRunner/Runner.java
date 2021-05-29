package CucumberRunner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.vimalselvam.cucumber.listener.ExtentProperties;
import com.vimalselvam.cucumber.listener.Reporter;

import io.cucumber.java.Scenario;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utils.SeleniumDriver;

@CucumberOptions(
		plugin = {"html:target/cucumber-reports/bookFlights/cucumber_html.html","json:target/json-cucumber-reports/bookFlights/cucumber_json.json",
				},
        features = "src/test/resources/FeatureFiles",
        glue = {"steps"},tags = "@BookFlight" )

public class Runner extends AbstractTestNGCucumberTests {
  @BeforeClass
	    public  static void setup() {
//	        //com.vimalselvam.cucumber.listener.ExtentProperties extentProperties = ExtentProperties.INSTANCE;
//	        //extentProperties.setReportPath("target/myreport.html");
	System.out.println("Before");
    SeleniumDriver.setUpDriver();
    }

	    @AfterClass
	    public static void teardown() {
	    	SeleniumDriver.tearDown();
	    	//System.out.println(scenario.isFailed());
//	    	 if (scenario.isFailed()) {
//	             byte[] screenshotBytes = ((TakesScreenshot) SeleniumDriver.seleniumDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
//	             scenario.attach(screenshotBytes, "image/png", "Fail Snapshot");
//	          
//	         }
//	        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
//	        Reporter.setSystemInfo("user", System.getProperty("user.name"));
//	        Reporter.setSystemInfo("os", "Mac OSX");
//	        Reporter.setTestRunnerOutput("Sample test runner output message");
	    }

}
