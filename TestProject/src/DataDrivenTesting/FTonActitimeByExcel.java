package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FTonActitimeByExcel {
	static {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\TestProject\\exe\\chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		
		String path="D:\\Selenium\\TestProject\\User.xlsx";
		Workbook book=WorkbookFactory.create(new FileInputStream(path));
		//open sheet
		Sheet s = book.getSheet("Sheet9");
		int rownum = s.getLastRowNum();
		for (int i = 1; i <= rownum; i++) {
			driver.get("http://localhost/login.do");
			driver.manage().window().maximize();
			Row r = s.getRow(i);
			String un = r.getCell(0).toString();
			String pwd = r.getCell(1).toString();
			Thread.sleep(1500);
			driver.findElement(By.id("username")).sendKeys(un);
			Thread.sleep(1500);
			driver.findElement(By.name("pwd")).sendKeys(pwd);
			Thread.sleep(1500);
			//click on login
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(1500);
			//Verify
			String title = driver.getTitle();
			if (title.contains("Track")) {
				r.createCell(2).setCellValue("Pass");
			} else {
				r.createCell(2).setCellValue("Fail");
			}
			try {
				driver.findElement(By.id("logoutLink")).click();
			} catch (Exception e) {
				// TODO: handle exception
			}
			book.write(new FileOutputStream(path));
			
		}
		driver.close();
		System.out.println("Execution Complete");
	}
}
