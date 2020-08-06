package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IELaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "D:\\Jagbir_Sarbjith\\Jars\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("https://google.com");
	}

}
