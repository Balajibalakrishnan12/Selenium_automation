package automation;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestCase {
	@Test
public void test() {		
		//will have only have steps to implements
		DriverManager.getDriver("chrome");
		DriverManager.url("https://www.saucedemo.com/v1/");
		//login with username and password 
		LoginPage login = new LoginPage();
		login.loginTextBox("standard_user","secret_sauce");
		//click&select dropdown
		ProductPage product=new ProductPage();
		product.dropDownByIndex(2);
		//click menubar
		product.menuBar();
		product.clickLogoutButton();
		
		
		
		
		
		
		
	}
	
}
