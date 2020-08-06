package methods;

import java.io.IOException;

public class TestSuiteEg {

	public static void main(String[] args) throws InterruptedException, IOException {
		OrgHRMMaster master=new OrgHRMMaster();
		
		//LoginTC
		
		String res=master.org_Launch("https://opensource-demo.orangehrmlive.com");
		System.out.println("Launch :"+res);
		
		res=master.org_Login("admin", "admin123");
		System.out.println("Login :"+res);
		
		res=master.org_Logout();
		System.out.println("Logout :"+res);
		
		master.org_Close();
		System.out.println("Application clossed successfully");
		
		
		//Employee REG TC
		res=master.org_Launch("https://opensource-demo.orangehrmlive.com");
		System.out.println("Launch :"+res);
		
		res=master.org_Login("admin", "admin123");
		System.out.println("Login :"+res);
		
		res=master.org_EmpReg("Sarbijit", "Singh", "SS12345");
		System.out.println("Employee Registration :"+res);
		
		res=master.org_Logout();
		System.out.println("Logout :"+res);
		
		master.org_Close();
		System.out.println("Application clossed successfully");
		
		
		//User REG
		
		res=master.org_Launch("https://opensource-demo.orangehrmlive.com");
		System.out.println("Launch :"+res);
		
		res=master.org_Login("admin", "admin123");
		System.out.println("Login :"+res);
		
		res=master.org_UserReg("Sarbijit Singh", "SarbijitSingh123456788", "SarbijitSingh123456788", "SarbijitSingh123456788");
		System.out.println("User Registration :"+res);
		
		res=master.org_Logout();
		System.out.println("Logout :"+res);
		
		master.org_Close();
		System.out.println("Application clossed successfully");

		//User LOGIN
		
		res=master.org_Launch("https://opensource-demo.orangehrmlive.com");
		System.out.println("Launch :"+res);
		
		res=master.org_Login("SarbijitSingh123456788", "SarbijitSingh123456788");
		System.out.println("User Login :"+res);
		
		res=master.org_Logout();
		System.out.println("Logout :"+res);
		
		master.org_Close();
		System.out.println("Application clossed successfully");
	}

}
