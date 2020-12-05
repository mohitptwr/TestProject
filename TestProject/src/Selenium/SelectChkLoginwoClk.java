package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectChkLoginwoClk {
	static {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\Selenium3.141.59\\\\exe\\\\chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		
		//select checkbox without using click
		driver.findElement(By.id("keepLoggedInCheckBox")).sendKeys(Keys.SPACE);
		Thread.sleep(5000);
		//click on login button without using click
		driver.findElement(By.id("loginButton")).sendKeys(Keys.ENTER);
		
		driver.close();
	}
}
