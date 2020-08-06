package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGMaster {
	public static WebDriver driver=null;
	public static String expval,actval;
	public static String path="D:\\Jagbir_Sarbjith\\Workspace\\SeleniumProject\\src\\properties\\OrgHRM.properties";
	public static FileInputStream fi=null;
	public static Properties pr=null;
	
//	public String URL="https://opensource-demo.orangehrmlive.com";
//	public String u="admin",p="admin123";
	public static String URL="http://orangehrm.qedgetech.com";
	public static String u="Admin",p="Qedge123!@#";
	public static  String f="Anurag S",l="K",eid="AK125593";
	public static String ename=f+" "+l,uname=f+l+"1234567890",pwd=f+l+"@1234567890",cpwd=f+l+"@1234567890";
	
	@BeforeSuite
	public void org_Launch() throws IOException{
		expval="LOGIN";
		System.setProperty("webdriver.gecko.driver", "D:\\Jagbir_Sarbjith/Jars/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		fi=new FileInputStream(path);
		
		pr=new Properties();
		pr.load(fi);
		
		actval=driver.findElement(By.id(pr.getProperty("login"))).getAttribute("Value");

		Assert.assertEquals(actval, expval, "Launch Failed");
	}
	
	@BeforeTest
	public void org_Login(){
		expval="welcome";
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys(u);
		driver.findElement(By.id(pr.getProperty("password"))).sendKeys(p);
		driver.findElement(By.id(pr.getProperty("login"))).click();
		
		actval=driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		
		Assert.assertEquals(actval, expval, "Login Failed");
	}
	
	@AfterTest
	public void org_Logout() throws InterruptedException{
		expval="LOGIN";
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		actval=driver.findElement(By.id("btnLogin")).getAttribute("Value");
		
		Assert.assertEquals(actval, expval, "Logout Failed");
	}
	
	@AfterSuite
	public void org_Close(){
		driver.close();
	}
}
