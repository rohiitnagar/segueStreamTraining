package com.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_URL{
	public static void main(String[]args) {
		// Path setting for driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rohit Nagar\\eclipse-workspace\\Hexaware_OrangeHRM\\src\\test\\resources\\Driver\\chromedriver.exe" );
		
		//Creating object of webdriver
		WebDriver driver = new ChromeDriver();
		
		// open URl
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// MAximize Screen 
		driver.manage().window().maximize();
		
		//Display Title
		System.out.println(driver.getTitle());
		
		
	}
}