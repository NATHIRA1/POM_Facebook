package pom.facebook.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.FacebookLoginPage;
import wrappers.ProjectWrappers;

public class FacebookTC001 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		
		
		testCaseName = "FacebookTCOO1";
		testCaseDescription ="To verify the facebook Page";
		author="Rajendra";
		category= "Smoke";
		browser="chrome";
		appName = "Facebook";
	}
	@Test
	public void FacebookSignUP() {
		
		
		new FacebookLoginPage(driver, test)
		.languageSelection("2")
		.clickOnCreateNewAccount()
		.enterUserName("Rajendra")
		.enterLastName("Nathipam")
		.enterEmailOrMoble("nathipamrajendra@gmail.com")
		.reEnterEmailForConfirmation("nathipamrajendra@gmail.com")
		.enterPassword("Raj@123455")
		.selectBirthdayDate("17")
		.selectBirthdayMonth("Jun")
		.selectBirthayYear("1997")
		.clickOnGender("2");
		
	}
	
	
	

}
