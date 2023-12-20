package stepDefs;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.ProductListPage;



public class OrderStepDefs {
	WebDriver driver= TestBase.getDriver();
	LoginPage loginPage;
	ProductListPage listPage;

	
	public OrderStepDefs() {
		
		loginPage = new LoginPage(driver);
		listPage = new ProductListPage(driver);
	}
	@Given("User is on login Page")
	public void user_is_on_login_page() {
		TestBase.openUrl("https://demoblaze.com/");
	}
	@When("User enters {string} and {string}")
	public void user_enters_and(String strUser, String strPwd) {
		loginPage.loginIntoApp(strUser,strPwd);
		//listPage.scrollPageToImg();
	}
	@Then("User Should on Home page")
	public void user_should_on_home_page() {
		Assert.assertTrue(listPage.isOnProduct());
		//listPage.scrollPageToImg();
		
	}
	@When("User add item to cart")
	public void user_add_item_to_cart() throws InterruptedException {
		//listPage.scrollPageToImg();
		listPage.addToCart();
		//listPage.acceptAlert();
	}
	
	@Then("Item must be added")
	public void item_must_be_added() {
		listPage.viewCart();
	    //Assert.assertTrue(cartPage.isItemAdded());
	}
}
