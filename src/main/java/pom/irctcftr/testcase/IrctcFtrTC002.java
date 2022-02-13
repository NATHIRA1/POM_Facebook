package pom.irctcftr.testcase;

import pom.irctcftr.pages.IrctcFtrHomePage;

public class IrctcFtrTC002 {
	
	public void irctcFtrRegistration() {
		
		
		new IrctcFtrHomePage()
		.ClickonNewUserSignup()
		.enterUserId("Rajendra123455")
		.enterPassword("Raj@123455")
		.enterConfirmPassword("Raj@12345")
		.selectSecurityQuestion("2")
		.enterSecurityAnswer("Brahma")
		.enterDateOfBirth("17/06/1997")
		.ClickonGender("0")
		.ClickonMaritalStatus("UnMarried")
		.enteremail("nathipamrajendra@gmail.com")
		.SelectOccupation("Professional")
		.enterFirstname("Rajendra")
		.enterLastName("Nathipam")
		.SelectNationality("94")
		.enterFlatNo("2-108/2")
		.enterStreet("Near Vinayaka Temple Street")
		.enterArea("Rajanagaram")
		.SelectCountry("94")
		.enterMobileNo("6304488510")
		.enterPincode("533294")
		.selectCity("East Godavari")
		.selectState("ANDHRA PRADESH")
		.selectPostOffice("Rajanagaram S.O")
		.ClickonSameAddressresidentialNo("No")
		.enterFlatNoOffice("2-199/2")
		.enterStreetOffice("Elcot")
		.enterAreaOffice("Madurai")
		.SelectCountryOffice("94")
		.enterMobileOffice("9133948331")
		.enterPincodeOffice("533296")
		.SelectCityOffice("East Godavari")
		.SelectStateOffice("ANDHRA PRADESH")
		.SelectPostOfficeOffice("Kanavaram B.O");
		
		
	}
	

}
