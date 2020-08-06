package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridEg {
	@Test
	public void test() throws MalformedURLException, InterruptedException{
		
		DesiredCapabilities cap=DesiredCapabilities.firefox();
		cap.setPlatform(Platform.WINDOWS);
		
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.5:4444/wd/hub"), cap);
		
		driver.get("http://orangehrm.qedgetech.com");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("Welcome")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Logout")).click();
	}
}
