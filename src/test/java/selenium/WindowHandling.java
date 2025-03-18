package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Window.html");
		//driver.findElement(By.id("home")).click();
		String parentWindow= driver.getWindowHandle();
        driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
       Set<String> childWindows= driver.getWindowHandles();//to check overall window
      System.out.println("THESE ARE CHILDWINDOWS");
      System.out.println(childWindows.size()-1);//removing parent window
      int count=0;
       for(String childWindow:childWindows)
       {
    	   
    	   if(!parentWindow.equals(childWindow))
    	   {
    		   count++;
    		   
    	   System.out.println(childWindow);
    	   driver.switchTo().window(childWindow);
    	   driver.close();
    	   }
    	   
       }
      driver.switchTo().window(parentWindow);//to switch to particular window and close the window
       System.out.println(count);
       driver.close();
        
			
	
	}

}
