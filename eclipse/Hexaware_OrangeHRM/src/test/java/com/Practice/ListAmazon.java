package com.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListAmazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Nagar\\eclipse-workspace\\Hexaware_OrangeHRM\\src\\test\\resources\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		
		Thread.sleep(5000);
	//--------------------Get Title----------------------------	
		String title = driver.getTitle();
		System.out.println(title);
		
	//--------------------Find Element----------------------------------	
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobile");
		
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//Thread.sleep(2000);
		
		//----------------------List ELEMENTS--------------------------
		WebElement under7000 =  driver.findElement(By.xpath("//span[contains(text(),'under 7000')]"));
		
		if(under7000.isDisplayed()) {
			under7000.click();
		}
		
	
	//---------------------Is Enabled-------------------------------
				WebElement a = driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
				System.out.println(a.getText());
				
				if(a.isEnabled()) {
					System.out.println("Enabled");
				}
				
				else {
					System.out.println("Disabled");
				}
				
				
	//-------------------IS DISPLAYED---------------------
				
				if(a.isDisplayed()) {
					System.out.println("Displayed");
				}
				else {
					System.out.println("Not Displayed");
				}
		
	
				
	//----------------------List ELEMENTS--------------------------
		List<WebElement> li = driver.findElements(By.xpath("//span[contains(text(),'Samsung')]"));
		
		Thread.sleep(2000);
		int count=li.size();
		 
		for(int i=0;i<count;i++)
		{
			Thread.sleep(2000);
		 
		WebElement element_verify=	 li.get(i);
		Thread.sleep(2000);
		 
		System.out.println(element_verify.getText());
		
	}
		
		
	}
}
