package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Jagbir_Sarbjith/Jars/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://Amazon.com");
		
		Thread.sleep(10000);
		
		WebElement cat=driver.findElement(By.id("nav-link-accountList"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(cat).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Buy Again']")).click();
		
//		act.doubleClick(cat).build().perform();
		
	}

}
