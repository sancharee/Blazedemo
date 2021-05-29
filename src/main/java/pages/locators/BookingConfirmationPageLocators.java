package pages.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.SeleniumDriver;

public class BookingConfirmationPageLocators {
	
	public WebDriver driver;
	public BookingConfirmationPageLocators() {
		this.driver= SeleniumDriver.seleniumDriver.getDriver();
	}
	
	
	@FindBy(xpath="//*[contains(text(),'Thank you for your purchase today!')]")
	public WebElement ConfirmMsg;
	
	@FindBy(xpath="//table/tbody/tr[1]/td[contains(text(),'Id')]/following-sibling::td[1]")
	public WebElement ConfirmId;
	
	


}
