package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GmailLoginEg {

	public static void main(String[] args) {
//		System.setProperty("webdriver.gecko.driver", "D:\\Jagbir_Sarbjith/Jars/geckodriver.exe");
//		FirefoxDriver driver=new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver", "D:\\Jagbir_Sarbjith\\Jars\\chromedriver.exe");
//		ChromeDriver driver=new ChromeDriver();
		System.setProperty("webdriver.ie.driver", "D:\\Jagbir_Sarbjith\\Jars\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		
		
		driver.get("https://www.gmail.com");

		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("gandesharath@gmail.com");
		
//		email.clear();
		driver.findElement(By.className("CwaK9")).click();
		
		
		
	}

}
