package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class irctc {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Nagar\\eclipse-workspace\\Hexaware_OrangeHRM\\src\\test\\resources\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		 
		driver.get("https://www.irctc.co.in/nget/enquiry/pnr-enquiry");
		
		driver.findElement(By.xpath("//*[@id=\"slide-menu\"]/p-sidebar/div/nav/ul/li[3]/ul/li[6]/a/span"));
		
		driver.findElement(By.xpath("//input[@name='pnr']")).sendKeys("4605212036");
		
		driver.findElement(By.xpath("//button[@type ='submit']")).click();
		
		

	}

}
