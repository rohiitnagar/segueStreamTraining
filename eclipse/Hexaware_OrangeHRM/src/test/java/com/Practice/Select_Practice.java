package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Nagar\\eclipse-workspace\\Hexaware_OrangeHRM\\src\\test\\resources\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		
		WebElement we = driver.findElement(By.xpath("//select[@name= 'country']"));
		Select sel = new Select(we);
		sel.selectByIndex(1);
		sel.selectByValue("BARBADOS");
		
		Thread.sleep(2000);
		sel.selectByVisibleText("INDIA");
	}

}
