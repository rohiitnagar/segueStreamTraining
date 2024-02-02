package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Practice {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Nagar\\eclipse-workspace\\Hexaware_OrangeHRM\\src\\test\\resources\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//MOVE To ELEMENT 
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		driver.manage().window().maximize();
		
		//WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Free Ebooks')]"));
		
		Actions act = new Actions(driver);
		//act.moveToElement(element).perform();
		
		Thread.sleep(5000);
		//DRAG AND DROP 
		WebElement source = driver.findElement(By.xpath("//*[@id=\"column-a\"]"));
		WebElement destination = driver.findElement(By.xpath("//*[@id=\"column-b\"]"));
		
		act.dragAndDrop(source, destination).perform();
	}

}
