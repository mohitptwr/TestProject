package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplelinks {
	static {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\TestProject\\exe\\chromedriver.exe");
	}
	public static void main(String[] args) throws Exception  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		//find all the links on webpage by using findelements method
		List<WebElement> rv = driver.findElements(By.tagName("a"));
		 int s = rv.size();
		//System.out.println(s);
		
		//get text of all the links
		for (int i = 0; i <s; i++) {
			WebElement link =(WebElement) rv.get(i);
			String txt = link.getText();
			
			if(txt.isEmpty()) {
				
			}
			else {
				System.out.println(txt);
			}
		}
		driver.close();
	}
}
