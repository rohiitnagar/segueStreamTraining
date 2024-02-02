package com.page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageModel {
	
	
	
	//Declaration
	@FindBy(xpath="//input[@name='Email']")
	private WebElement txtUser;
	
	
	@FindBy(xpath="//input[@name='Password']")
	private WebElement txtPassword;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
	private WebElement button;
	
	
	//Initialization
	
	LoginPageModel(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

	
	
	//Utilization
	 public void enterUsername(String str)
		{
			txtUser.sendKeys(str);
		}
		public void enterPassword(String str)
		{
			txtPassword.sendKeys(str);
		}
		public void clickLogin()
		{
			button.click();
		}
	}
	
