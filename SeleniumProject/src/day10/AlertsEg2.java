package day10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsEg2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Jagbir_Sarbjith/Jars/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		Thread.sleep(5000);

		Alert alt=driver.switchTo().alert();
		
		System.out.println(alt.getText());
		
		alt.dismiss();

//		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		System.out.print(((JavascriptExecutor)driver).executeScript("return document.readyState")); 
//		wait.until(webDriver -> ((JavascriptExecutor)webDriver).executeScript("return document.readyState").equals("complete"));
//		 
//		driver.get("https://www.softwaretestinghelp.com");
	}

}
