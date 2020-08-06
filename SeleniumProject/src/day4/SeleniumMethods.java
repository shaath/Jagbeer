package day4;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Jagbir_Sarbjith/Jars/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		driver.get("http://google.com");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
		
//		System.out.println(driver.getPageSource());
		
		driver.navigate().to("https://faceboook.com");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
	}

}
