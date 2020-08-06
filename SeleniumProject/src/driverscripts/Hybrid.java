package driverscripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import methods.OrgHRMMaster;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Hybrid {

	public static void main(String[] args) throws IOException, InterruptedException {
		String path="D:\\Jagbir_Sarbjith\\Workspace\\SeleniumProject\\src\\testData\\Hybrid.xlsx";
		String out_Path="D:\\Jagbir_Sarbjith\\Workspace\\SeleniumProject\\src\\results\\HybridRes.xlsx";
		String res=null;
		
		OrgHRMMaster om=new OrgHRMMaster();
		
		FileInputStream fi=new FileInputStream(path);
		
		XSSFWorkbook Wb=new XSSFWorkbook(fi);
		XSSFSheet TC_Sheet=Wb.getSheet("Testcase");
		XSSFSheet TS_Sheet=Wb.getSheet("Teststeps");
		XSSFSheet TD_Sheet=Wb.getSheet("TestData");
		XSSFSheet EmpRes=Wb.getSheet("EmpReg");
		
		int TC_Rc=TC_Sheet.getLastRowNum();
		int TS_Rc=TS_Sheet.getLastRowNum();
		int EmpRes_Rc=EmpRes.getLastRowNum();
		
		
		for (int i = 1; i <= TC_Rc; i++) {
			XSSFRow r=TC_Sheet.getRow(i);
			XSSFCell c=r.getCell(2);
			TC_Sheet.getRow(i).createCell(3);
			
			String exe=c.getStringCellValue();
			if (exe.equalsIgnoreCase("Y")) {
				String TC_TcId = r.getCell(0).getStringCellValue();
				
				for (int j = 1; j <= TS_Rc; j++) {
					String TS_TcId = TS_Sheet.getRow(j).getCell(0).getStringCellValue();
					
					if (TC_TcId.equalsIgnoreCase(TS_TcId)) {
						String key=TS_Sheet.getRow(j).getCell(3).getStringCellValue();
						System.out.println(key);
						
						switch (key) {
						case "Launch":
							String URL=TD_Sheet.getRow(1).getCell(0).getStringCellValue();
							res=om.org_Launch(URL);
							break;
						case "login":
							String u=TD_Sheet.getRow(1).getCell(1).getStringCellValue();
							String p=TD_Sheet.getRow(1).getCell(2).getStringCellValue();
							res=om.org_Login(u, p);
							break;
						case "logout":
							res=om.org_Logout();
							om.org_Close();
							break;
						case "Empreg":
							for (int k = 1; k <= EmpRes_Rc; k++) {
								String f=EmpRes.getRow(k).getCell(0).getStringCellValue();
								String l=EmpRes.getRow(k).getCell(1).getStringCellValue();
								String eid=EmpRes.getRow(k).getCell(2).getStringCellValue();
								res=om.org_EmpReg(f, l, eid);
								EmpRes.getRow(k).createCell(3).setCellValue(res);
							}
							break;
						case "Usereg":
							String ename=TD_Sheet.getRow(1).getCell(6).getStringCellValue();
							String uname=TD_Sheet.getRow(1).getCell(7).getStringCellValue();
							String pwd=TD_Sheet.getRow(1).getCell(8).getStringCellValue();
							String cpwd=TD_Sheet.getRow(1).getCell(9).getStringCellValue();
							res=om.org_UserReg(ename, uname, pwd, cpwd);
							break;
						case "Ulogin":	
							String un=TD_Sheet.getRow(1).getCell(7).getStringCellValue();
							String pw=TD_Sheet.getRow(1).getCell(8).getStringCellValue();
							res=om.org_Login(un, pw);
							break;
							
						default:
							System.out.println("Select a proper keyword");
							break;
						}
						
						TS_Sheet.getRow(j).createCell(4).setCellValue(res);
						
						if (!TC_Sheet.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail")) {
							TC_Sheet.getRow(i).getCell(3).setCellValue(res);
						}
					}
				}
				
			}
			else{
				TC_Sheet.getRow(i).getCell(3).setCellValue("BLOCKED");
			}
			
		}
		FileOutputStream fo=new FileOutputStream(out_Path);
		Wb.write(fo);
		Wb.close();

	}

}
