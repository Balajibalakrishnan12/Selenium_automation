package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class TestJava {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Automation\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();//creating instance
//		driver.get("https://www.google.com");
//		//driver.close();
//		driver.manage().window().maximize();
		
		
		
		
		
		
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();
//		driver.findElement(By.id("inventory_container")).isDisplayed();
//		driver.findElement(By.className("inventory_item_img")).click();
//		driver.findElement(By.className("btn_primary")).click();
//		driver.findElement(By.className("shopping_cart_container")).click();
//		driver.findElement(By.className("cart_item_label")).isDisplayed();
//		List<WebElement> inventoryList = driver.findElements(By.className("inventory_item_name"));
//		System.out.println(inventoryList.size());
//		for(int i=0;i<inventoryList.size();i++)
//		{
//			//System.out.println(inventoryList.get(i).getText());
//			if(inventoryList.get(i).getText().equals("Sauce Labs Bolt T-Shirt"))
//			{
//				inventoryList.get(i).click();		
//				}
//			
//		}
//		
//		WebElement dropDownelement = driver.findElement(By.className("product_sort_container"));
//		Select dropDownSelect = new Select(dropDownelement);
//		//dropDownSelect.selectByIndex(2);
//		//dropDownSelect.selectByVisibleText("Price (high to low)");
//		dropDownSelect.selectByValue("lohi");
		
//		driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Dropdown.html");
//		driver.findElement(By.className("wp-page-heading")).isDisplayed();
//		WebElement dropDownlist = driver.findElement(By.id("dropdown1"));
//		Select dropDownSelect = new Select(dropDownlist);
//		dropDownSelect.selectByIndex(2);
//		Thread.sleep(3000);		
//		
		
//		WebElement dropDownText = driver.findElement(By.name("dropdown2"));
//		Select dropDownSelect1 = new Select(dropDownText);
//		dropDownSelect1.selectByVisibleText("Loadrunner");
//		Thread.sleep(3000);	
//		
//		
//		WebElement dropDownValue = driver.findElement(By.id("dropdown3"));
//		Select dropDownSelect2 = new Select(dropDownValue);
//		dropDownSelect2.selectByValue("3");
//		
//		
//		
//		WebElement dropDownValue1 = driver.findElement(By.className("dropdown"));
//		Select dropDownSelect3 = new Select(dropDownValue1);
//		System.out.println(dropDownSelect3.getOptions().size());
//		
//		WebElement dropDownValue2 = driver.findElement(By.className("example"));
//		Select dropDownSelect4 = new Select(dropDownValue2);
//		dropDownSelect4.selectByVisibleText("Appium");
//		dropDownSelect4.selectByVisibleText("Loadrunner");
		
//		driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/checkbox.html");
//		driver.findElement(By.className("wp-page-heading")).isDisplayed();
//		driver.findElement(By.xpath("//div[text()='Java']//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//div[text()='VB']//input[@type='checkbox']")).click();
//		System.out.println(driver.findElement(By.xpath("//div[text()='Selenium']//input[@type='checkbox']")).isSelected());
//		driver.findElement(By.xpath("//div[text()='Selenium']//input[@type='checkbox']")).isSelected();
//		List<WebElement> checkboxlist = driver.findElements(By.xpath("//div/label[text()='DeSelect only checked']/following-sibling::div/input"));
//		for(int i=0;i<checkboxlist.size();i++)
//		{
//			if(checkboxlist.get(i).isSelected())
//			{
//				checkboxlist.get(i).click();
//			}
//		}
//		
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("inventory_container")).isDisplayed();
		List<WebElement> inventoryList = driver.findElements(By.className("inventory_item_price"));
		System.out.println(inventoryList.size());
		List<WebElement> priceElements = driver.findElements(By.className("inventory_item_price"));
        double highestPrice = 0.0;// intializing the variable 
        for (WebElement price : priceElements) {
        	System.out.println(price.getText());
        	System.out.println(price.getText().replace("$",""));
            double priceValue = Double.parseDouble(price.getText().replace("$", ""));//double.parseDouble is used to convert the String 
          if (priceValue > highestPrice) 
          {
                highestPrice = priceValue;
                
            }
        }

        System.out.println("The highest price is: $" + highestPrice);
        System.out.println(driver.findElement(By.xpath("//div[text() ='"+highestPrice+"']/parent::div/preceding-sibling::div[@class=\"inventory_item_label\"]//div[@class=\"inventory_item_name\"]")).getText());
		
		
	}
	}

	
