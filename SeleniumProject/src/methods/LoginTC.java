package methods;

import java.io.IOException;

public class LoginTC {

	public static void main(String[] args) throws InterruptedException, IOException {
		OrgHRMMaster master=new OrgHRMMaster();
		
		String res=master.org_Launch("https://opensource-demo.orangehrmlive.com");
		System.out.println("Launch :"+res);
		
		res=master.org_Login("admin", "admin123");
		System.out.println("Login :"+res);
		
		res=master.org_Logout();
		System.out.println("Logout :"+res);
		
		master.org_Close();
		System.out.println("Application clossed successfully");
	}

}
