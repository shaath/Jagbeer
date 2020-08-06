package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrageHRMLoginEg {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver", "D:\\Jagbir_Sarbjith/Jars/geckodriver.exe");
//		FirefoxDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Jagbir_Sarbjith\\Jars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://orangehrm.qedgetech.com");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("Welcome")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Logout")).click();
		
//		driver.close();
		driver.quit();
	}

}
