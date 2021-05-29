package pages.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.SeleniumDriver;

public class FindFlightsPageLocators {
	public WebDriver driver;
	public FindFlightsPageLocators() {
		this.driver= SeleniumDriver.seleniumDriver.getDriver();
	}
	
	@FindBy(name="fromPort")
	public WebElement fromCity;
	
	@FindBy(name="toPort")
	public WebElement toCity;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement findFlights;

}
