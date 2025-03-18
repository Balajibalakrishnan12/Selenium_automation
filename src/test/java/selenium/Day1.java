package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day1 {
	public static void main(String[] args) {
		//browser launch 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Automation\\chromedriver.exe"); 
		//chrome browser location 
		
		//web driver instance created for selected browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		// web element
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		//web element action perform
		//list<webElement>
		//text box(send key,.gettext(),clear())
		//button(click,gettext())
		// dropdown
		WebElement dropDown=driver.findElement(By.className("product_sort_container"));
		 Select drop = new Select(dropDown);
		 drop.selectByIndex(3);
		 
		 WebElement dropDown1 = driver.findElement(By.className("product_sort_container"));
		 Select drop1 = new Select(dropDown);
		 drop1.selectByValue("hilo");
		 
		 
		 
		//checkbox
		//radiobutton 
		//navigate
		//maximize
	    //how to locate an element
		
		
		
	}

}
