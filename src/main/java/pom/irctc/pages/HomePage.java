package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{

	public HomePage waitForHomePage(long time) {
		waitProperty(time);
		return this;
	}
	public RegistrationPage clickOnRegister() {
		clickByXpath(prop.getProperty("RegistrationPage.Register.XPath"));
		return new RegistrationPage();
	}
	
	public HomePage mouseHoverOnHolidays() {
		mouseHoverByXpath(prop.getProperty("HomePage.MouseHoverOnHolidays.XPath"));
		return this;
	}
	
	public HomePage mouseHoverOnStays() {
		mouseHoverByXpath(prop.getProperty("HomePage.MouseHoverOnStays.XPath"));
		return this;
	}
	
	
	public AccommodationPage clickOnLounge() {
		clickByXpath(prop.getProperty("AccommodationPage.Lounge.XPath"));
		return new AccommodationPage();
	}
	
}
