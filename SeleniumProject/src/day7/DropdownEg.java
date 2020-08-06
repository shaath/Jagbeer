package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Jagbir_Sarbjith/Jars/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=874014d5832a4679b2a1c5fc6b68fbbf");

		WebElement country=driver.findElement(By.name("country"));
		
		Select sel=new Select(country);
		
//		sel.selectByIndex(4);
//		sel.selectByValue("9");
//		sel.selectByVisibleText("INDIA");
		
		List<WebElement> cList=sel.getOptions();
		System.out.println(cList.size());
		
		for (int i = 0; i < cList.size(); i++) {
			String cName=cList.get(i).getText();
			System.out.println(cName);
		}
	}

}
