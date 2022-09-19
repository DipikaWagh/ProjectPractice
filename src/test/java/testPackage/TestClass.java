package testPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomPackage.HomePage;
import pomPackage.LogInPage;

public class TestClass 
{    
	WebDriver driver;
	
	 @BeforeClass
	 public void launchbrowser()
	 {
     System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	
	 driver=new FirefoxDriver();
	driver.navigate().to("https://opensource-demo.orangehrmlive.com");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 }
	 
	@Test
	public void loginpage()
	{
		LogInPage details=new LogInPage(driver);
		details.SendUserName();		
		details.Sendpassword();
		details.ClickOnLogInButton();
		System.out.println("-------------------------");
		String actualurl=driver.getCurrentUrl();
		System.out.println(actualurl);
		//String expectedurl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		//SoftAssert a=new SoftAssert();
		//a.assertEquals(actualurl, expectedurl);
		
		//a.assertAll();
	}
	
	@Test
	public void homepage() 
	{
		HomePage verify=new HomePage(driver);
		verify.verifyAdminTab();
		verify.verifyPIMTab();
		verify.verifyLeaveTab();
		verify.verifyTimeTab();
		verify.verifyRecruitmentTab();
		verify.verifyMyInfoTab();
		verify.verifyPerformanceTab();
		verify.verifyDashboardTab();
		verify.verifyDirectoryTab();
		verify.verifyMaintananceTab();
		System.out.println("-------------------------");
		String actualurl=driver.getCurrentUrl();
		System.out.println(actualurl);
		//String expectedurl="https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
		//SoftAssert a=new SoftAssert();
		//a.assertEquals(actualurl, expectedurl);
		
		//a.assertAll();
	}
	
	
	//@AfterClass
	//public void closebrowser()
	//{
	//	driver.close();
	//}

}	
	
