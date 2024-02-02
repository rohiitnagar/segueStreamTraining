package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentInfo {
	@FindBy(xpath = "//*[@id=\"CardholderName\"]")
	WebElement name;
	
	@FindBy(xpath= "//*[@id=\"CardNumber\"]")
	WebElement number;
	
	@FindBy(xpath= "//*[@id=\"payment-info-buttons-container\"]/input")
	WebElement buttonContinue;
	
	public void enterName(String str) {
		name.sendKeys(str);
	}
	
	public void enterCard(String str) {
		number.sendKeys(str);
	}
	
	public void clickContinue() {
		buttonContinue.click();
	}
	
}
