package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxEg1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Jagbir_Sarbjith/Jars/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://echoecho.com/htmlforms09.htm");
		
		WebElement check1=driver.findElement(By.name("option1"));
		
		if (!check1.isSelected()) {
			check1.click();
		}

	}

}
