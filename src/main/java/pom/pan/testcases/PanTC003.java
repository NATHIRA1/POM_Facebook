package pom.pan.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.pan.pages.PancardApplicationFormForNewAccount;
import wrappers.ProjectWrappers;

public class PanTC003 extends ProjectWrappers{
	
	
	@BeforeClass
	public void beforeClass() {
		
		
		testCaseName = "PANTCOO3";
		testCaseDescription ="To verify the PAN Page";
		author="Rajendra";
		category= "Regression";
		browser="chrome";
		appName = "PAN";
	}
	
	@Test
	public void panRegistrationPage() {
		
		new PancardApplicationFormForNewAccount(driver,test)
		.panApplicationForm()
		.selectTitle("MR.")
		.enterFirstName("Rajendra")
		.enterMiddleName("Kumar")
		.enterLastName("Nathipam")
		.enterFatherName("Brahma")
		.enterFatherMiddleName("Raju")
		.enterFatherLastName("Nathipam")
		.enterMobileNumber("6304488510")
		.enterEmail("nathipamrajendra@gmail.com")
		.selectSourceOfIncome("Salary")
		.panCommunication("office")
		.enterDateOfBirth("17061997")
		.enterHouseNo("2-108/2")
		.enterStreet("Near Vinayaka Temple Street")
		.enterCityName("Rajanagaram")
		.selectState("Andhra Pradesh")
		.enterPincode("533294")
		.enterOfficeName("HCL")
		.enterofficeBuildingNo("2-109")
		.enterOfficeArea("Elcot")
		.enterOfficeCity("Madurai")
		.selectOfficeState("Tamil Nadu")
		.enterOfficePincode("533296")
		.selectOfficeCountry("INDIA")
		.selectIdentityProof("Aadhar Card issued by UIDAI(In Copy)")
		.selectAddressProof("Aadhar Card issued by UIDAI(In Copy)")
		.selectDateOfBirthProof("Aadhar Card issued by UIDAI(In Copy)")
		.selectAadhaarProof("Select Aadhaar Proof")
		.selectOfficeAddressProof("Credit Card statement carrying Office Address")
		.clickOnAgree();
		
		
		
		
	}

}
