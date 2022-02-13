package pom.charter.pages;


import wrappers.GenericWrappers;

public class CovidAlertPage extends GenericWrappers {
	
	public HomePage ClickOnOk() {
		
		
		clickByXpath("//button[@class='btn btn-primary']");
		
		return new HomePage();
		
		     
	}

}