package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPages extends BasePage {
      @FindBy(xpath = "//input[@id = 'gender-male']")
      private WebElement selGender;
      
      @FindBy(xpath="//input[@name ='FirstName']")
      private WebElement firstName;
      
      @FindBy(xpath = "//input[@name ='LastName']")
      private WebElement lastName;
      
      @FindBy(xpath = "//input[@name ='Email']")
      private WebElement email;
      
      @FindBy(xpath = "//input[@name ='Password']")
      private WebElement password;
      
      @FindBy(xpath = "//input[@name ='ConfirmPassword']")
      private WebElement cpassword;
      
      @FindBy(xpath = "//input[@id='register-button']")
      private WebElement buttonReg;
      
      @FindBy(xpath= "//input[@value= 'Continue']")
      private WebElement buttonContinue;
      
      public void selGenderClick() {
    	  selGender.click();
      }
      
      public void enterFirstName(String str) {
    	  firstName.sendKeys(str);
      }
      
      public void enterLastName(String str) {
    	  lastName.sendKeys(str);
      }
      
      public void enterEmail(String str) {
    	  email.sendKeys(str);
      }
      
      public void enterPassword(String str) {
    	  password.sendKeys(str);
      }
      
      public void confirmPassword(String str) {
    	  cpassword.sendKeys(str);
      }
      
      
      public void clickRegister() {
    	  buttonReg.click();
      }
      
      public void clickContinue() {
    	  buttonContinue.click();
      }
}
