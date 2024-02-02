package BigBasketPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPages extends BasePage{
	@FindBy(xpath = "//button[contains(text(), 'Login/ Sign Up')]")
	private WebElement loginURL;
	
	@FindBy(xpath = "/html/body/div[6]/div/div/div/div/div/div/div[2]/form/div/input")
	private WebElement enterMobile;
	
	@FindBy(xpath = "//button[@type = 'submit']")
	private WebElement clickContinue;
	
	@FindBy(xpath = "//button[@type = 'submit']")
	private WebElement clickSubmit;
	
	public void clickLogin() {
		loginURL.click();
	}
	
	public void enterMObile(String str) {
		enterMobile.sendKeys(str);
	}
	
	public void clickContinue() {
		clickContinue.click();
	}
	
	public void clickSubmit() {
		clickSubmit.click();
	}
}
