package utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot 
{
	public static void screenshot(WebDriver driver) throws IOException
	{   
		DateTimeFormatter DTF=DateTimeFormatter.ofPattern("dd_MM_yyyy HH_mm_ss");
		LocalDateTime LDT=LocalDateTime.now();
		String datetime=DTF.format(LDT);
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path =("D:\\DesktopTesting\\screenshot by selenium" + ".jpg");
		File dest=new File(path);
		FileHandler.copy(source, dest);
		
	}

}
