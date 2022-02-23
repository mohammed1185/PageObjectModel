package pom.irctc.pages;

import wrappers.GenericWrappers;


public class AccommodationPage extends GenericWrappers {

	
	
	public AccommodationPage clickMenu() {
		clickByXpath(prop.getProperty("AccommodationPage.Menu.XPath"));
		return this;
	}
	
	public AccommodationPage waitForAccommodationPage(long time) {
		waitProperty(time);
		return this;
	}
	public AccommodationPage swithWindowAccommodationPage() {
		switchToLastWindow();
		return this;
	}
	public CoachTrainNewUserPage clickBookYourCoachTrain() {
		clickByXpath(prop.getProperty("CoachTrainNewUserPage.BookYourCoachTrain.XPath"));
		return new CoachTrainNewUserPage();
	}
	
	public CharterPage clickOnCharter() {
		clickByXpath(prop.getProperty("CharterPage.Charter.XPath"));
		return new CharterPage();
	}
	
	public AccommodationPage clickOnHotelLinkPage() {
		
		if(driver.findElementsByXPath(prop.getProperty("AccommodationPage.HotelLinkPage.XPath")).size()!=0) {
			clickByXpath(prop.getProperty("AccommodationPage.HotelLinkPage.XPath"));
		}
		
		return this;
	}
	public HotelPage clickOnHotel() {
		clickByXpath(prop.getProperty("HotelPage.Hotel.XPath"));
		
		return new HotelPage();
	}
	

	
}
