package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_DemoWebShop {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// Path Setting
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Nagar\\eclipse-workspace\\Hexaware_OrangeHRM\\src\\test\\resources\\Driver\\chromedriver.exe");
		
		//Created Object
		WebDriver driver = new ChromeDriver();
		
		//Opening URL 
		driver.get("https://demowebshop.tricentis.com/register");
		
		//Maximize
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id = 'gender-male']")).click();
		driver.findElement(By.xpath("//input[@name ='FirstName']")).sendKeys("Rohit");
		driver.findElement(By.xpath("//input[@name ='LastName']")).sendKeys("Nagar");
		driver.findElement(By.xpath("//input[@name ='Email']")).sendKeys("sne1223@gmail.com");
		driver.findElement(By.xpath("//input[@name ='Password']")).sendKeys("rohit@123");
		driver.findElement(By.xpath("//input[@name ='ConfirmPassword']")).sendKeys("rohit@123");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='button-1 register-continue-button']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@alt='Picture of Computing and Internet']")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-13']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Shopping cart')]")).click();
		
		
		

	}

}
