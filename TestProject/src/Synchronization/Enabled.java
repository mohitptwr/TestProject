package Synchronization;

import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Enabled {
	static {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\TestProject\\exe\\chromedriver.exe");
	}
	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Selenium/element.html");
		WebElement element = driver.findElement(By.id("username"));
		
		//there are two ways either use isEnabled method or else use Explicit wait conditions
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		try {wait.until(ExpectedConditions.elementToBeClickable(element));
			element.sendKeys("Mohit");
			System.out.println("Element is enabled");
			
		} catch (Exception e) {
			System.out.println("Element is disabled");
		}
		driver.close();
	}

}
