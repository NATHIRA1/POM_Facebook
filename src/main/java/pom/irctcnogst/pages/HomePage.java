package pom.irctcnogst.pages;


import org.junit.Test;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {
@Test	
public HomePage mouseHoverOnHolidays() {
	
	invokeApp("chrome", "https://www.irctc.co.in");
	
	clickByXpath("//button[@class='btn btn-primary']");
	
	mouseHoverByXpath("//a[text()=' HOLIDAYS ']");
	
	
		
		return this;
		
		
	}

public HomePage mouseHoverOnStays() {
	
	mouseHoverByXpath("//span[text()='Stays']");
		
		return this;
		
		
	}

public HotelPage clickOnLounge() {
	
	clickByXpath("//span[text()='Lounge']");
	
	return	new HotelPage();
}

}
