package com.page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {
	//Declaration
	@FindBy(xpath="//input[@name = 'FirstName']")
	private WebElement FirstName;
	
	@FindBy(xpath="//input[@name = 'LastName']")
	private WebElement LastName;
	
	@FindBy(xpath="//input[@name = 'Email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@name = 'Password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@name = 'ConfirmPassword']")
	private WebElement cpassword;
	
	@FindBy(xpath="//input[@name = 'register-button']")
	private WebElement ButtonRegister;
	
	//Initialization
	
	Registration(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	//Utilization  
	
	 public void enterFirstName(String str)
		{
		 FirstName.sendKeys(str);
		}
	 
	 public void enterLastName(String str)
		{
		 LastName.sendKeys(str);
		}
	 
	 public void enterEmail(String str)
		{
		 email.sendKeys(str);
		}
	 
	 
	 public void enterPassword(String str)
		{
		 password.sendKeys(str);
		}
	 
	 public void cpassword(String str)
		{
		 cpassword.sendKeys(str);
		}
	 
	 
	 public void Button()
		{
		 ButtonRegister.click();
		}
}
