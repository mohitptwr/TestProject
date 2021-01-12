package TakeScreenshot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.compress.compressors.FileNameUtil;
import org.apache.poi.examples.util.TempFileUtils;
import org.apache.xmlbeans.impl.xb.ltgfmt.TestCase.Files;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import jdk.javadoc.doclet.Reporter;

public class Sample {
	
	static {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium3.141.59\\exe\\chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		//Upcadst browser object
		TakesScreenshot shot=(TakesScreenshot)driver;
		//Take Screenshot
		File src = shot.getScreenshotAs(OutputType.FILE);
		
		//Location
		String path="../TestProject/screenshot/facebook.png";
		
		
		File destn=new File(path);
		//copy sceenshot to location		
	}
}
