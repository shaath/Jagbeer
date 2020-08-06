package xlOps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import methods.OrgHRMMaster;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOps {

	public static void main(String[] args) throws IOException, InterruptedException {
		OrgHRMMaster om=new OrgHRMMaster();
		
		String path="D:\\Jagbir_Sarbjith\\Workspace\\SeleniumProject\\src\\testData\\EmpData.xlsx";
		String out_path="D:\\Jagbir_Sarbjith\\Workspace\\SeleniumProject\\src\\results\\Empres.xlsx";
		String res=null;
		
		FileInputStream fi=new FileInputStream(path);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Sheet1");
//		XSSFRow r=ws.getRow(4);
//		XSSFCell c=r.getCell(1);
		
//		System.out.println(c.getStringCellValue());
		
		int rc=ws.getLastRowNum();
		System.out.println(rc);

		om.org_Launch("https://opensource-demo.orangehrmlive.com");
		om.org_Login("admin", "admin123");		
		
		for (int i = 1; i <= rc; i++) {
			XSSFRow r=ws.getRow(i);
			XSSFCell c1=r.getCell(0);
			XSSFCell c2=r.getCell(1);
			XSSFCell c3=r.getCell(2);
			
			XSSFCell c4=r.createCell(3);
			
			String f=c1.getStringCellValue();
			String l=c2.getStringCellValue();
			String Eid=c3.getStringCellValue();
			
			System.out.println(f+"----"+l+"-----"+Eid);
			
			res=om.org_EmpReg(f, l, Eid);
			
			c4.setCellValue(res);
		}
		
		FileOutputStream fo=new FileOutputStream(out_path);
		wb.write(fo);
		wb.close();
		
		om.org_Logout();
		om.org_Close();
	}

}
