package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderEg {

	@Test(dataProvider="data")
	public void org_EmpReg(String f, String l,String eid){
		
		System.out.println(f+"----"+l+"----"+eid);
	
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
