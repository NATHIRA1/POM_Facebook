package pom.php.testcase;

import pom.php.pages.PHPRegistrationPage;

public class PhpTC004 {
	
	public void phpRegistration() {
		
		new PHPRegistrationPage()
		.enterFirstName("Rajendra")
		.enterLastName("Nathipam")
		.enterEmail("nathipamrajendra@gmail.com")
		.clickOnDialCode();
	}

}
