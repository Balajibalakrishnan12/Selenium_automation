package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/disapper.html");
		//Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div//strong"))));// to check the visibility 
		System.out.println(wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div//strong")))).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//div//strong")).getText());

	}

}
