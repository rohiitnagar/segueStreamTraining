package Steps;


import POM.AddToCartPage;
import POM.Cart;
import POM.LoginPages;
import Utils.DriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoLoginSteps 
{
	LoginPages lp = new LoginPages();
//	
//	@Given("Open the URL")
//	public void open_the_url() {
//	    DriverUtils.getDriver().get("https://demowebshop.tricentis.com/login");
//	}
	@When("enter username <{string}> and Password <{string}>")
	public void enter_username_and_password(String string, String string2) throws InterruptedException {
	    lp.enterUsername(string);
	    Thread.sleep(2000);
	    lp.enterPassword(string2);
	}

	@Then("Click on Login Button")
	public void click_on_login_button() {
	    lp.loginClick();
	}
	
	@When("enter username {string} and Password {string}")
	public void enter_username_and_password1(String string, String string2) {
	  lp.enterUsername(string);
	  lp.enterPassword(string2);
	}
	
	AddToCartPage p = new AddToCartPage();
	@Then("Click AddtoCart Button")
	public void click_addto_cart_button() {
	  p.clickAddTOCart();
	}
	
	@Then("Click GoToCart Button")
	public void click_go_to_cart_button() {
	    p.clickGotoCart();
	}
	
	Cart c = new Cart();
	@Then("Click terms Button")
	public void click_terms_button() {
	   c.checkTerms();
	}

	@Then("Click checkout Button")
	public void click_checkout_button() {
	    c.clickCheckout();
	}



}