package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {
	
	public RegistrationPage clickOnRegister() {
		
		clickByXpath("//a[contains(text(),'REGISTER')]");
		
		return new RegistrationPage();
		
		
	}
	
	public HomePage mouseHoverOnHolidays() {
		
		return this;
		
		
	}

}
