package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_KeyboadActionsEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Jagbir_Sarbjith/Jars/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver", "D:\\Jagbir_Sarbjith\\Jars\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		Thread.sleep(5000);
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(gmail).build().perform();
		Thread.sleep(3000);
		act.contextClick(gmail).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
//		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.chord("P")).build().perform();
		
//		Thread.sleep(3000);
//		act.sendKeys(Keys.ENTER).build().perform();
		
	}

}
