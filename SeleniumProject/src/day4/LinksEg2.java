package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Jagbir_Sarbjith/Jars/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();

		driver.get("http://bing.com");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("The number links available in google page is : "+links.size());
		
		for (int i = 0; i < links.size(); i++) {
			String lName=links.get(i).getText();
			
//			if (!lName.equalsIgnoreCase("")) {
//				System.out.println(lName);
//			}
			
			if (lName.equalsIgnoreCase("Images")) {
				links.get(i).click();
				System.out.println("The expected link is available in google page");
				break;
			}
			
		}
		
	}
}
