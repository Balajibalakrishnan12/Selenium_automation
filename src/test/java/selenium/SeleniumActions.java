package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumActions {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/mouseOver.html#");
		Actions actions = new Actions(driver);//to perform action in driver
		 WebElement mousehover = driver.findElement(By.xpath("//a[text()='TestLeaf Courses']"));
		 //actions.keyDown(Keys.SHIFT).sendKeys(loginUserId,"standard_user").keyUp(Keys.SHIFT).sendKeys(Keys.ENTER).perform();
		 actions.moveToElement(mousehover).moveToElement(driver.findElement(By.xpath("//a[text()='Selenium']"))).contextClick().build().perform();
		

	}

}
