package com.page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageMain {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Nagar\\eclipse-workspace\\Hexaware_OrangeHRM\\src\\test\\resources\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		LoginPageModel lp = new LoginPageModel(driver);
		
		lp.enterUsername("rohiitnagar@gmail.com");
		lp.enterPassword("Rohit@123");
		lp.clickLogin();
	}
}
