package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

public class HomePage

	
	{   
		 @FindBy (xpath="//*[text()='Admin']")
		   private WebElement admin;
		   
		   @FindBy (xpath="//*[text()='PIM']")
		   private WebElement PIM;
		   
		   @FindBy (xpath="//*[text()='Leave']")
		   private WebElement Leave;
		   
		   @FindBy (xpath="//*[text()='Time']")
		   private WebElement Time;
		   
		   @FindBy (xpath="//*[text()='Recruitment']")
		   private WebElement Recruitment;
		   
		   @FindBy (xpath="//*[text()='My Info']")
		   private WebElement MyInfo;
		   
		   @FindBy (xpath="//*[text()='Performance']")
		   private WebElement Performance;
		   
		   @FindBy (xpath="//*[text()='Dashboard']")
		   private WebElement Dashboard;
		   
		   @FindBy (xpath="//*[text()='Directory']")
		   private WebElement Directory;
		   
		   @FindBy (xpath="//*[text()='Maintenance']")
		   private WebElement Maintenance;
		   
		   @FindBy (xpath="//*[text()='Buzz']")
		   private WebElement Buzz;
		   
		   
		   
		   public HomePage(WebDriver driver)
		   {
			   PageFactory.initElements(driver,this);
		   }
		   
		   public void verifyAdminTab()
		   {
			   admin.isDisplayed(); 
		   }
		   
		   public void verifyPIMTab()
		   {
			   PIM.isDisplayed(); 
		   }
		   
		   public void verifyLeaveTab()
		   {
			   Leave.isDisplayed(); 
		   }
		   
		   public void verifyTimeTab()
		   {
			   Time.isDisplayed(); 
		   }
		   
		   public void verifyRecruitmentTab()
		   {
			   Recruitment.isDisplayed(); 
		   }
		   
		   public void verifyMyInfoTab()
		   {
			   MyInfo.isDisplayed(); 
		   }
		   
		   public void verifyPerformanceTab()
		   {
			   Performance.isDisplayed(); 
		   }
		   
		   public void verifyDashboardTab()
		   {
			   Dashboard.isDisplayed(); 
		   }
		   
		   public void verifyDirectoryTab()
		   {
			   Directory.isDisplayed(); 
		   }
		   
		   public void verifyMaintananceTab()
		   {
			   Maintenance.isDisplayed(); 
		   }
	       
		  
		    public void verifyBuzzTab()
		   {
		    	Buzz.isDisplayed(); 
		   }
	}

