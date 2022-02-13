package pom.irctcftr.pages;

import wrappers.GenericWrappers;

public class FTRUserRegistrationPage extends GenericWrappers{
	
	public FTRUserRegistrationPage enterUserId(String userid) {
		enterByXpath("//input[@id='userId']", userid);
		return this;
	}
	
	public FTRUserRegistrationPage enterPassword(String password) {
		enterByXpath("//input[@id='password']", password);
		return this;
	}
	
	public FTRUserRegistrationPage enterConfirmPassword(String cnfPassword) {
		enterByXpath("//input[@id='cnfPassword']", cnfPassword);
		return this;
	}
	
	public FTRUserRegistrationPage selectSecurityQuestion(String value) {
		selectVisibileTextByXpath("//select[@id='secQstn']", value);
		return this;
	}
	public FTRUserRegistrationPage enterSecurityAnswer(String answer) {
		enterByXpath("//input[@id='secAnswer']", answer);
		return this;
	}
	
	public FTRUserRegistrationPage enterDateOfBirth(String DOB) {
		enterByXpath("//input[@id='dateOfBirth']", DOB);
		return this;
	}
	
	public FTRUserRegistrationPage ClickonGender(String value) {
		clickByXpath("//label[@for='gender"+value+"']");
		return this;
	}
	
	public FTRUserRegistrationPage ClickonMaritalStatus(String martialStatus) {
		clickByXpath("//label[text()='"+martialStatus+"']");
		return this;
	}
	
	public FTRUserRegistrationPage enteremail(String email) {
		enterByXpath("//input[@id='email']", email);
		return this;
	}
	
	public FTRUserRegistrationPage SelectOccupation(String value) {
		selectVisibileTextByXpath("//select[@id='occupation']", value);
		return this;
	}
	
	public FTRUserRegistrationPage enterFirstname(String fname) {
		enterByXpath("//input[@id='fname']", fname);
		return this;
	}
	
	public FTRUserRegistrationPage enterMiddleName(String mname) {
		enterByXpath("//input[@id='mname']", mname);
		return this;
	}
	
	public FTRUserRegistrationPage enterLastName(String lname) {
		enterByXpath("//input[@id='lname']", lname);
		return this;
	}
	
	public FTRUserRegistrationPage SelectNationality(String value) {
		selectVisibileTextByXpath("//select[@id='natinality']", value);
		return this;
	}
	
	public FTRUserRegistrationPage enterFlatNo(String flatNo) {
		enterByXpath("//input[@id='flatNo']", flatNo);
		return this;
	}
	
	public FTRUserRegistrationPage enterStreet(String street) {
		enterByXpath("//input[@id='street']", street);
		return this;
	}
	
	public FTRUserRegistrationPage enterArea(String area) {
		enterByXpath("//input[@id='area']", area);
		return this;
	}
	
	public FTRUserRegistrationPage SelectCountry(String value) {
		selectVisibileTextByXpath("//select[@id='country']", value);
		return this;
	}
	
	public FTRUserRegistrationPage enterMobileNo(String mobile) {
		enterByXpath("//input[@id='mobile']", mobile);
		return this;
	}
	
	public FTRUserRegistrationPage enterPincode(String pincode) {
		enterByXpath("//input[@id='pincode']", pincode);
		return this;
	}
	
	public FTRUserRegistrationPage selectCity(String value) {
		selectVisibileTextByXpath("//select[@id='city']", value);
		return this;
	}
	
	public FTRUserRegistrationPage selectState(String value) {
		selectVisibileTextByXpath("//select[@id='state']", value);
		return this;
	}

	
	public FTRUserRegistrationPage selectPostOffice(String value) {
		selectVisibileTextByXpath("//select[@id='postOffice']", value);
		return this;
	}
	
	public FTRUserRegistrationPage ClickonSameAddressresidentialNo(String addressconf) {
		clickByXpath("//label[text()='"+addressconf+"']");
		return this;
	}
	
	public FTRUserRegistrationPage enterFlatNoOffice(String flatNoOffice) {
		enterByXpath("//input[@id='flatNoOffice']", flatNoOffice);
		return this;
	}
	
	public FTRUserRegistrationPage enterStreetOffice(String streetOffice) {
		enterByXpath("//input[@id='streetOffice']", streetOffice);
		return this;
	}
	
	public FTRUserRegistrationPage enterAreaOffice(String areaOffice) {
		enterByXpath("//input[@id='areaOffice']", areaOffice);
		return this;
	}
	
	public FTRUserRegistrationPage SelectCountryOffice(String value) {
		selectVisibileTextByXpath("//select[@id='countryOffice']", value);
		return this;
	}
	
	public FTRUserRegistrationPage enterMobileOffice(String mobileOffice) {
		enterByXpath("//input[@id='mobileOffice']", mobileOffice);
		return this;
	}
	
	public FTRUserRegistrationPage enterPincodeOffice(String pincodeOffice) {
		enterByXpath("//input[@id='pincodeOffice']", pincodeOffice);
		return this;
	}
	
	public FTRUserRegistrationPage SelectCityOffice(String value) {
		selectVisibileTextByXpath("//select[@id='cityOffice']", value);
		return this;
	}
	
	public FTRUserRegistrationPage SelectStateOffice(String value) {
		selectVisibileTextByXpath("//select[@id='stateOffice']", value);
		return this;
	}
	
	public FTRUserRegistrationPage SelectPostOfficeOffice(String value) {
		selectVisibileTextByXpath("//select[@id='postOfficeOffice']", value);
		return this;
	}

	
}
