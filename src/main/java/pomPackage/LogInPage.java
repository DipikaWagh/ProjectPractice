package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage 
{
	
		@FindBy (xpath="//input[@placeholder='Username']")
		   private WebElement username;
		   
		   
		   @FindBy (xpath="//input[@name='password']")
		   private WebElement password;
			
			
		   @FindBy (xpath="//*[text()=' Login ']")
		   private WebElement button;
		   
		   public LogInPage(WebDriver driver)
		   {
			   PageFactory.initElements(driver,this);
		   }
		   public void SendUserName()
		   {
			  username.sendKeys("Admin"); 
		   }
		   
		   public void Sendpassword()
		   {
			   password.sendKeys("admin123");
		   }
		   
		   public void ClickOnLogInButton()
		   {
			   button.click(); 
		   }
		   
	}



