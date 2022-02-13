package pom.irctcgst.pages;

import wrappers.GenericWrappers;

public class HotelPage extends GenericWrappers {
	
	public AccomadationPage clickOnHotels() {
		
		
		clickByXpath("//div[@class='Nav-icons IRCTCHotels']");
		
		return	new	AccomadationPage();
	}

}
