package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitlendUrl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium3.141.59\\exe\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        
        String url = driver.getCurrentUrl();
        System.out.println(url);
        driver.close();
	}

}
