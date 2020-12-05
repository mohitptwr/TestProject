package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrMsgtxtOp {
	static {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\Selenium3.141.59\\\\exe\\\\chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		
		//click on login button
		driver.findElement(By.id("loginButton")).click();
		
		WebElement msg = driver.findElement(By.className("errormsg"));
		String str = msg.getText();
		System.out.println(str);
		driver.close();
		
		
	}
}
