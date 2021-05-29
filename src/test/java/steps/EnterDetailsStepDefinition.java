package steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.CompleteBookingPageActions;
import pages.actions.SearchResultsPageActions;
import utils.SeleniumDriver;
public class EnterDetailsStepDefinition {
	public WebDriver driver=SeleniumDriver.seleniumDriver.getDriver();
	public WebDriverWait wd=SeleniumDriver.seleniumDriver.waitDriver;
	CompleteBookingPageActions completebooking=new CompleteBookingPageActions();
		
	@Given("User is on the reservation page {string} of BlazeDemo website")
	public void user_is_on_the_reservation_page_of_blaze_demo_website(String expectedurl) {
		String actualurl = driver.getCurrentUrl();
		Assert.assertEquals(actualurl, expectedurl );
	}

	@When("User enters passenger details like Name {string}, Address {string}, City {string},State {string}, pincode {string}")
	public void user_enters_passenger_details_like_name_address_city_state_pincode(String name, String addr, String city, String state, String pincode) {
		completebooking.enterName(name);
		completebooking.enterAddress(addr);
		completebooking.enterCity(city);
		completebooking.enterState(state);
		completebooking.enterZip(pincode);
	}

	@When("User enters payment details like CardType {string}, CardNumber {string},expiry month {string} and year {string} and name on card {string}")
	public void user_enters_payment_details_like_card_type_cardtype_card_number_expiry_month_and_year_and_name_on_card(String type, String num, String month, String year, String name) {
		completebooking.entercardType(type);
		completebooking.entercardNum(num);
		completebooking.enterMonth(month);
		completebooking.enterYear(year);
		completebooking.enterNameCard(name);
	}

	@When("User clicks on Purchase Flight button")
	public void user_clicks_on_purchase_flight_button() throws InterruptedException {
		completebooking.bookFlight();
	}

	@Then("User should be redirected to the booking confirmation screen")
	public void user_should_be_redirected_to_the_booking_confirmation_screen() {
		wd.until(ExpectedConditions.urlContains("confirmation"));
	}


}
