package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverwaitEg {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Jagbir_Sarbjith/Jars/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		WebDriverWait wait=new WebDriverWait(driver, 60);
		driver.get("https://24hourfitness.com/");
		
//		System.out.println(driver.findElement(By.id("slide-2")).isDisplayed());
		
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("slide-2"))));
		
		driver.findElement(By.id("slide-2")).click();

	}

}
