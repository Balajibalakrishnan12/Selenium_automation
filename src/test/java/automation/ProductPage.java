package automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends DriverManager{

	public WebElement productPageTitle = driver.findElement(By.className("product_label"));
	public WebElement dropDownelement = driver.findElement(By.className("product_sort_container"));
	public WebElement menuBarOption = driver.findElement(By.className("bm-burger-button"));
	public WebElement logoutButton=driver.findElement(By.id("logout_sidebar_link"));
    public WebElement cartButton = driver.findElement(By.id("shopping_cart_container"));
    public List<WebElement> inventoryListItem = driver.findElements(By.className("inventory_item_name"));
    
    public  void dropDownByIndex(int index)
	{
		Select dropDownSelect = new Select(dropDownelement);
		dropDownSelect.selectByIndex(index);
		
	}
	
	public  void dropDownByVisible(String text)
	{
		Select dropDownText = new Select(dropDownelement);
		dropDownText.selectByVisibleText(text);
		
	}
	public void dropDownByvalue(String value)
	{
		Select dropDownValue = new Select(dropDownelement);
		dropDownValue.selectByValue(value);
	}
	public  void explicitWait(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public  void menuBar() 
	{
	menuBarOption.click();
	
	}
	public void clickLogoutButton()
	{
		explicitWait(logoutButton);
		logoutButton.click();
	}
	
	public  void addToCartButton()
	{
		cartButton.click();
	}
	
	public  void inventoryList()
	{
		System.out.println(inventoryListItem.size());
		for(int i=0;i<inventoryListItem.size();i++)
		{
			inventoryListItem.get(i).getText();
			
		}
	}
}
