package day10;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsEg3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Jagbir_Sarbjith/Jars/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		
		Thread.sleep(5000);

		Alert alt=driver.switchTo().alert();
		
		alt.sendKeys("Jagbir");
		Thread.sleep(5000);
		
		System.out.println(alt.getText());
		
		alt.accept();
	}
}
