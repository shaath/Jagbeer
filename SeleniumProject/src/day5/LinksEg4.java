package day5;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg4 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "D:\\Jagbir_Sarbjith/Jars/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		List<WebElement> links=driver.findElements(By.xpath("html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody//a"));
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++) {
			String lName=links.get(i).getText();
			System.out.println(lName);
			links.get(i).click();
			Thread.sleep(3000);
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("D:\\Jagbir_Sarbjith\\Workspace\\SeleniumProject\\src\\screenshots\\"+lName+".png"));
			
			driver.navigate().back();
			Thread.sleep(3000);
			links=driver.findElements(By.xpath("html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody//a"));
		}

	}

}
