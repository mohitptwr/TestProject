package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyFieldAllignment {
	static {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\Selenium3.141.59\\\\exe\\\\chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		
		WebElement user = driver.findElement(By.id("username"));
		
		int user_yloc=user.getLocation().getY();
		System.out.println(user_yloc);
		WebElement pwd = driver.findElement(By.name("pwd"));
		
		int pwd_yloc=pwd.getLocation().getY();
		int space=4;
		int total = space+pwd_yloc;
		System.out.println(total);
		
		if(total>user_yloc) {
			System.out.println("Password allined properly");
		}
		else {
			System.out.println("pwd not alligned properly");
		}
		driver.quit();

}}
