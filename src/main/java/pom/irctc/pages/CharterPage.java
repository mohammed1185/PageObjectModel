package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers{
	
	public CharterPage clickOnEnquiryForm() {
		clickByXpath(prop.getProperty("CharterPage.EnquiryForm.XPath"));
		
		return this;
	}
	
	public CharterPage enterApllicantName(String data) {
	enterByXpath(prop.getProperty("CharterPage.ApllicantName.XPath"),data);
	return this;
	}
	public CharterPage enterOrganizationName(String data) {
	enterByXpath(prop.getProperty("CharterPage.OrganizationName.XPath"),data);
	return this;
	}
	public CharterPage enterAddress(String data) {
	enterByXpath(prop.getProperty("CharterPage.Address.XPath"),data);
	return this;
	}
	public CharterPage enterMobileNo(String data) {
	enterByXpath(prop.getProperty("CharterPage.MobileNo.XPath"),data);
	return this;
	}
	public CharterPage enterEmailAddress(String data) {
	enterByXpath(prop.getProperty("CharterPage.EmailAddress.XPath"),data);
	return this;
	}
	public CharterPage selectRequest(String data) {
	selectValueTextByXpath(prop.getProperty("CharterPage.Request.XPath"),data);
	return this;
	}
	
	public CharterPage enterOriginatingStationName(String data) {
	enterByXpath(prop.getProperty("CharterPage.OriginatingStationName.XPath"),data);
	return this;
	}
	public CharterPage enterDestinationStationName(String data) {
	enterByXpath(prop.getProperty("CharterPage.DestinationStationName.XPath"),data);
	return this;
	}
	public CharterPage clickOnDepartureCal() {
	clickByXpath(prop.getProperty("CharterPage.DepartureCal.XPath"));
	
	return this;
	}

	public CharterPage clickOnDate() {
	clickByXpath(prop.getProperty("CharterPage.Date.XPath"));
	return this;
	}
	
	public CharterPage waitForCharterPage(long time) {
		waitProperty(time);
		return this;
	}
	

	public CharterPage clickOnArrivalCal() {
	clickByXpath(prop.getProperty("CharterPage.ArrivalCal.XPath"));
	return this;
	}

	public CharterPage clickOnArrDate() {
	clickByXpath(prop.getProperty("CharterPage.ArrDate.XPath"));
	return this;
	}
	
	public CharterPage enterDurationDays(String data) {
	enterByXpath(prop.getProperty("CharterPage.DurationDays.XPath"),data);
	return this;
	}
	public CharterPage enterNumberTypeCoaches(String data) {
	enterByXpath(prop.getProperty("CharterPage.NumberTypeCoaches.XPath"),data);
	return this;
	}
	public CharterPage enterNumberPassengers(String data) {
	enterByXpath(prop.getProperty("CharterPage.NumberPassengers.XPath"),data);
	return this;
	}
	public CharterPage enterPurposeChater(String data) {
	enterByXpath(prop.getProperty("CharterPage.PurposeChater.XPath"),data);
	return this;
	}
	public CharterPage enterServiceRequired(String data) {
	enterByXpath(prop.getProperty("CharterPage.ServiceRequired.XPath"),data);
	return this;
	}
	public CharterPage clickSubmitButton() {
	clickByXpath(prop.getProperty("CharterPage.SubmitButton.XPath"));
	return this;
	}
	public CharterPage verifyMobile(String data) {
	verifyTextByXpath(prop.getProperty("CharterPage.VerifyMobile.XPath"),data);
	return this;
	}
}
