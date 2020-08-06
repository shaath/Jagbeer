package day9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitEg {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:\\Jagbir_Sarbjith/Jars/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://24hourfitness.com/");
		
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver).ignoring(NoSuchElementException.class)
																	.pollingEvery(2, TimeUnit.SECONDS)
																	.withTimeout(60, TimeUnit.SECONDS);
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("slide-2"))));
		
		driver.findElement(By.id("slide-2")).click();

	}

}
