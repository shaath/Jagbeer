package day8;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Jagbir_Sarbjith/Jars/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);		
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Employee List")).click();
		
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		System.out.println("The number rows : "+rows.size());
		
		for (int i = 0; i < rows.size(); i++) {
//			String rText=rows.get(i).getText();
//			System.out.println(rText);
			
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			String f=cols.get(2).getText();
			System.out.println(f);
		}
	}

}
