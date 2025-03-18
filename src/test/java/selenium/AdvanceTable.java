package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/sorttable.html");
		List<WebElement> tablerow = driver.findElements(By.xpath("//table[@id='table_id']//tr"));
		System.out.println(tablerow.size()-1);
		List<WebElement> tablecolomn = driver.findElements(By.xpath("//table[@id='table_id']//tr/th"));
		System.out.println(tablecolomn.size());
//		for(int i=1;i<=tablerow.size();i++)
//		{
//			for(int j=1;j<=tablecolomn.size();j++)
//			{
//				String tablexpath="//table[@id='table_id']//tr["+i+"]/td["+j+"]";
//				WebElement b = driver.findElement(By.xpath(tablexpath));
//				System.out.println(b.getText());
//				
//			}
//		}
		
		WebElement nameheader=driver.findElement(By.xpath("//th[text()='Emp_ID']"));
		nameheader.click();
		nameheader.click();
//		for(int i=1;i<=tablerow.size();i++)
//		{
//			for(int j=1;j<=tablecolomn.size();j++)
//			{
//				String deces="//table[@id='table_id']//tr["+i+"]/td["+j+"]";
//				WebElement c = driver.findElement(By.xpath(deces));
//				System.out.println(c.getText());
//				
//			}
//		}
		String deces="//table[@id='table_id']//tr[1]/td[2]";
		WebElement c = driver.findElement(By.xpath(deces));
		System.out.println(c.getText());
		
		
		

	}

}
