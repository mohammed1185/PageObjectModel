package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelPersonaDetails extends GenericWrappers{
	
	
	public HotelPersonaDetails waitForHotelPersonaDetails(long time) {
		waitProperty(time);
		return this;
	}
	public HotelPersonaDetails selectTitle(String data) {
		selectValueTextByXpath(prop.getProperty("HotelPersonaDetails.Title.XPath"),data); 
		return this;
	}
	
	public HotelPersonaDetails enterFirstName(String data) {
		enterByXpath(prop.getProperty("HotelPersonaDetails.FirstName.XPath"),data); 
		return this;
	}
	public HotelPersonaDetails enterLastName(String data) {
		enterByXpath(prop.getProperty("HotelPersonaDetails.LastName.XPath")	, data); 
		return this;
	}
	public HotelPersonaDetails selectCountry(String data) {
		selectValueTextByXpath(prop.getProperty("HotelPersonaDetails.Country.XPath"), data); 
		return this;
	}
	public HotelPersonaDetails selectState(String data) {
		selectValueTextByXpath(prop.getProperty("HotelPersonaDetails.State.XPath"), data); 
		return this;
	}
	public HotelPersonaDetails selectGST(String data) {
		selectValueTextByXpath(prop.getProperty("HotelPersonaDetails.GST.XPath"), data); 
		return this;
	}
	
	
	public HotelSummaryPage clickContinueButton() {
		clickByXpath(prop.getProperty("HotelSummaryPage.ContinueButton.XPath"));
		return new HotelSummaryPage();
	}
	
	
	
}
