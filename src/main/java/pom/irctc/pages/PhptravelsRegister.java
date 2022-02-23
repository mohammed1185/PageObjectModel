package pom.irctc.pages;

import wrappers.GenericWrappers;

public class PhptravelsRegister extends GenericWrappers{
	
	public PhptravelsRegister waitForPhptravelsRegister(long time) {
		waitProperty(time);
		return this;
	}
	public PhptravelsRegister enterFirstName(String data) {
		enterByXpath(prop.getProperty("PhptravelsRegister.FirstName.XPath"),data);
		return this;
	}
	
	public PhptravelsRegister enterLastName(String data) {
		enterByXpath(prop.getProperty("PhptravelsRegister.LastName.XPath"),data);
		return this;
	}
	
	public PhptravelsRegister enterEmail(String data) {
		enterByXpath(prop.getProperty("PhptravelsRegister.Email.XPath"),data);
		return this;
	}

	public PhptravelsRegister clickPhoneCountryCode() {
		clickByXpath(prop.getProperty("PhptravelsRegister.PhoneCountryCode.XPath"));
		return this;
	}
	public PhptravelsRegister clickPhoneCountryList() {
		clickByXpath(prop.getProperty("PhptravelsRegister.PhoneCountryList.XPath"));
		return this;
	}
	public PhptravelsRegister enterPhoneNo(String data) {
		enterByXpath(prop.getProperty("PhptravelsRegister.PhoneNo.XPath"),data);
		return this;
	}
	public PhptravelsRegister enterCompanyName(String data) {
		enterByXpath(prop.getProperty("PhptravelsRegister.CompanyName.XPath"),data);
		return this;
	}
	public PhptravelsRegister enterStreetAddress(String data) {
		enterByXpath(prop.getProperty("PhptravelsRegister.StreetAddress.XPath"),data);
		return this;
	}
	public PhptravelsRegister enterStreetArea(String data) {
		enterByXpath(prop.getProperty("PhptravelsRegister.StreetArea.XPath"),data);
		return this;
	}
	public PhptravelsRegister enterCityName(String data) {
		enterByXpath(prop.getProperty("PhptravelsRegister.CityName.XPath"),data);
		return this;
	}
	
	public PhptravelsRegister selectCountry(String data) {
		selectValueTextByXpath(prop.getProperty("PhptravelsRegister.Country.XPath"),data);
		return this;
	}
	
	public PhptravelsRegister selectState(String data) {
		selectIndexByXpathStringInt(prop.getProperty("PhptravelsRegister.State.XPath"),data);
		return this;
	}
	
	public PhptravelsRegister enterPostCode(String data) {
		enterByXpath(prop.getProperty("PhptravelsRegister.PostCode.XPath"),data);
		return this;
	}
	
	public PhptravelsRegister enterMobileNo(String data) {
		enterByXpath(prop.getProperty("PhptravelsRegister.MobileNo.XPath"),data);
		return this;
	}
	public PhptravelsRegister enterPassword(String data) {
		enterByXpath(prop.getProperty("PhptravelsRegister.Password.XPath"),data);
		return this;
	}
	public PhptravelsRegister enterConfPassword(String data) {
		enterByXpath(prop.getProperty("PhptravelsRegister.ConfPassword.XPath"),data);
		return this;
	}
	
	public PhptravelsRegister clickRegisterButton() {
		clickByXpath(prop.getProperty("PhptravelsRegister.RegisterButton.XPath"));
		return this;
	}
	
	

}
