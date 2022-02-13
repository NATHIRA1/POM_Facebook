package pom.irctcnogst.pages;

import wrappers.GenericWrappers;

public class AccomadationPage extends GenericWrappers {
	
	public AccomadationLoginPage clickOnLogin() {
		
		clickByXpath("//a[text()='Login']");
		
		return	new AccomadationLoginPage();
	}

}
