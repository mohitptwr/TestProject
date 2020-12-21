package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayTotalLinks {
	static {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\TestProject\\exe\\chromedriver.exe");
	}
	public static void main(String[] args) throws Exception  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//Identify all links
		List<WebElement> ref = driver.findElements(By.tagName("a"));
		int totalLinks = ref.size();
		System.out.println("Total links on webpage is "+totalLinks);
		
		//for visible links
		int visibleLinks=0;
		//for not visible links
		int notvisibleLinks=0;
		
		for (int i = 0; i <= totalLinks; i++) {
			WebElement rv = ref.get(i);
			if(rv.isDisplayed()) {
				visibleLinks++;
			}
			else {
				notvisibleLinks++;
			}
		}
		System.out.println("Total visible links are "+visibleLinks);
		System.out.println("Total not visible links are "+notvisibleLinks);
	}
}
