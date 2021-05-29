package pages.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.SeleniumDriver;

public class CompleteBookingPageLocators {
	
	public WebDriver driver;
	public CompleteBookingPageLocators() {
		this.driver= SeleniumDriver.seleniumDriver.getDriver();
	}
	
	@FindBy(id="inputName")
	public WebElement Name;
	
	@FindBy(id="address")
	public WebElement address;
	
	@FindBy(id="city")
	public WebElement city;
	
	@FindBy(id="state")
	public WebElement state;
	
	@FindBy(id="zipCode")
	public WebElement zipCode;
	
	@FindBy(id="cardType")
	public WebElement cardType;
	
	@FindBy(id="creditCardNumber")
	public WebElement creditCardNumber;
	
	@FindBy(id="creditCardMonth")
	public WebElement creditCardMonth;
	
	@FindBy(id="creditCardYear")
	public WebElement creditCardYear;
	
	@FindBy(id="nameOnCard")
	public WebElement nameOnCard;
	
	@FindBy(xpath="//input[@value='Purchase Flight']")
	public WebElement PurchaseFlight;


}
