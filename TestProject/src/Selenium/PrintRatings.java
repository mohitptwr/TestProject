package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintRatings {
	static {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\Selenium3.141.59\\\\exe\\\\chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		//close popup
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.name("q")).sendKeys("mi"); 
		//click on search
		driver.findElement(By.className("L0Z3Pu")).click();
		Thread.sleep(5000);
		//print rating
		//String rating = driver.findElement(By.xpath("(//div[text()='Redmi 8A Dual (Midnight Grey, 32 GB)']/..//span[contains(text(),'Ratings')])[1]")).getText();
		//print rating nd review
		//String rr = driver.findElement(By.xpath("//div[text()='Redmi 8A Dual (Midnight Grey, 32 GB)']/../div[2]/span[2]/span")).getText();
		//System.out.println(rr);
		//print price
		String price = driver.findElement(By.xpath("//div[text()='Redmi 8A Dual (Midnight Grey, 32 GB)']/../..//div[@class='_30jeq3 _1_WHN1']")).getText();
		System.out.println(price);
		driver.close();
}}
