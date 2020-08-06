package day5;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotEg {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "D:\\Jagbir_Sarbjith/Jars/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\Jagbir_Sarbjith\\Workspace\\SeleniumProject\\src\\screenshots\\demo.png"));

	}

}
