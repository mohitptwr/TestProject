package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyChkbox {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium3.141.59\\exe\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://localhost/login.do");
	
	WebElement chk = driver.findElement(By.id("keepLoggedInCheckBox"));
	
	boolean status = chk.isSelected();
			if(status)
			{
				System.out.println("Checkbox selected");
			}
			else
			{
				System.out.println("Checkbox not selected");
			}
			
			chk.click();
			boolean status1 = chk.isSelected();
			if(status1)
			{
				System.out.println("Checkbox selected");
			}
			else
			{
				System.out.println("Checkbox not selected");
			}
			driver.close();
}
}
