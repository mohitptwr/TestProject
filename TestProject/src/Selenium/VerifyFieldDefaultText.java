package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyFieldDefaultText {
	static {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\Selenium3.141.59\\\\exe\\\\chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		String str1 = email.getAttribute("placeholder");
		System.out.println(str1);
		if(str1.isEmpty()) {
			System.out.println("Email not contains default text");
		}
		else {
			System.out.println("Email  contains default text");
		}
		
		WebElement pwd = driver.findElement(By.id("pass"));
		String str2 = pwd.getAttribute("placeholder");
		System.out.println(str2);
		if(str2.isEmpty()) {
			System.out.println("Password not contains default text");
		}
		else {
			System.out.println("Password  contains default text");
		}
		driver.quit();
}}
