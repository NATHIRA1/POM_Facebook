package pom.irctcgst.pages;

import wrappers.GenericWrappers;

public class SelectionOfHotelAndStayDetails extends GenericWrappers{
	
	public SelectionOfHotelAndStayDetails enterCityOrHotelName(String data) {
		
		enterByXpath("//input[@placeholder='Enter City or Hotel Name']", data);
		
		return	this;
	}
	
	public SelectionOfHotelAndStayDetails clickOnCheckInDate() {
		
		clickByXpath("//input[@placeholder='Check-in Date']");
		
		return	this;
	}
	
	public SelectionOfHotelAndStayDetails selectCheckInDate() {
		
		clickByXpath("//span[text()='27']");
		
		return	this;
	}
	
public SelectionOfHotelAndStayDetails clickOnCheckOutDate() {
		
		clickByXpath("//input[@placeholder='Check-out Date']");
		
		return	this;
	}

public SelectionOfHotelAndStayDetails selectCheckOutDate() {
	
	clickByXpath("//span[text()='30']");
	
	return	this;
}

public SelectionOfHotelAndStayDetails clickOnRommsAndGuests() {
	
	//clickByXpath("//select[@name='hotelRoom']");
	
	clickByXpath("//input[@name='guest']");
	
	return	this;
}


public SelectionOfHotelAndStayDetails selectNoOfRooms(String Value) {
	
	
	selectVisibileTextByXpath("//select[@name='hotelRoom']", Value);
	
	return this;
}
public SelectionOfHotelAndStayDetails selectNoOfAdults(String Value) {
	
	
	selectVisibileTextByXpath("//select[@name='hotelAdult']", Value);
	
	return this;
}
public SelectionOfHotelAndStayDetails clickOnDone() {
	
	clickByXpath("//button[text()='Done']");
	
	return	this;
}

public SelectedHotelDetailPage clickOnFindHotels() {
	
	clickByXpath("//button[text()='Find Hotel ']");
	
	return	new	SelectedHotelDetailPage();
}

	
	

}
