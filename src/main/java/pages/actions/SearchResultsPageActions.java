package pages.actions;

import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pages.locators.FindFlightsPageLocators;
import pages.locators.SearchResultsPageLocators;
import utils.SeleniumDriver;

public class SearchResultsPageActions {
	
	SearchResultsPageLocators searchresultslocator=null;
	public WebDriver driver;
	public WebDriverWait wd;
	
	public SearchResultsPageActions()
	{
		searchresultslocator=new SearchResultsPageLocators();
		this.driver= SeleniumDriver.seleniumDriver.getDriver();
		this.wd=SeleniumDriver.seleniumDriver.waitDriver;
		PageFactory.initElements( driver, searchresultslocator);
	}
	
	public void verifySearchResults(String src, String dest) {
		wd.until(ExpectedConditions.elementToBeClickable(searchresultslocator.SelectFirstFlight));
		String actualString = driver.findElement(By.xpath("//h3")).getText();
		Assert.assertTrue(actualString.contains("Flights from "+src+ " to "+dest));
		
    }
	
	
	public void selectFlight() {
		wd.until(ExpectedConditions.elementToBeClickable(searchresultslocator.SelectFirstFlight));
		searchresultslocator.SelectFirstFlight.click();
		wd.until(ExpectedConditions.urlContains("purchase"));
		
    }


    
}
