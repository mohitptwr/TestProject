package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblogin {
	static {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\Selenium3.141.59\\\\exe\\\\chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("mohitptwr@gmail.com");
		//email.clear();
		email.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(3000);
		email.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		email.sendKeys("8982791437");
		
		driver.findElement(By.id("pass"));
		driver.close();
	}

}
