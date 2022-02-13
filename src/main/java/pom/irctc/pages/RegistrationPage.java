package pom.irctc.pages;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers {
	
	public RegistrationPage enterUserName(String username) {
		enterByXpath("//input[@id='userName']", username);
		return this;
	}
	public RegistrationPage enterPassword(String password) {
		enterByXpath("//input[@id='usrPwd']", password);
		return this;
	}
	public RegistrationPage enterConfirmPassword(String confirmpassword) {
		enterByXpath("//input[@id='cnfUsrPwd']", confirmpassword);
		return this;
	}
	public RegistrationPage Clickonpreferredlanguage() {
		clickByXpath("//span[@class='ng-tns-c66-14 ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder ng-star-inserted']");
		return this;
	}
	public RegistrationPage ClickonLanguage() {
		clickByXpath("//span[@class='ng-star-inserted']");
		return this;
	}
	public RegistrationPage ClickonSecurityQuestion() {
		clickByXpath("//span[@class='ng-tns-c66-15 ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder ng-star-inserted']");
		return this;
	}
	public RegistrationPage Clickonfirstschool() {
		clickByXpath("//li[@aria-label='What was the name of your first school?']//*");
		return this;
	}
	public RegistrationPage enterSecurityAnswer(String securityanswer) {
		enterByXpath("//div[@class='col-xs-12 inputBoxPad']//input[@formcontrolname='secAns']", securityanswer);
		return this;
	}
	public RegistrationPage Clickoncontinuebutton() {
		clickByXpath("//button[@class='search_btn train_Search ng-star-inserted']");
		return this;
	}
	public RegistrationPage enterfirstname(String firstname) {
		enterByXpath("//input[@id='firstName']", firstname);
		return this;
	}
	public RegistrationPage entermiddlename(String middlename) {
		enterByXpath("//input[@id='middleName']", middlename);
		return this;
	}
	public RegistrationPage enterlastname(String lastname) {
		enterByXpath("//input[@id='lastname']", lastname);
		return this;
	}
	public RegistrationPage ClickonSelectOccupation() {
		clickByXpath("//span[@class='ng-tns-c66-16 ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder ng-star-inserted']");
		return this;
	}
	public RegistrationPage ClickonPrivate() {
		clickByXpath("//li[@aria-label='PRIVATE']//*");
		return this;
	}
	public RegistrationPage enterDOB(String DOB) {
		enterByXpath("//input[@class='ng-tns-c59-17 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']", DOB);
		return this;
	}
	public RegistrationPage ClickonMartialStatus() {
		clickByXpath("//div[@class='ui-radiobutton-box ui-widget ui-state-default']//*");
		return this;
	}
	public RegistrationPage selectcountry(String country) {
		selectVisibileTextByXpath("//select[@class='form-control ng-pristine ng-valid ng-touched']", country);
		return this;
	}
	public RegistrationPage ClickonGender() {
		clickByXpath("//div[@class='ui-button ui-widget ui-state-default ui-button-text-only ng-star-inserted']//*");
		return this;
	}
	public RegistrationPage enteremail(String email) {
		enterByXpath("//input[@id='email']", email);
		return this;
	}
	public RegistrationPage entermobile(String mobile) {
		enterByXpath("//input[@id='mobile']", mobile);
		return this;
	}
	public RegistrationPage selectNationality(String nationality) {
		selectVisibileTextByXpath("//select[@class='form-control ng-untouched ng-pristine ng-invalid']", nationality);
		return this;
	}
	public RegistrationPage Clickoncountiune1() {
		clickByXpath("//button[@class='search_btn train_Search ng-star-inserted']");
		return this;
	}
	public RegistrationPage enterAddress1(String address1) {
		enterByXpath("//input[@id='resAddress1']", address1);
		return this;
	}
	public RegistrationPage enterAddress2(String address2) {
		enterByXpath("//input[@id='resAddress2']", address2);
		return this;
	}
	public RegistrationPage enterAddress3(String address3) {
		enterByXpath("//input[@id='resAddress3']", address3);
		return this;
	}
	public RegistrationPage enterpincode(String pincode) {
		enterByXpath("//div[@class='col-md-6 col-xs-6 tabPad']//input[@placeholder='Pin code']", pincode);
		return this;
	}
	public RegistrationPage enterstate(String state) {
		enterByXpath("//div[@class='col-md-6 col-xs-6 tabPad']//input[@placeholder='State']", state);
		return this;
	}
	public RegistrationPage selectCity(String City) {
		selectVisibileTextByXpath("//select[@class='form-control ng-untouched ng-pristine ng-invalid']", City);
		return this;
	}
	public RegistrationPage selectPostoffice(String postoffice) {
		selectVisibileTextByXpath("//select[@formcontrolname='resPostOff']", postoffice);
		return this;
	}
	public RegistrationPage enterphone(String phone) {
		enterByXpath("//input[@id='resPhone']", phone);
		return this;
	}
	public RegistrationPage ClickonNo(String no) {
		clickByXpath("//span[@class='ui-radiobutton-icon ui-clickable pi pi-circle-on']");
		return this;
	}
	public RegistrationPage enterofficeAddress1(String officeaddress1) {
		enterByXpath("//input[@id='offAddress1']", officeaddress1);
		return this;
	}
	public RegistrationPage enterOfficeAddress2(String officeaddress2) {
		enterByXpath("//input[@id='offAddress2']", officeaddress2);
		return this;
	}
	public RegistrationPage enterOfficeAddress3(String officeaddress3) {
		enterByXpath("//input[@id='offAddress3']", officeaddress3);
		return this;
	}
	public RegistrationPage enterOfficepincode(String officepincode) {
		enterByXpath("//input[@id='offPinCode']", officepincode);
		return this;
	}
	public RegistrationPage Clickoncountry() {
		clickByXpath("//span[@class='ng-tns-c66-18 ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder ng-star-inserted']");
		return this;
	}
	public RegistrationPage ClickonIndia() {
		clickByXpath("//li[@class='ui-dropdown-item ui-corner-all ui-state-highlight']//*");
		return this;
	}
	public RegistrationPage enterofficestate(String officestate) {
		enterByXpath("//input[@id='offState']", officestate);
		return this;
	}
	public RegistrationPage enterofficeCity(String officeCity) {
		enterByXpath("//input[@id='offCity']", officeCity);
		return this;
	}
	public RegistrationPage enterOfficePostoffice(String officepostoffice) {
		enterByXpath("//input[@id='offPostOff']", officepostoffice);
		return this;
	}
	public RegistrationPage enterOfficephone(String Officephone) {
		enterByXpath("//input[@id='offPhone']", Officephone);
		return this;
	}
	public RegistrationPage ClickonTermandCondition() {
		clickByXpath("//span[@class='col-xs-10 copyAddress zeroPadding']//*");
		return this;
	}
	

}
