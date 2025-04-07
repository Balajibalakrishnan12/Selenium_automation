package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
public class JavaScriptExecutorTest {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		jsMiddleOfThePage(driver);
		
	}
	public static void jstitle(WebDriver driver) {
		driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/mouseOver.html#");
		JavascriptExecutor js = (JavascriptExecutor) driver;//type casting
		System.out.println(js.executeScript("return document.title;"));
	}
	
	public static void jsclick(WebDriver driver) {
		driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Button.html");
		JavascriptExecutor js = (JavascriptExecutor) driver;//type casting
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[@id='home']")));
	}
	public static void jsHighlight(WebDriver driver) {
		driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Button.html");
		JavascriptExecutor js = (JavascriptExecutor) driver;//type casting
		js.executeScript("arguments[0].style.backgroundColor='red';", driver.findElement(By.xpath("//button[@id='home']")));
	}
	public static void jsMouseHover(WebDriver driver) {
		driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/mouseOver.html");
		JavascriptExecutor js = (JavascriptExecutor) driver;//type casting
		WebElement mousehover = driver.findElement(By.xpath("//a[text()='TestLeaf Courses']"));
		js.executeScript("var event=new MouseEvent('mouseover','{bubbles:true,cancelable:true}'); arguments[0].dispatchEvent(event)",mousehover);
	}

	public static void jsScrollToView(WebDriver driver) {
		driver.get("https://www.saucedemo.com/v1/");
		JavascriptExecutor js = (JavascriptExecutor) driver;//type casting
		WebElement lastElement = driver.findElement(By.xpath("//div/br[4]"));
		js.executeScript("arguments[0].scrollIntoView(true);", lastElement);
	}
	public static void jsScrollToTop(WebDriver driver) {
		driver.get("https://www.saucedemo.com/v1/");
		JavascriptExecutor js = (JavascriptExecutor) driver;//type casting
		js.executeScript("window.scrollTo(0,0);");
	}
	public static void jsEndOfThePage(WebDriver driver) {
		driver.get("https://www.saucedemo.com/v1/");
		JavascriptExecutor js = (JavascriptExecutor) driver;//type casting
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
	}
	public static void jsMiddleOfThePage(WebDriver driver) {
		driver.get("https://docs.github.com/en/rest?apiVersion=2022-11-28");
		JavascriptExecutor js = (JavascriptExecutor) driver;//type casting
		js.executeScript("window.scrollTo(0,document.body.scrollHeight/2);");
	}

	
}
