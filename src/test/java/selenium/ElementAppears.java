package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementAppears {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/appear.html");
		WebDriverWait appear = new WebDriverWait(driver,Duration.ofSeconds(10));
		appear.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div//button[5]"))));
		System.out.println(appear.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div//button[5]")))).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//div//button[5]")).getText());
		
	}

}
