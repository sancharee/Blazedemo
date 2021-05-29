package pages.actions;

import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.locators.CompleteBookingPageLocators;
import pages.locators.FindFlightsPageLocators;
import pages.locators.SearchResultsPageLocators;
import utils.SeleniumDriver;

public class CompleteBookingPageActions {
	
	CompleteBookingPageLocators completebookinglocator=null;
	
	public WebDriver driver;
	public WebDriverWait wd;
	
	public CompleteBookingPageActions()
	{
		completebookinglocator=new CompleteBookingPageLocators();
		this.driver= SeleniumDriver.seleniumDriver.getDriver();
		this.wd=SeleniumDriver.seleniumDriver.waitDriver;
		PageFactory.initElements( driver, completebookinglocator);
	}
	public void enterName(String name) {
		inputTxtFlds(completebookinglocator.Name,name);
    }
	
	
	public void enterAddress(String address) {
		inputTxtFlds(completebookinglocator.address,address);
    }
	
	public void enterCity(String city) {
		inputTxtFlds(completebookinglocator.city,city);
    }
	
	public void enterState(String state) {
		inputTxtFlds(completebookinglocator.state,state);
    }
	
	public void enterZip(String zip) {
		inputTxtFlds(completebookinglocator.zipCode,zip);
    }
	
	public void entercardType(String type) {
		inputTxtFlds(completebookinglocator.cardType,type);
    }
	
	public void entercardNum(String num) {
		inputTxtFlds(completebookinglocator.creditCardNumber,num);
    }
	
	public void enterYear(String year) {
		inputTxtFlds(completebookinglocator.creditCardYear,year);
    }
	
	public void enterMonth(String month) {
		inputTxtFlds(completebookinglocator.creditCardMonth,month);
    }
	
	public void enterNameCard(String name1) {
		inputTxtFlds(completebookinglocator.nameOnCard,name1);
    }


	
	public void inputTxtFlds(WebElement ele, String str) {
		wd.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
		ele.sendKeys(str);
		ele.click();
	}
	public void bookFlight() throws InterruptedException {
		completebookinglocator.PurchaseFlight.click();
		Thread.sleep(2000);
	}
}
