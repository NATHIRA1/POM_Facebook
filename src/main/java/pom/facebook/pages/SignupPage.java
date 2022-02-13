package pom.facebook.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class SignupPage  extends GenericWrappers {
	
public SignupPage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver = driver;
		this.test = test;
	}
	
	public   SignupPage enterUserName(String data) {
		
		enterByXpath(prop.getProperty("FacebookSignUpPage.enterUserName.Xpath"), data);
		
		return this;
	}
	
	public SignupPage   enterLastName(String  data) {
		
		enterByXpath(prop.getProperty("FacebookSignUpPage.enterLastName.Xpath"), data);
		
		return  this;
	}
	
	public   SignupPage enterEmailOrMoble(String  data) {
	
		enterByXpath(prop.getProperty("FacebookSignupPage.enterEmail.Xpath"), data);
		
		return this;
	}
	
	public    SignupPage   reEnterEmailForConfirmation(String  data) {
		
		enterByXpath(prop.getProperty("FacebookSignupPage.reenterEmail.Xpath"), data);
		
		return this;
	}
	
	public  SignupPage   enterPassword(String data) {
		
		enterByXpath(prop.getProperty("FacebookSignupPage.enterPassword.Xpath"), data);
		
		return this;
	}
	
	public  SignupPage selectBirthdayDate(String  value) {
		
		selectVisibileTextByXpath(prop.getProperty("FacebookSignupPage.enterBirthdayDate.Xpath"), value);
		
		return this;
		
	}
	public  SignupPage selectBirthdayMonth(String value) {
		
		selectVisibileTextByXpath(prop.getProperty("FacebookSignupPage.enterBirthdayMonth.Xpath"), value);
		
		return  this;
	}
	
	public SignupPage selectBirthayYear(String value) {
		
		selectVisibileTextByXpath(prop.getProperty("FacebookSignupPage.enterBirthdayYear.Xpath"), value);
		
		return this;
	}
	public  SignupPage clickOnGender(String value)  {
		
		clickByXpath(prop.getProperty("FacebookSignupPage.clickonGender.Xpath"),value);
		
		return  this;
		
		
	}

}
