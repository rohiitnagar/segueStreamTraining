package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BillingPage {
	@FindBy(xpath = "//*[@id=\"BillingNewAddress_CountryId\"]")
	WebElement country;
	
	@FindBy(xpath = "//input[@id = 'BillingNewAddress_City']")
	WebElement txtCity;
	
	@FindBy(xpath = "//input[@id = 'BillingNewAddress_Address1']")
	WebElement txtAdd;
	
	
	@FindBy(xpath = "//input[@id = 'BillingNewAddress_ZipPostalCode']")
	WebElement txtPostalCode;
	
	@FindBy(xpath = "//input[@id = 'BillingNewAddress_PhoneNumber']")
	WebElement txtPhone;
	
	@FindBy(xpath = "//input[@title = 'Continue']")
	WebElement buttonContinue;
	
	@FindBy(xpath= "//*[@id=\"shipping-buttons-container\"]/input")    
	WebElement buttonContinue2;
	
	@FindBy(xpath= "//*[@id=\"shipping-method-buttons-container\"]/input")
	WebElement buttonContinue3;
	
	@FindBy(xpath = "//*[@id=\"paymentmethod_2\"]")
	WebElement paymentMethod;
	
	@FindBy(xpath = "")
	WebElement buttonContinue4;
	
	
	public void selectCountry() {
		Select drop = new Select(country);
	      drop.selectByIndex(1);
	}
	
	public void enterCity(String str) {
		txtCity.sendKeys(str);
	}
	
	public void enterAdd1(String str) {
		txtAdd.sendKeys(str);
	}
	
	public void enterPostalCode(String str) {
		txtPostalCode.sendKeys(str);
		
	}
	
	public void enterPhone(String str) {
		txtPhone.sendKeys(str);
	}
	
	public void clickcontinue() {
		buttonContinue.click();
	}
	
	public void againContinue() {
		buttonContinue2.click();
	}

	public void againClickContinue() {
		buttonContinue3.click();
	}
	
	public void selectPaymentMethod() {
		paymentMethod.click();
	}
	
	public void continueAgain() {
		buttonContinue4.click();
	}
	
}
