package pom.irctcftr.pages;

import wrappers.GenericWrappers;

public class IrctcFtrHomePage extends GenericWrappers {
	
	public FTRUserRegistrationPage ClickonNewUserSignup() {
		clickByXpath("//a[text()='New User? Signup']");
		return new FTRUserRegistrationPage();
	}
	

}
