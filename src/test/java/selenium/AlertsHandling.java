package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Alert.html");
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		String actionResult = driver.findElement(By.xpath("//button[text()='Confirm Box']//following-sibling::p")).getText();
		if(actionResult.equals("You pressed Cancel!"))
		{
			System.out.println("testpassed");
		}
		else {
			System.out.println("test failed");
		}
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		driver.switchTo().alert().sendKeys("Smvec College");
		driver.switchTo().alert().accept();
//		driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
//		System.out.println(driver.switchTo().alert().getText());
		
		
		
		
	}

}
