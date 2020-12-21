package DataDrivenTesting;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginActitimeUsingExcel {
	static {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\TestProject\\exe\\chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		//open application
		driver.get("http://localhost/login.do");
		
		String path="D:\\Selenium\\TestProject\\User.xlsx";
		//Read
		FileInputStream file=new FileInputStream(path);
		//open Workbook
		Workbook book=WorkbookFactory.create(file);
		
		String un = book.getSheet("Sheet8").getRow(1).getCell(0).toString();
		String pwd = book.getSheet("Sheet8").getRow(1).getCell(1).toString();
		
		//Enter username
		driver.findElement(By.id("username")).sendKeys(un);
		Thread.sleep(3000);
		//Enter password
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		Thread.sleep(3000);
		//click on login
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		//get title
		String title = driver.getTitle();
		if (title.contains("Track")) {
			System.out.println("pass");
		} else {
			System.out.println("Fail");
		}
		driver.close();
		System.out.println("Execution Completed");
	}		
}
