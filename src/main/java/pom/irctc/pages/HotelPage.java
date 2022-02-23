package pom.irctc.pages;

import wrappers.GenericWrappers;

//Completed

public class HotelPage extends GenericWrappers{

	public HotelPage waitForHotelPage(long time) {
		waitProperty(time);
		return this;
	}
	public HotelPage swithWindowHotelPage() {
		switchToLastWindow();
		return this;
	}
	public HotelPage clickOnLogin() {
		clickByXpath(prop.getProperty("HotelPage.Login.XPath"));
		return this;
	}
	
	public HotelPage clickGusetUserLogin() {
		clickByXpath(prop.getProperty("HotelPage.GusetUserLogin.XPath"));
		return this;
		
	}
	
	public HotelPage emailAddress(String data) {
		enterByXpath(prop.getProperty("HotelPage.emailAddress.XPath"), data);
		return this;	
	}
	public HotelPage enterMobileNumber(String data) {
		enterByXpath(prop.getProperty("HotelPage.MobileNumber.XPath"),data);
		return this;	
	}
	
	public HotelPage clickLoginButton() {
		clickByXpath(prop.getProperty("HotelPage.LoginButton.XPath"));
		return this;
	}
	public HotelPage enterCityName(String data) {
		enterByXpath(prop.getProperty("HotelPage.CityName.XPath"), data);
		return this;
	}
	
	public HotelPage clickCityName() {
		clickByXpath(prop.getProperty("HotelPage.ClickCityName.XPath")); //Search city
		return this;
	}
	
	public HotelPage clickOnDateIn() {
		clickByXpath(prop.getProperty("HotelPage.DateIn.XPath")); // Date 1
		return this;
	}
	public HotelPage clickOnInDateonTop() {
		clickByXpath(prop.getProperty("HotelPage.InDateonTop.XPath")	);
		return this;
	}
	public HotelPage clickOnInYear() {
		clickByXpath(prop.getProperty("HotelPage.InYear.XPath"));
		return this;
	}
	public HotelPage clickInOnMonth() {
		clickByXpath(prop.getProperty("HotelPage.InOnMonth.XPath"));
		return this;
	}
	public HotelPage clickInOnDay() {
		clickByXpath(prop.getProperty("HotelPage.InOnDay.XPath"));
		return this;
	}
	public HotelPage clickOnDateOut() {
		clickByXpath(prop.getProperty("HotelPage.DateOut.XPath")); // Date 2
		return this;
	}
	public HotelPage clickOnOutDateonTop() {
		clickByXpath(prop.getProperty("HotelPage.OutDateonTop.XPath"));
		return this;
	}
	public HotelPage clickOnOutYear() {
		clickByXpath(prop.getProperty("HotelPage.OutYear.XPath"));
		return this;
	}
	public HotelPage clickOnOutMonth() {
		clickByXpath(prop.getProperty("HotelPage.OutMonth.XPath"));
		return this;
	}
	public HotelPage clickOnOutDay() {
		clickByXpath(prop.getProperty("HotelPage.OutDay.XPath"));
		return this;
	}
	public HotelPage clickOnRoomGusets() {
		clickByXpath(prop.getProperty("HotelPage.RoomGusets.XPath")); // Guest
		return this;
	}
	public HotelPage clickOnNoRoom(String data) {
		selectValueTextByXpath(prop.getProperty("HotelPage.NoRoom.XPath"), data);
		return this;
	}
	
	public HotelPage clickOnNoAdults(String data) {
		selectValueTextByXpath(prop.getProperty("HotelPage.NoAdults.XPath"), data);
		return this;
	}
	
	public HotelPage clickOnDone() {
		clickByXpath(prop.getProperty("HotelPage.DoneButton.XPath"));
		return this;
	}
	public HotelPage clickOnFindHotelButton() {
		clickByXpath(prop.getProperty("HotelPage.FindHotelButton.XPath"));
	return this;
	}
	public HotelListPage clickOnHotelName() {
	//clickByXpath("(//div[@class='left-searchpack']//following-sibling::img)[1]");//Click a Hotel
	clickByXpath(prop.getProperty("HotelListPage.HotelName.XPath"));
	return new HotelListPage();
	}
	
}
