package com.Practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutor_Practice {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		// setting up the path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Nagar\\eclipse-workspace\\Hexaware_OrangeHRM\\src\\test\\resources\\Driver\\chromedriver.exe");
		// object of driver
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/hp/OneDrive/Desktop/JsExecutor.html");
        JavascriptExecutor j=(JavascriptExecutor)driver;
        Thread.sleep(2000);
        
        String stmt = "document.getElementById('n').value='Mayur'";
        j.executeScript(stmt);
        Thread.sleep(2000);
        
        String stmt1 = "document.getElementById('n').value=''";
        j.executeScript(stmt1);
        Thread.sleep(2000);
        
        String click = "document.getElementById('g').click()";
        j.executeScript(click);
	}
}