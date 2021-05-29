package pages.actions;

import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.locators.BookingConfirmationPageLocators;
import pages.locators.CompleteBookingPageLocators;
import utils.SeleniumDriver;
import org.testng.Assert;
public class BookingConfirmationPageActions {
	
	BookingConfirmationPageLocators bookconfirmlocator=null;
	
	public WebDriver driver;
	public WebDriverWait wd;
	
	public BookingConfirmationPageActions()
	{
		bookconfirmlocator=new BookingConfirmationPageLocators();
		this.driver= SeleniumDriver.seleniumDriver.getDriver();
		this.wd=SeleniumDriver.seleniumDriver.waitDriver;
		PageFactory.initElements( driver, bookconfirmlocator);
	}
	
	public void ValidateConfirmation() {
		Assert.assertEquals(true, bookconfirmlocator.ConfirmMsg.isDisplayed());
		Assert.assertEquals(true, bookconfirmlocator.ConfirmId.isDisplayed());
    }


    
    

}
