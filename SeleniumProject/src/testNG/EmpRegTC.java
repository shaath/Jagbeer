package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpRegTC extends TestNGMaster{
	
	@Test(dataProvider="data")
	public void org_EmpReg(String f, String l,String eid){
		System.out.println(f+"----"+l+"----"+eid);
		expval=f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys(eid);
		driver.findElement(By.id("btnSave")).click();
		
		actval=driver.findElement(By.xpath("//div[@id='profile-pic']/h1")).getText();
		
		Assert.assertEquals(actval, expval, "Employee Registration Failed");
	}
	
	@DataProvider
	public String[][] data(){
		
		String[][] x=new String[3][3];
		
		x[0][0]="Auto";
		x[0][1]="Test1";
		x[0][2]="AT9876";
		
		x[1][0]="Auto";
		x[1][1]="Test2";
		x[1][2]="AT9875";
		
		x[2][0]="Auto";
		x[2][1]="Test3";
		x[2][2]="AT9874";
		
		return x;
	}
	
}
