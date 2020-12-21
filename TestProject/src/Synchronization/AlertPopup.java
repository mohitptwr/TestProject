package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\TestProject\\exe\\chromedriver.exe");
	}
	public static void main(String[] args) throws Exception  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.irsdc.in/employee-login");
		
		driver.findElement(By.xpath("//a[text()='Employees corner']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 10000);
		wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("Alert is present");
		driver.close();
		
	}
}
