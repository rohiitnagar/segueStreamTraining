package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Nagar\\eclipse-workspace\\Hexaware_OrangeHRM\\src\\test\\resources\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement e = driver.findElement(By.xpath("//input[@name='username']"));
		e.sendKeys("Admin");
		
		Thread.sleep(2000);
		
		e.clear();
		
		WebElement e1 = driver.findElement(By.xpath("//p[text()='Forgot your password? ']"));
		System.out.println(e1.getText());
		
		if(e1.isEnabled()) {
			System.out.println("Enabled");
		}
		else {
			System.out.println("Disabled");
		}
		
		
	}

}
