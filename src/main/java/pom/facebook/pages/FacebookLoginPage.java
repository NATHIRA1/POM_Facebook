package pom.facebook.pages;



import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FacebookLoginPage extends GenericWrappers{
	
	public FacebookLoginPage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver = driver;
		this.test = test;
	}
	
	
	public FacebookLoginPage languageSelection(String value) {
	
		
		//scrolldown("//html/body");
		clickByXpath(prop.getProperty("FacebookLoginPage.languageselection.Xpath"));
		return this;
		
		
		
	}
	
	public SignupPage  clickOnCreateNewAccount() {
		
		clickByXpath(prop.getProperty("FacebookLoginPage.ClickonCreateNewAccount.Xpath"));
		
		return  new  SignupPage(driver,test);
	}

}
