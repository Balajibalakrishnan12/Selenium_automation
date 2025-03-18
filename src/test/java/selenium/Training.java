package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Training {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Automation\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();//creating instance
		
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		Select dropdown = new Select(driver.findElement(By.className("product_sort_container")));
		dropdown.selectByVisibleText("Price (high to low)");
		List<WebElement> inventoryList = driver.findElements(By.className("inventory_item_name"));
		System.out.println(inventoryList.get(2).getText());
		
		
		
		
		
		
		
		

	}

}
