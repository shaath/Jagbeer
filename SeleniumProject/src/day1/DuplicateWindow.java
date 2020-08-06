package day1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DuplicateWindow {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\Jagbir_Sarbjith\\Jars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://google.com");
		
		Thread.sleep(5000);
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_D);
		
		r.keyRelease(KeyEvent.VK_D);
		r.keyRelease(KeyEvent.VK_ALT);
		
		Thread.sleep(5000);
		
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_ENTER);

		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ALT);
		
	}

}
