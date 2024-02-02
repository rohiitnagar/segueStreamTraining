package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cart {
	@FindBy(xpath = "//select[@name='CountryId']")
	private WebElement coi;
	
	@FindBy(xpath="//option[text()='India']")
	private WebElement india;
	
	@FindBy(xpath= "//*[@id='termsofservice']")
	WebElement terms;
	
	@FindBy(xpath = "//*[@id='checkout']")
	WebElement buttonCheckout;
	
	
	public void selectCountryId() {
		coi.click();
	}
	
	public void selectCountry() {
		india.click();
	}
	
	public void checkTerms() {
		terms.click();
	}
	
	public void clickCheckout() {
		buttonCheckout.click();
	}
	
}
