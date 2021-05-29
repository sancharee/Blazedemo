package pages.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.SeleniumDriver;

public class SearchResultsPageLocators {
	
	public WebDriver driver;
	public SearchResultsPageLocators() {
		this.driver= SeleniumDriver.seleniumDriver.getDriver();
	}
	
	@FindBy(xpath="//table[@class='table']/tbody/tr[1]/td/input[@value='Choose This Flight']")
	public WebElement SelectFirstFlight;
	
	
	

}
