package pom.irctcnogst.pages;

import wrappers.GenericWrappers;

public class SelectedHotelDetailPage extends GenericWrappers {
	
	public SelectedHotelDetailPage printSelectedHotelName() {
		String HotelName=getTextByXpath("//div[@class='mid-searchpack']");
		
		System.out.println(HotelName);
		
		return this;
		
	}
	
	public SelectedHotelDetailPage printSelectedHotelPrice() {
		String priceDetails=getTextByXpath("//div[@class='select-guest-wrap']");
		
		System.out.println(priceDetails);
		
		return this;
		
	}
	
	public PersonalDetailsPage clickOnContinueToBook() {
		
		clickByXpath("//button[@type='button']/b");
		return new PersonalDetailsPage();
	}
	
	
	

}
