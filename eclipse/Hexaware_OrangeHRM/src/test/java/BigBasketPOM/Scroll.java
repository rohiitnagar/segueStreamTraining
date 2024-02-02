package BigBasketPOM;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Scroll extends BasePage {

    private final JavascriptExecutor js = (JavascriptExecutor) driver;

    public Scroll() throws InterruptedException {
        super();
    }

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div[1]/div[2]/a[5]/span/img")
    private WebElement deals;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[5]/div[2]/section[2]/section/ul/li[8]/div/div/h3/a/div")
    private WebElement cart;

    public void dealsOfWeek() throws InterruptedException {
        deals.click();
        Thread.sleep(4000);
        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0,130)");
            Thread.sleep(600);
        }
    }

      public void goToCart() {
    	  cart.click();
    	  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
    	  driver.switchTo().window(tabs.get(1));
      }
}