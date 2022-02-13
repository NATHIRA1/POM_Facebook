package pom.irctcnogst.pages;

import wrappers.GenericWrappers;

public class PaymentConfimationPage extends GenericWrappers {
	
	public PaymentConfimationPage clickOnTermsandconditions() {
		
		clickByXpath("//span[@class='checkmark']");
		
		return this;
		
		
		
		
	}
	
	
		
		public OtpPage clickOnMakePayment() {
			
			clickByXpath("//button[text()='Make Payment']");
			
			return new OtpPage();
			
			
			
			
		}

}
