package DataDrivenTesting;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginactiTime {
	static {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\Selenium3.141.59\\\\exe\\\\chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		Properties p=new Properties();
		
		//property file path
		String path="../TestProject/actitime.properties";
		
		//read the file
		FileInputStream file=new FileInputStream(path);
		p.load(file);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Taking Url from property file
		driver.get(p.getProperty("url"));
		Thread.sleep(3000);
		//Enter UN
		driver.findElement(By.id("username")).sendKeys(p.getProperty("user"));
		Thread.sleep(3000);
		//Enter password
		driver.findElement(By.name("pwd")).sendKeys(p.getProperty("pwd"));
		Thread.sleep(3000);
		//click on login
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
