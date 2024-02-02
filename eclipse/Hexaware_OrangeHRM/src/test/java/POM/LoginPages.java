package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPages extends BasePage {
	//Declaration
	@FindBy(xpath = "//input[@id = 'Email']")
	private WebElement txtUser;
	
	@FindBy(xpath = "//input[@id = 'Password']")
	private WebElement txtPassword;
	
	@FindBy(xpath = "//input[@class= 'button-1 login-button']")
	private WebElement buttonLogin;
	
	public void enterUsername(String str) {
		txtUser.sendKeys(str);
	}
	
	public void enterPassword(String str) {
		txtPassword.sendKeys(str);
	}
	
	public void loginClick() {
		buttonLogin.click();
	}
}
