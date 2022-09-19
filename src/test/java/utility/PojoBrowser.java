package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PojoBrowser 
{   
   public static WebDriver openfirefox()
   { 
   System.setProperty("webdriver.chrome.driver","src\\test\\resources\\Driver\\geckodriver.exe");
   WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://opensource-demo.orangehrmlive.com");
	
	return driver;
   }
	
}
