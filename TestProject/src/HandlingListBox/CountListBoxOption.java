package HandlingListBox;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountListBoxOption {
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
		
		WebElement year = driver.findElement(By.id("month"));
		Select s=new Select(year);
		//Getting the counnt of the options present in month listbox by using getOptions() method
		List<WebElement> ref = s.getOptions();
		
		System.out.println("Total options present in month list box is "+ref.size());
		for (int i = 0; i < ref.size(); i++) {
			WebElement rv = ref.get(i);
			String txt = rv.getText();
			System.out.println(txt);
			if(txt.contains("Jan")) {
				System.out.println("Jans is in the list");
			}
			else {
				System.out.println("Jans is not in the list");
			}	
		}
		
		driver.close();
	}
}
