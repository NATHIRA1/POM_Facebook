package pom.pan.pages;

import org.junit.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PancardApplicationFormForNewAccount  extends GenericWrappers  {
	
	
public PancardApplicationFormForNewAccount (RemoteWebDriver driver, ExtentTest test) {
		
		this.driver = driver;
		this.test = test;
	}
	
public  PancardApplicationFormForNewAccount panApplicationForm() {
	
	
	//invokeApp("chrome", "https://panind.com/india/new_pan/");
		 
		
			mouseHoverByXpath("//a[@class='active']");
			return this;
			
	}		
			
			public PancardApplicationFormForNewAccount selectTitle(String Value) {
				
				selectVisibileTextByXpath("//select[@id='pan_title']", Value);
				
				return this;
				
			}
	public PancardApplicationFormForNewAccount enterFirstName(String data) {
		
		enterByXpath("//input[@id='pan_firstname']", data);
		
		return this;
	}
	
	public PancardApplicationFormForNewAccount enterMiddleName(String data) {
		
		enterByXpath("//input[@id='pan_middlename']", data);
		
		return this;
	}
	
	public PancardApplicationFormForNewAccount  enterLastName(String data) {
		
		enterByXpath("//input[@id='pan_lastname']", data);
		
		return  this;
	}
	
	public   PancardApplicationFormForNewAccount enterFatherName(String  data) {
		
		enterByXpath("//input[@id='pan_fatherfirstname']", data);
		
		return this;
	}
	
	public PancardApplicationFormForNewAccount  enterFatherMiddleName(String data) {
		
		enterByXpath("//input[@id='pan_fathermiddlename']", data);
		
		return this;
	}
	
	public PancardApplicationFormForNewAccount enterFatherLastName(String  data) {
		
		enterByXpath("//input[@id='pan_fatherlastname']", data);
		
		return this;
	}
	
	public  PancardApplicationFormForNewAccount enterMobileNumber(String data) {
		
		enterByXpath("//input[@id='pan_mobilenumber']", data);
		
		return  this;
	}
	
	public PancardApplicationFormForNewAccount  enterEmail(String  data) {
		
		enterByXpath("//input[@name='pan_email']", data);
		
		return this;
	}
	
	public PancardApplicationFormForNewAccount  selectSourceOfIncome(String Value) {
		
		selectVisibileTextByXpath("//select[@name='pan_sourceofincome']", Value);
		return  this;
	}
	
	public PancardApplicationFormForNewAccount  panCommunication(String data) {
		
		clickByXpath("//input[@id='"+data+"']");
		
		return this;
	}
	
	public PancardApplicationFormForNewAccount enterDateOfBirth(String data) {
		
		enterByXpath("//input[@id='pan_dob']", data);
		
		return this;
	}
	
	public PancardApplicationFormForNewAccount   enterHouseNo(String  data) {
		
		scrolldown("//html/body");
		
		
		enterByXpath("//input[@id='pan_addressline1']", data);
		
		return  this;
		
	}
	
	public PancardApplicationFormForNewAccount	enterStreet(String   data) {
		
		enterByXpath("//input[@id='pan_addressline2']", data);
		
		return this;
	}
	
	public PancardApplicationFormForNewAccount enterCityName(String data) {
		
		enterByXpath("//input[@name='pan_cityname']", data);
		
		return this;
	}
	
	public  PancardApplicationFormForNewAccount selectState(String Value) {
		
		selectVisibileTextByXpath("//select[@name='pan_state']", Value);
		
		return this;
	}
	
	public PancardApplicationFormForNewAccount enterPincode(String data) {
		
		enterByXpath("//input[@name='pan_pincode']", data);
		
		return	this;
	}
	
	public	PancardApplicationFormForNewAccount selectCountry(String Value) {
		
		selectVisibileTextByXpath("//select[@name='pan_country']", Value);
		
		return this;
	}
	
	public PancardApplicationFormForNewAccount enterOfficeName(String data) {
		
		scrolldown("//html/body");
		
		enterByXpath("//input[@name='pan_officename']", data);
		
		return this;
	}
	
	public PancardApplicationFormForNewAccount enterofficeBuildingNo(String data) {
		
		enterByXpath("//input[@name='pan_officeaddressline1']", data);
		
		return this;
	}
	
	public PancardApplicationFormForNewAccount enterOfficeArea(String data) {
		
		enterByXpath("//input[@name='pan_officeaddressline2']", data);
		
		return this;
	}
	
	public PancardApplicationFormForNewAccount enterOfficeCity(String data) {
		
		enterByXpath("//input[@name='pan_officecityname']", data);
		
		return this;
	}
	
	public PancardApplicationFormForNewAccount selectOfficeState(String data) {
		
		enterByXpath("//select[@name='pan_officestate']", data);
		
		return this;
	}
	
	public PancardApplicationFormForNewAccount enterOfficePincode(String data) {
		
		enterByXpath("//input[@name='pan_officepincode']", data);
		
		return this;
	}
	
	public PancardApplicationFormForNewAccount selectOfficeCountry(String Value) {
		
		selectVisibileTextByXpath("//select[@name='pan_officecountry']", Value);
		
		return this;
		
		
	}
	
	public PancardApplicationFormForNewAccount selectIdentityProof(String Value) {
		
		selectVisibileTextByXpath("//select[@name='pan_identityproof']", Value);
		
		return	this;
	}
	
	public PancardApplicationFormForNewAccount selectAddressProof(String Value) {
		
		selectVisibileTextByXpath("//select[@name='pan_addressproof']", Value);
		
		return	this;
	}
	public PancardApplicationFormForNewAccount selectDateOfBirthProof(String Value) {
		
		selectVisibileTextByXpath("//select[@name='pan_DOBproof']", Value);
		
		return this;
	}
	
	public PancardApplicationFormForNewAccount selectAadhaarProof(String Value) {
		
		selectVisibileTextByXpath("//select[@name='pan_aadhaarproof']", Value);
		
		return this;
	}
	
	public PancardApplicationFormForNewAccount selectOfficeAddressProof(String Value) {
		
		selectVisibileTextByXpath("//select[@name='pan_officeaddressproof']", Value);
		return this;
	}
	
	public PancardApplicationFormForNewAccount clickOnAgree() {
		
		
		clickByXpath("//input[@class='pan_checkbox']");
		
		return this;
	}
	
	
				
	
	
	
	
}
	 
		
	


