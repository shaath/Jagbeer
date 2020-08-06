package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableEg2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Jagbir_Sarbjith/Jars/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Employee List")).click();
		
		Thread.sleep(3000);
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		System.out.println("The number rows : "+rows.size());
		
		for (int i = 0; i < rows.size(); i++) {
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			String eId=cols.get(1).getText();
			System.out.println(eId);
			
			if (eId.equalsIgnoreCase("0024")) {
				cols.get(0).click();
				driver.findElement(By.id("btnDelete")).click();
				Thread.sleep(5000);
				driver.findElement(By.id("dialogDeleteBtn")).click();
				break;
			}
		}

	}

}
