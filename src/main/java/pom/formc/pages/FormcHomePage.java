package pom.formc.pages;

import wrappers.GenericWrappers;

public class FormcHomePage extends GenericWrappers  {
	
	public FormcRegistrationPage clickOnSignup() {
		
		clickByXpath("//a[text()='Sign Up (Registration)']");
		
		return new	FormcRegistrationPage();
		
		
	}

}
