package steps;

import utils.SeleniumDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.FindFlightsPageActions;
import pages.actions.SearchResultsPageActions;
import pages.locators.FindFlightsPageLocators;

public class SearchFlightStepDefinition {
	
	FindFlightsPageActions findflights=new FindFlightsPageActions();
	SearchResultsPageActions searchresults=new SearchResultsPageActions();
	//FindFlightsPageLocators findflights_elem= new FindFlightsPageLocators();
	
	@Given("User is on the homepage {string} of BlazeDemo website")
	public void user_is_on_the_homepage_of_blaze_demo_website(String url) throws InterruptedException {
		SeleniumDriver.openPage(url);
	}
	
	@When("User chooses the departurecity {string} and destinationcity {string}")
	public void user_chooses_the_departurecity_and_destinationcity(String source, String dest) throws InterruptedException {
		
		findflights.enterSourceAs(source);
		findflights.enterDestinationAs(dest);
	}
	
	@When("User clicks on FindFlights button")
	public void user_clicks_on_find_flights_button() {
	    findflights.searchFlights();
	}

	@Then("User should be able to search for a flight and view the search results from departurecity {string} to destinationcity {string}")
	public void user_should_be_able_to_search_for_a_flight_and_view_the_search_results_from_departurecity_to_destinationcity(String src, String dest) {
		searchresults.verifySearchResults(src, dest);
	}
	
	
	@Then("User should be able to choose a flight")
	public void user_should_be_able_to_choose_a_flight() {
		searchresults.selectFlight();
	}




}
