package HandelingAuosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestions {
	static {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\TestProject\\exe\\chromedriver.exe");
}
public static void main(String[] args) throws Exception  {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	Thread.sleep(3000);
	//Enter text selenium in textfield
	driver.findElement(By.name("q")).sendKeys("Slelenium");
	Thread.sleep(3000);
	List<WebElement> rv = driver.findElements(By.xpath("//span[contains(text(),'Selenium')]"));
	for (int i = 0; i < rv.size(); i++) {
		WebElement txt = rv.get(i);
		String str = txt.getText();
		System.out.println(str);
	}
	driver.close();
  }
}
