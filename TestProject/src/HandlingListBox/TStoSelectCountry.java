package HandlingListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TStoSelectCountry {
	static {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\TestProject\\exe\\chromedriver.exe");
	}
	public static void main(String[] args) throws Exception  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fatcow.com/");
		Thread.sleep(3000);
		
		WebElement country = driver.findElement(By.id("countrySelect"));
		
		//Select by using select class
		Select s=new Select(country);
		s.selectByVisibleText("Canada");
		Thread.sleep(5000);
		driver.close();
	
	}
}
