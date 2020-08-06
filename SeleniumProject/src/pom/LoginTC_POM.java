package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTC_POM {
	
	@Test
	public void login() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "D:\\Jagbir_Sarbjith/Jars/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		LoginPage login_page=PageFactory.initElements(driver, LoginPage.class);
		AdminPage ap=PageFactory.initElements(driver, AdminPage.class);
		
		driver.get(login_page.url);
		
		login_page.orglogin(login_page.u, login_page.p);
		
		Thread.sleep(5000);
		
		ap.welcomeclick();
		ap.logoutclick();
		
		driver.close();
		
		
		
	}
}
