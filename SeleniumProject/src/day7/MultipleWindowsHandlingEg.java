package day7;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsHandlingEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Jagbir_Sarbjith/Jars/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://gmail.com");
		
//		String gmail_WID=driver.getWindowHandle();
//		System.out.println(gmail_WID);
		
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		
		Thread.sleep(5000);
		Set<String> s=driver.getWindowHandles();
		
		Iterator<String> it=s.iterator();
		while (it.hasNext()) {
			String wID=it.next();
			System.out.println(wID);
			
			driver.switchTo().window(wID);
			Thread.sleep(5000);
			System.out.println(wID+"---"+driver.getTitle());
			
			try {
				driver.findElement(By.linkText("Create a Google Account")).click();
				System.out.println(driver.getTitle());
				break;
			} catch (Exception e) {
				System.out.println("The expected element not available in :"+driver.getTitle());
			}
		}
		
		
//		driver.findElement(By.linkText("Create a Google Account")).click();
		
	}

}
