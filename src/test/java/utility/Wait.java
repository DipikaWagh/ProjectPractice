package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Wait extends PojoBrowser
{
	static WebDriver driver;
	public static void waitload(WebDriver driver) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
      
}
