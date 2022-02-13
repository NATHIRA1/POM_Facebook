package pom.charter.pages;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers {
	
	public CharterPage ClickonSidebardismiss() {
		clickByXpath("//i[@class='fas fa-arrow-right']");
		return this;
	}
	
	public CharterPage ClickonEnquiryForm() {
		clickByXpath("//a[@id='enquiry-tab']");
		return this;
	}
	
	public CharterPage enterNameofApplication(String name) {
		enterByXpath("//input[@name='name']", name);
		return this;
	}
	
	public CharterPage enterNameoforganization(String organization) {
		enterByXpath("//input[@name='organization']", organization);
		return this;
	}
	
	public CharterPage enterAddress(String address) {
		enterByXpath("//input[@name='address']", address);
		return this;
	}
	
	public CharterPage entermobile(String mobile) {
		enterByXpath("//input[@name='mobile']", mobile);
		return this;
	}
	
	public CharterPage enteremail(String email) {
		enterByXpath("//input[@name='originStation']", email);
		return this;
	}
	
	public CharterPage selectRequestfor(String value) {
		selectVisibileTextByXpath("//select[@name='requestFor']", value);
		return this;
	}
	
	public CharterPage enteroriginStation(String originStation) {
		enterByXpath("//input[@name='originStation']", originStation);
		return this;
	}
	
	public CharterPage enterdestnStation(String destnStation) {
		enterByXpath("//input[@name='destnStation']", destnStation);
		return this;
	}
	
	public CharterPage ClickonDateOfDeparture() {
		clickByXpath("//input[@name='checkInDate']");
		return this;
	}
	
	public CharterPage ClickonDeparturedate() {
		clickByXpath("//span[text()='29']");
		return this;
	}
	
	public CharterPage ClickonCheckOutDate() {
		clickByXpath("//input[@name='checkOutDate']");
		return this;
	}
	
	public CharterPage ClickonOutdate() {
		clickByXpath("//span[text()='30']//following::span[34]");
		return this;
	}

	
	public CharterPage enterDurationPeriod(String durationPeriod) {
		enterByXpath("//input[@name='durationPeriod']", durationPeriod);
		return this;
	}
	
	public CharterPage enterCoachDetails(String coachDetails) {
		enterByXpath("//input[@name='coachDetails']", coachDetails);
		return this;
	}
	
	public CharterPage enterNumberofPassenger(String numPassenger) {
		enterByXpath("//input[@name='numPassenger']", numPassenger);
		return this;
	}
	
	public CharterPage enterCharterPurpose(String charterPurpose) {
		enterByXpath("//input[@name='charterPurpose']", charterPurpose);
		return this;
	}
	
	public CharterPage enterServices(String services) {
		enterByXpath("//textarea[@name='services']", services);
		return this;
	}
	
	public CharterPage ClickonSubmit() {
		clickByXpath("//button[@type='Submit']");
		return this;
	}
	
	public CharterPage VerifyMobileNoNotvalid() {
		verifyTextByXpath("//span[text()='Mobile field is required.']", "Mobile no. not valid");
		return this;
	}


}
