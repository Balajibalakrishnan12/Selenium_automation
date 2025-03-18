package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameWindow {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/frame.html");
		//driver.switchTo().frame(0);
		//driver.findElement(By.id("Click")).click();
		//driver.switchTo().defaultContent();//to come out of one frame we use default content
	
		//System.out.println(driver.findElement(By.className("wp-heading")).getText());
//		driver.switchTo().frame(1);//access the main parent frame
//		driver.switchTo().frame(0);
//		driver.switchTo().frame("frame2");//accessing by frame name 
//		driver.switchTo().frame(driver.findElement(By.id("frame2")));
//		driver.findElement(By.id("Click1")).click();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		driver.switchTo().frame("frame2");
		driver.switchTo().frame(driver.findElement(By.id("frame2")));
		driver.findElement(By.id("Click1")).click();
		
		
		
				

	}

}
