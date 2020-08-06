package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Jagbir_Sarbjith/Jars/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://echoecho.com/htmlforms10.htm");

		List<WebElement> radios=driver.findElements(By.xpath("(//td[@class='table5'])[2]/input[@type='radio']"));
//		List<WebElement> radios=driver.findElements(By.name("group1"));
		System.out.println(radios.size());
		
		for (int i = 0; i < radios.size(); i++) {
			String rName=radios.get(i).getAttribute("value");
			System.out.println(rName);
			
//			if (rName.equalsIgnoreCase("cheese")) {
//				radios.get(i).click();
//			}else if (rName.equalsIgnoreCase("beer")) {
//				radios.get(i).click();
//			}
			
			if (rName.equalsIgnoreCase("cheese") || rName.equalsIgnoreCase("beer")) {
				radios.get(i).click();
			}
		}
	}

}
