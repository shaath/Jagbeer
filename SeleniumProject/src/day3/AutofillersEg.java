package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutofillersEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Jagbir_Sarbjith/Jars/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();

		driver.get("https://redbus.in");
		
		driver.findElement(By.id("src")).sendKeys("H");
		Thread.sleep(5000);
		
		List<WebElement> listCity=driver.findElements(By.xpath("//ul[@class='autoFill']/li"));
		System.out.println(listCity.size());
		
		for (int i = 0; i < listCity.size(); i++) {
			String cityName=listCity.get(i).getText();
			System.out.println(cityName);
			if (cityName.equalsIgnoreCase("Haridwar")) {
				listCity.get(i).click();
				break;
			}
		}
		
	}

}
