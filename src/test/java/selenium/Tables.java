package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/table.html");
		List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='table_id']//tr"));
		System.out.println(tableRows.size()-1);
		List<WebElement> tableColomns = driver.findElements(By.xpath("//table[@id='table_id']//tr/th"));
		System.out.println(tableColomns.size());
		for(int i=2;i<=tableRows.size();i++)
		{
			for(int j=1;j<=tableColomns.size();j++)
			{
				String tablexpath="//table[@id='table_id']//tr["+i+"]/td["+j+"]";
			WebElement a = driver.findElement(By.xpath(tablexpath));
				System.out.println(a.getText());
				
			}
			
		}
		
	}

}
