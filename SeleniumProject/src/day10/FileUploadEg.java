package day10;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadEg {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "D:\\Jagbir_Sarbjith/Jars/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);		
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		Thread.sleep(5000);
		
//		driver.findElement(By.id("photofile")).sendKeys("C:\\Users\\SharatChandra\\Desktop\\Logout_Defect.png");
//		driver.findElement(By.id("photofile")).click();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", driver.findElement(By.id("photofile")));
		
		
		Thread.sleep(5000);
		
//		Runtime.getRuntime().exec("C:\\Users\\SharatChandra\\Desktop\\FileUpload.exe");
		Runtime.getRuntime().exec("C:\\Users\\SharatChandra\\Desktop\\FileUpload1.exe");
		
	}

}
