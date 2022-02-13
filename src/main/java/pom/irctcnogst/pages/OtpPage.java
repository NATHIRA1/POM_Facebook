package pom.irctcnogst.pages;

import wrappers.GenericWrappers;

public class OtpPage extends GenericWrappers {
	
	public OtpPage clickOnVerify() {
		
		clickByXpath("//button[text()='Verify']");
		
		return new OtpPage();  
	}
	public OtpPage verifyOtp(String text) {
		
		
		verifyTextByXpath("//span[text()='otp is required.']", text);
		
		return	this;
	}
	

}
