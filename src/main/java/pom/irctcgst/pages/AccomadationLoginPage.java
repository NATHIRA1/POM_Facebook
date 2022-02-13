package pom.irctcgst.pages;

import wrappers.GenericWrappers;

public class AccomadationLoginPage extends GenericWrappers {
	
	public AccomadationLoginPage clickOnLoginPage() {
		
		clickByXpath("//a[text()='Guest User Login ']");
		
		return this;
	}
	
	public AccomadationLoginPage enterEmail(String data) {
		
		enterByXpath("//input[@name='email']", data);
		
		return this;
	}
public AccomadationLoginPage enterMobileNo(String data) {
		
		enterByXpath("//input[@name='mobileNo']", data);
		
		return this;
	}

public SelectionOfHotelAndStayDetails clickOnLogin() {
	
	clickByXpath("//*[@id=\"profile\"]/div/form/div[3]/button");
	
	return new	SelectionOfHotelAndStayDetails();
}
	

}
