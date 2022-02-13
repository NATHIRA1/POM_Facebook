package pom.php.pages;

import wrappers.GenericWrappers;

public class PHPRegistrationPage extends GenericWrappers {
	
	public PHPRegistrationPage enterFirstName(String data) {
		
		enterByXpath("//input[@name='firstname']", data);
		
		return this;
	}
	
	public PHPRegistrationPage enterLastName(String data) {
		
		enterByXpath("//input[@name='lastname']", data);
		
		return this;
	}
	
	public	PHPRegistrationPage	enterEmail(String data) {
		
		enterByXpath("//input[@name='email']", data);
		
		return	this;
	}
	
	public	PHPRegistrationPage clickOnDialCode() {
		
		clickByXpath("//div[@class='selected-dial-code']");
		
		return this;
	}
	
	public PHPRegistrationPage clickOnPreferredDialCode() {
		
		clickByXpath("//span[text()='India (भारत)']");
		
		return	this;
	}
	
	public PHPRegistrationPage enterByMobileNo(String data) {
		
		enterByXpath("//input[@name='phonenumber']", data);
		
		return	this;
	}
	
	public PHPRegistrationPage enterbyCompanyName(String data) {
		
		enterByXpath("//input[@name='companyname']", data);
		
		return this;
	}
	
	public PHPRegistrationPage enterByStreetAddress1(String data) {
		
		enterByXpath("//input[@name='address1']", data);
		
		return this;
	}
	

    public PHPRegistrationPage enterByStreetAddress2(String data) {
		
		enterByXpath("//input[@name='address2']", data);
		
		return this;
    }
    
   public PHPRegistrationPage enterByCityName(String data) {
		
		enterByXpath("//input[@name='city']", data);
		
		return this;
    }
   
   public PHPRegistrationPage enterByState(String data) {
		
		enterByXpath("//input[@name='state']", data);
		
		return this;
   }
   
   public PHPRegistrationPage enterByPostCode(String data) {
		enterByXpath("//input[@name='postcode']", data);
		
		
		return this;
  }
   
   public PHPRegistrationPage selectCountry(String Value) {
	   
	   selectVisibileTextByXpath("//select[@name='country']", Value);
	   
	   return this;
   }
   
   public PHPRegistrationPage enterByWhatsappMobileNo(String data) {
		enterByXpath("//input[@name='customfield[2]']", data);
		
		
		return this;
 }
   
   public PHPRegistrationPage enterPassword(String data) {
	   
	   enterByXpath("//input[@name='password']", data);
	   return this;
   }
   
public PHPRegistrationPage confirmPassword(String data) {
	   
	   enterByXpath("//input[@name='password2']", data);
	   return this;
   }


   

}
