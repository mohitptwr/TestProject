package HandlingListBox;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TStoSelectDOBonfb {
	static {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\TestProject\\exe\\chromedriver.exe");
	}
	public static void main(String[] args) throws Exception  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		//click on create new button
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(5000);
		//Slect date using sendkeys
		driver.findElement(By.xpath("//option[text()='12']")).click();
		Thread.sleep(3000);
		//Select month by using Robot Class
		driver.findElement(By.id("month")).click();
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_UP);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_UP);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		//Slect year by using Select class
		WebElement year = driver.findElement(By.id("year"));
		
		Select s=new Select(year);
		//s.selectByIndex(5);
		//s.selectByValue("1995");
		s.selectByVisibleText("1995");
		Thread.sleep(3000);
		driver.close();
	}
}
