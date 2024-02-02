package com.BigBasket;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ratings {


		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Nagar\\eclipse-workspace\\Hexaware_OrangeHRM\\src\\test\\resources\\Driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.bigbasket.com/");
			
			driver.manage().window().maximize();
			
			String title = driver.getTitle();
			System.out.println(title);

			WebElement we = driver.findElement(By.xpath("//*[@id=\"headlessui-menu-button-:R5bab6:\"]/div/span[1]"));
			we.click();
			Thread.sleep(5000);
			WebElement e = driver.findElement(By.xpath("//*[@id=\"headlessui-menu-items-:R9bab6:\"]/nav/ul[1]/li[4]/a"));
			e.click();
			WebElement bb = driver.findElement(By.xpath("//*[@id=\"siteLayout\"]/div[5]/div[2]/section[2]/section/ul/li[1]/div/div/h3/a/div/h3"));
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", bb);
			bb.click();
			WebElement pr = driver.findElement(By.xpath("//*[@id=\\\"siteLayout\\\"]/div[5]/div[2]/section[2]/section/ul/li[20]/div/div/div[5]/div/div[2]/button"));
			
			Thread.sleep(3000);	

		}

	}

