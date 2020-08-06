package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	public String url="http://orangehrm.qedgetech.com";
	public String u="Admin",p="Qedge123!@#";
	
	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement login;
	public void orglogin(String un, String ps){
		username.sendKeys(un);
		password.sendKeys(ps);
		login.click();
	}
}
