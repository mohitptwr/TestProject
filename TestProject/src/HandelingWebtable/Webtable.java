package HandelingWebtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {static {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\TestProject\\exe\\chromedriver.exe");
	}
	public static void main(String[] args) throws Exception  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Documents/dynamic.html");
		List<WebElement> rv = driver.findElements(By.tagName("tr"));
		System.out.println(rv.size());
		
		//Show the text of one row
		WebElement txt = driver.findElement(By.xpath("//tr[1]"));
		String tablerow = txt.getText();
		System.out.println(tablerow);
		driver.close();
	}
}
