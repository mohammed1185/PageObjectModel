package pom.irctc.pages;

import wrappers.GenericWrappers;


public class HotelListPage extends GenericWrappers{
	
	public static String hotelName;
	
	public HotelListPage waitForHotelListPage(long time) {
		waitProperty(time);
		return this;
	}
	public HotelListPage swithWindowHotelListPage() {
		switchToLastWindow();
		return this;
	}
	
	
	public HotelListPage getHotelName() {
		
		hotelName =getTextByXpath(prop.getProperty("HotelListPage.GetHotelName.XPath")); 
		return this;
	}
	

	
	public HotelListPage getRoomPrice() {
		getTextByXpath(prop.getProperty("HotelListPage.GetRoomPrice.XPath"));
		return this;
	}
	
	public HotelPersonaDetails clickContinueToBook() {
		clickByXpath(prop.getProperty("HotelPersonaDetails.ContinueToBook.XPath")); 
		return new HotelPersonaDetails();
	}
	
}
