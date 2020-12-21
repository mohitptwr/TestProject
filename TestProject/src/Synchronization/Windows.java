package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Windows {
	static {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\TestProject\\exe\\chromedriver.exe");
	}
	public static void main(String[] args) throws Exception  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		
		//verify no. of windows displayed
		WebDriverWait wait=new WebDriverWait(driver, 5);
		try {wait.until(ExpectedConditions.numberOfWindowsToBe(4));
		System.out.println("Expected windows displayed");
			
		} catch (Exception e) {
			System.out.println("Expected windows not displayed");
		}
		driver.quit();
	}
}
