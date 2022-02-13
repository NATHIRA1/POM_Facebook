package pom.irctcgst.pages;

import wrappers.GenericWrappers;

public class PersonalDetailsPage extends GenericWrappers {
	
	public PersonalDetailsPage selectTittle(String Value) {
		
		selectVisibileTextByXpath("//select[@name='title']", Value);
		
		return this;
	}
	
	public PersonalDetailsPage enterName(String data) {
		
		enterByXpath("//input[@name='firstName']", data);
		
		return this;
	}
	
	public PersonalDetailsPage enterLastName(String data) {
		
      enterByXpath("//input[@name='lastName']", data);
		
		return this;
		
		
	}
	
public PersonalDetailsPage selectCountry(String Value) {
		
		selectVisibileTextByXpath("//select[@name='country']", Value);
		
		return this;
	}
public PersonalDetailsPage selectState(String Value) {
	
	selectVisibileTextByXpath("//select[@name='state']", Value);
	
	return this;
}

public PersonalDetailsPage selectGst(String Value) {
	
	selectVisibileTextByXpath("//select[@name='gst']", Value);
	
	return this;
}

public PersonalDetailsPage enterGstNo(String data) {
	
    enterByXpath("//input[@name='gstNumber']", data);
		
		return this;
		
		
	}

public PersonalDetailsPage enterCompanyName(String data) {
	
    enterByXpath("//input[@name='companyName']", data);
		
		return this;
		
		
	}

public PersonalDetailsPage enterCompanyAddress(String data) {
	
    enterByXpath("//input[@name='companyAddress']", data);
		
		return this;
		
		
	}

public PersonalDetailsPage clickOnContinue() {
	clickByXpath("//button[text()='Continue']");
	
	return	this;
}

public PersonalDetailsPage checkwhetherGstNoIsValidOrNot() {
	
	String validationOfGstNo=getTextByXpath("//span[text()='Please Enter Valid GSt number']");
	
	System.out.println(validationOfGstNo);
	
	if(validationOfGstNo.equals("Please Enter Valid GSt number")) {
		
		System.out.println("true");
	}else {
		
		System.out.println("false");
	}
	
	return	this;
}

}
