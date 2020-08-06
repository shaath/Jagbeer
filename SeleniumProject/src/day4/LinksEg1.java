package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Jagbir_Sarbjith/Jars/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();

		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		
		//Way 1
//		driver.findElement(By.xpath("//a[@href='home.aspx']")).click();
		
		//Way 2
//		driver.findElement(By.xpath("//table[@id='Table_011']")).findElement(By.linkText("Home")).click();
//		driver.findElement(By.xpath("//table[@id='Table_011']//a[@href='home.aspx']")).click();
		driver.findElement(By.xpath("//table[@id='Table_011']//a[text()='Home']")).click();
	}

}
