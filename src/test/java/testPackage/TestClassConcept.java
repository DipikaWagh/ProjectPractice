package testPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassConcept
{
  @BeforeClass
  
  public void beforeclass()
  {
	  System.out.println("beforeclass");
  }
  
  @BeforeMethod
  public void beforemethod()
  {
	  System.out.println("beforemethod");
  }
  
  
  //@Test (dependsOnMethods = {"testC","testB"})
 // public void testB()
 // {
//  System.out.println("testB");
 // }
  
  @Test (priority=2)
  //no is low priority is high
  public void testC()
  {
	  System.out.println("priority2");
  }
  
  @Test (priority=1)
  public void testD()
  {
	  System.out.println("priority1");
  }
  
  @Test (invocationCount=3) 
  //if we want to run test case multiple time here 3 time
  public void testE()
  {
	  System.out.println("invocationCount=3");
  }
  
  
  @Test 
  public void testA()
  {
	  System.out.println("testA");
  }


  
  @AfterMethod
  
 public void aftermethod()
 {
	  System.out.println("aftermethod");
 }	  
	
  
	@AfterClass
	public void afterclass()
	 {
		  System.out.println("afterclass");
	 }	
	}

