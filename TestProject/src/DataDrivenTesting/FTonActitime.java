package DataDrivenTesting;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FTonActitime {
	static {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\TestProject\\\\exe\\\\chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		Properties p=new Properties();
		
		//property file path
		String path="../TestProject/actitime.properties";
		
		//read the file
		FileInputStream file=new FileInputStream(path);
		p.load(file);
		for (int i = 1; i <=4; i++) {
			String un=p.getProperty("user"+i);
			String pwd=p.getProperty("pwd"+i);
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://localhost/login.do");
			Thread.sleep(3000);
			driver.findElement(By.id("username")).sendKeys(un);
			Thread.sleep(3000);
			driver.findElement(By.name("pwd")).sendKeys(pwd);
			Thread.sleep(3000);
			//click on login
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(3000);
			driver.quit();
		}
		System.out.println("Execution Completed");
	}
}
