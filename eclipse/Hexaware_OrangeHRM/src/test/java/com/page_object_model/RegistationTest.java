package com.page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistationTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Nagar\\eclipse-workspace\\Hexaware_OrangeHRM\\src\\test\\resources\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		
		Registration r = new Registration(driver);
		
		r.enterFirstName("qwert");
		r.enterLastName("asdf");
		r.enterEmail("rr45557@gmail.com");
		r.enterPassword("1223456");
		r.cpassword("1223456");
		r.Button();

	}

}
