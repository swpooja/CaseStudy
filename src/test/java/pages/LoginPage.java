package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id = "loginusername")
	WebElement userId;
	
	@FindBy(id = "loginpassword")
	WebElement pwd;
	
	@FindBy(id = "login2")
	WebElement loginin;
	
	@FindBy(css= "button[onclick='logIn()']")
	WebElement loginBtn;
	
	//constructor of LoginPage class
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
//action
	public void loginIntoApp(String strUser, String strPwd) {
		loginin.click();
		userId.sendKeys(strUser);
		pwd.sendKeys(strPwd);
		loginBtn.click();
	}

}
