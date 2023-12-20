package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ProductListPage {
	
	WebDriver driver;
	//Alert alert = driver.switchTo().alert();
	
	@FindBy(xpath = "//*[text()='Samsung galaxy s6']")
	WebElement itemOne;
	
	@FindBy(xpath = "//*[text()='Nokia lumia 1520']")
	WebElement itemTwo;
	
	@FindBy(id = "cartur")
	WebElement cartIcon;
	
	@FindBy(xpath ="//*[@onclick='addToCart(1)']")
	WebElement AddCartBtn1;
	
	@FindBy(xpath ="//a[contains(text(), 'Home')]")
	WebElement HomeBtn;
	
	@FindBy(xpath ="//*[@onclick='addToCart(2)']")
	WebElement AddCartBtn2;
	
	@FindBy(xpath ="//*[contains(text(), 'Welcome')]")
	WebElement productsTitle;
	
	//actions
	//add to cart
	//alert ok
	//view cart
	public ProductListPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
//	public void scrollPageToImg() {
//		Actions action = new Actions(driver);
//		//action.scrollToElement(itemOne).perform();
//		action.scrollByAmount(200, 800);
//		
//	}
	public void addToCart() throws InterruptedException {
		
		Thread.sleep(4000);
		itemOne.click();
		AddCartBtn1.click();
		//Thread.sleep(4000);
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		
		//Thread.sleep(4000);
		//HomeBtn.click();
		//Thread.sleep(4000);
//		itemTwo.click();
//		AddCartBtn2.click();
//		driver.switchTo().alert().accept();
		//Thread.sleep(4000);
		//alert.accept();
		
		
	}
	public void viewCart() {
		cartIcon.click();
	}
	
//	public void acceptAlert() {
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
//	}
	public boolean isOnProduct() {
		return productsTitle.isDisplayed();
	}

}

