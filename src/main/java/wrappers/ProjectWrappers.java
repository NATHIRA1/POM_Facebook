package wrappers;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ProjectWrappers extends  GenericWrappers{
	
	public String browser;
	
	public String appName;
	@BeforeSuite
	public  void  beforeSuite() {
		
		startReport();
		
		
	}
	@BeforeTest
	public   void beforeTest() {
		
		loadObjects();
		
	}
		@BeforeMethod
	public void beforeMethod() {
			
			startTest(testCaseName, testCaseDescription);	
			switch (appName) {
			case "Facebook":
				invokeApp(browser, "http://www.facebook.com");
				
				break;
			case "IRCTC":
				invokeApp(browser, "http://www.IRCTC.co.in");
				
				
				break;
				
			case "PAN":
				invokeApp(browser, "https://panind.com/india/new_pan/");
				
				
				break;

			default:
				
				System.err.println("Please provide valid application name");
				break;
			}
			
			
			
			
		
		
	}
	@AfterMethod
	public void afterMethod() {
		
		closeAllBrowsers();
		
	}
	@AfterClass
	public void afterClass() {
		endTest();
		
		
	}
	@AfterTest
	public void afterTest() {
		
		unLoadObjects();
		
		
	}
	@AfterSuite
	public void afterSuite() {
		
		endReport();
		
		
	}

}
