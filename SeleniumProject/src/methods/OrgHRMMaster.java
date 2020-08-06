package methods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrgHRMMaster {
	
	public WebDriver driver;
	public String expval,actval;
	public String path="D:\\Jagbir_Sarbjith\\Workspace\\SeleniumProject\\src\\properties\\OrgHRM.properties";
	public FileInputStream fi=null;
	public Properties pr=null;
	
	//Launch
	public String org_Launch(String URL) throws IOException{
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
		
		if (expval.equalsIgnoreCase(actval)) {
			return "Pass";
		}else{
			return "Fail";
		}
	}
	//Login
	public String org_Login(String u,String p){
		expval="welcome";
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys(u);
		driver.findElement(By.id(pr.getProperty("password"))).sendKeys(p);
		driver.findElement(By.id(pr.getProperty("login"))).click();
		
		actval=driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		
		if (expval.equalsIgnoreCase(actval)) {
			return "Pass";
		}else{
			return "Fail";
		}
	}
	
	//Employee Registration
	public String org_EmpReg(String f,String l, String eid){
		expval=f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys(eid);
		driver.findElement(By.id("btnSave")).click();
		
		actval=driver.findElement(By.xpath("//div[@id='profile-pic']/h1")).getText();
		
		if (expval.equalsIgnoreCase(actval)) {
			return "Pass";
		}else{
			return "Fail";
		}
	}
	
	//User Registration
	public String org_UserReg(String ename,String uname,String pwd,String cpwd) throws InterruptedException{
		expval=uname;
		boolean flag=false;
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.linkText("Users")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("btnAdd")).click();
		
		driver.findElement(By.id("systemUser_employeeName_empName")).clear();
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(ename);
		driver.findElement(By.id("systemUser_userName")).sendKeys(uname);
		driver.findElement(By.id("systemUser_password")).sendKeys(pwd);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(cpwd);
		Thread.sleep(3000);
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(3000);
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		for (int i = 0; i < rows.size(); i++) {
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			actval=cols.get(1).getText();
			if (expval.equalsIgnoreCase(actval)) {
				flag=true;
				break;
			}
		}
		if (flag) {
			return "Pass";
		}else{
			return "Fail";
		}
	}
	
	//Logout
	public String org_Logout() throws InterruptedException{
		expval="LOGIN";
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		actval=driver.findElement(By.id("btnLogin")).getAttribute("Value");
		
		if (expval.equalsIgnoreCase(actval)) {
			return "Pass";
		}else{
			return "Fail";
		}
	}
	
	//Close
	public void org_Close(){
		driver.close();
	}
	
	
}
