package pom.irctc.pages;

import wrappers.GenericWrappers;


public class HotelSummaryPage extends GenericWrappers  {
	
	public static String roomPrice;
	
	public HotelSummaryPage waitForHotelSummaryPage(long time) {
		waitProperty(time);
		return this;
	}
	public HotelSummaryPage verifyHotelName() {
		
		verifyTextByXpath(prop.getProperty("HotelSummaryPage.VerifyHotelName.XPath"), HotelListPage.hotelName); // Hotel Name from HotelListPage
		
		return this;
	}
	
	public HotelSummaryPage getRoomPrice() {
		
		roomPrice =getTextByXpath(prop.getProperty("HotelSummaryPage.GetRoomPrice.XPath")); 
		return this;
	}
	
	
	public HotelSummaryPage verifyRoomPrice() {
		verifyTextByXpath(prop.getProperty("HotelSummaryPage.VerifyRoomPrice.XPath"), HotelSummaryPage.roomPrice);
		return this;
	}

	public HotelSummaryPage clickOnAgreeTerms() {
		clickByXpath(prop.getProperty("HotelSummaryPage.AgreeTerms.XPath"));
		return this;
		}
	public HotelSummaryPage clickOnMakePayment() {
		clickByXpath(prop.getProperty("HotelSummaryPage.MakePayment.XPath"));
		return this;
		}
	
	public HotelSummaryPage clickOnVerifyButton() {
		
		clickByXpath(prop.getProperty("HotelSummaryPage.VerifyButton.XPath"));
		return this;
		}
	public HotelSummaryPage verifyRequired(String data) {
	
		verifyTextByXpath(prop.getProperty("HotelSummaryPage.VerifyRequired.XPath"),data);
		waitProperty(3000);
		return this;
		}
}
