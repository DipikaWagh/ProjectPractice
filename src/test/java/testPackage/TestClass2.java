package testPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomPackage.HomePage;
import pomPackage.LogInPage;
import utility.Data;
import utility.PojoBrowser;
import utility.Screenshot;

public class TestClass2 extends PojoBrowser
{ 
	WebDriver driver;
	
    @BeforeClass
	public void beforeclass()
	{   
    	WebDriver driver= openfirefox();
         this.driver=driver;
        
    }			
	
    @BeforeMethod
    public void beforemethod()
    {
    	System.out.println("beforemethod");
    }
	
		 
		@Test
		public void loginpage() throws IOException
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
			
			Screenshot.screenshot(driver);
			Data.excelsheetdata();
		}
		
		@Test
		public void homepage() throws IOException 
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
			Screenshot.screenshot(driver);
		}
}
		
	//	@AfterClass
	//	public void closebrowser(WebDriver driver)
	//	{
	//		driver.close();
	//	}
	
		
	


