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

import pages.locators.FindFlightsPageLocators;
import utils.SeleniumDriver;

public class FindFlightsPageActions {
	
	FindFlightsPageLocators findflightslocator=null;
	public WebDriver driver;
	public WebDriverWait wd;
	
	public FindFlightsPageActions()
	{
		findflightslocator=new FindFlightsPageLocators();
		this.driver= SeleniumDriver.seleniumDriver.getDriver();
		this.wd=SeleniumDriver.seleniumDriver.waitDriver;
		PageFactory.initElements( driver, findflightslocator);
	}
	
	public void enterSourceAs(String source) throws InterruptedException {
		wd.until(ExpectedConditions.elementToBeClickable(findflightslocator.fromCity));
		findflightslocator.fromCity.click();
		findflightslocator.fromCity.sendKeys(source);
		findflightslocator.fromCity.click();
		
    }


    public void enterDestinationAs(String destination) {
    	wd.until(ExpectedConditions.elementToBeClickable(findflightslocator.toCity));
     	findflightslocator.toCity.click();
    	findflightslocator.toCity.sendKeys(destination);
    	findflightslocator.toCity.click();
    }
    
    public void searchFlights() {
    	wd.until(ExpectedConditions.elementToBeClickable(findflightslocator.findFlights));
      	findflightslocator.findFlights.click();
    	
    }
    

}
