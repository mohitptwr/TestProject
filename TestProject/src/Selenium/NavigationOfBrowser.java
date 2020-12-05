package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationOfBrowser {
	static {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\Selenium3.141.59\\\\exe\\\\chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		//open facebook
		driver.navigate().to("https://www.facebook.com/");
		
		//back to google
		driver.navigate().back();
		
		//foward to facebook
		driver.navigate().forward();
		
		//Refresh
		driver.navigate().refresh();
		
		driver.close();
		
	}

}
