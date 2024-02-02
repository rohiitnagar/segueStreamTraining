package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Demo {
	public static void main(String[] args) throws InterruptedException {

		// PAth Setting
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Nagar\\eclipse-workspace\\Hexaware_OrangeHRM\\src\\test\\resources\\Driver\\chromedriver.exe");
		
		// Creating a object 
		WebDriver driver = new ChromeDriver();
		
		//Open our url 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Maximize Screen 
		driver.manage().window().maximize();
		
		// Display the title of Website
		System.out.println(driver.getTitle());
		
//		// Navigate Forward 
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		
//		// Naviogate Backward
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.navigate().refresh();
//		Thread.sleep(2000);
//		//Another way of OPening URL
//				driver.navigate().to("https://demowebshop.tricentis.com/");
//		//Closing the Driver
//		driver.close();
		Thread.sleep(8000);
//		driver.findElement(By.name("username")).sendKeys("Admin");
//	driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
	}
}
