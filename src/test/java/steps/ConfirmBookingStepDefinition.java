package steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.BookingConfirmationPageActions;
import pages.actions.CompleteBookingPageActions;
import pages.actions.SearchResultsPageActions;
import utils.SeleniumDriver;
public class ConfirmBookingStepDefinition {
	
	public WebDriver driver=SeleniumDriver.seleniumDriver.getDriver();
	public WebDriverWait wd=SeleniumDriver.seleniumDriver.waitDriver;
	BookingConfirmationPageActions confirmbooking=new BookingConfirmationPageActions();
		
	@Given("User is on the confirmation page {string} of BlazeDemo website")
	public void user_is_on_the_confirmation_page_of_blaze_demo_website(String expectedurl) {
		String actualurl = driver.getCurrentUrl();
		Assert.assertEquals(actualurl, expectedurl );
	}

	@Then("User should be able to verify the confirmation message and the confirmation id")
	public void user_should_be_able_to_verify_the_confirmation_message_and_the_confirmation_id() {
		confirmbooking.ValidateConfirmation();
	}

}
