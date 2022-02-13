package pom.formc.pages;

import wrappers.GenericWrappers;

public class FormcRegistrationPage extends GenericWrappers {
	
	public FormcRegistrationPage enterUserId(String data) {
		
		enterByXpath("//input[@name='u_id']", data);
		
		return	this;
	}
	
public FormcRegistrationPage enterPassword(String data) {
		
		enterByXpath("//input[@name='u_pwd']", data);
		
		return	this;
   }
public FormcRegistrationPage confirmPassword(String data) {
	
	enterByXpath("//input[@name='u_repwd']", data);
	
	return	this;
}

public FormcRegistrationPage selectSecurityQuestion(String Value) {
	
	
	selectVisibileTextByXpath("//select[@name='u_secques']", Value);
	
	return this;
}

public FormcRegistrationPage enterSecurityAnswer(String data) {
	
	enterByXpath("//input[@name='u_secans']", data);
	
	return	this;
}

public FormcRegistrationPage enterName(String data) {
	
	enterByXpath("//input[@name='u_name']", data);
	
	return this;
}

public FormcRegistrationPage selectGender(String Value) {
	
	selectVisibileTextByXpath("//select[@name='u_gender']", Value);
	
	return this;
}

public FormcRegistrationPage enterDOB(String data) {
	
	enterByXpath("//input[@name='u_dob']", data);
	
	return this;
}

public FormcRegistrationPage enterDesignation(String data) {
	
	enterByXpath("//input[@name='u_designation']", data);
	
	return this;
}
public FormcRegistrationPage enterEmailId(String data) {
	
	enterByXpath("//input[@name='u_emailid']", data);
	
	return this;
}

public FormcRegistrationPage enterMobileNo(String data) {
	
	enterByXpath("//input[@name='u_mobile']", data);
	
	return this;
}

public FormcRegistrationPage enterPhoneNo(String data) {
	
	enterByXpath("//input[@name='u_phone']", data);
	
	return this;
}


public FormcRegistrationPage selectNationality(String Value) {
	
	selectVisibileTextByXpath("//select[@name='u_nationality']", Value);
	
	return this;
}

public FormcRegistrationPage enterHouseName(String data) {
	
	enterByXpath("//input[@name='name']", data);
	
	return this;
}
public FormcRegistrationPage enterHouseCapacity(String data) {
	
	enterByXpath("//input[@name='capacity']", data);
	
	return this;
}

public FormcRegistrationPage enterHouseAddress(String data) {
	
	enterByXpath("//textarea[@name='address']", data);
	
	return this;
}

public FormcRegistrationPage selectState(String Value) {
	
	selectVisibileTextByXpath("//select[@name='state']", Value);
	
	return this;
}

public FormcRegistrationPage selectDistrict(String Value) {
	
	selectVisibileTextByXpath("//select[@name='city_distr']", Value);
	
	return this;
}

public FormcRegistrationPage selectAccomadationType(String Value) {
	
	selectVisibileTextByXpath("//select[@name='acco_type']", Value);
	
	return this;
}

public FormcRegistrationPage selectAccomadationGrade(String Value) {
	
	selectVisibileTextByXpath("//select[@name='star_rat']", Value);
	
	return this;
}

public FormcRegistrationPage enterHouseEmailId(String data) {
	
	enterByXpath("//input[@name='email']", data);
	
	return this;
}
public FormcRegistrationPage enterHouseMobileNo(String data) {
	
	enterByXpath("//input[@name='mcontact']", data);
	
	return this;
}

public FormcRegistrationPage enterHousePhoneNo(String data) {
	
	enterByXpath("//input[@name='contact']", data);
	
	return this;
}

public FormcRegistrationPage enterHouseOwnerName(String data) {
	
	enterByXpath("//input[@name='name_o']", data);
	
	return this;
}


public FormcRegistrationPage enterHouseOwnerAddress(String data) {
	
	enterByXpath("//input[@name='address_o']", data);
	
	return this;
}

public FormcRegistrationPage selectHouseOwnerState(String Value) {
	
	selectVisibileTextByXpath("//select[@name='state_o']", Value);
	
	return this;
}

public FormcRegistrationPage selectHouseOwnerDistrict(String Value) {
	
	selectVisibileTextByXpath("//select[@name='citydistr_o']", Value);
	
	return this;
}

public FormcRegistrationPage enterHouseOwnerEmailId(String data) {
	
	enterByXpath("//input[@name='emailid_o']", data);
	
	return this;
}

public FormcRegistrationPage enterHouseOwnerPhoneNo(String data) {
	
	enterByXpath("//input[@name='phoneno_o']", data);
	
	return this;
}


public FormcRegistrationPage enterHouseOwnerMobileNo(String data) {
	
	enterByXpath("//input[@name='mobile_o']", data);
	
	return this;
}














	
	

}
