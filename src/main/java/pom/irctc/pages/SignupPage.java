package pom.irctc.pages;

import wrappers.GenericWrappers;

public class SignupPage extends GenericWrappers {
	

	public SignupPage waitForSignupPage(long time) {
		waitProperty(time);
		return this;
	}
	public SignupPage enterUserID(String data) {
		enterByXpath(prop.getProperty("SignupPage.UserID.XPath"),data);
		return this;
	}
	
	public SignupPage enterPassword(String data) {
		enterByXpath(prop.getProperty("SignupPage.Password.XPath"),data);
		return this;
	}
	public SignupPage enterCofPassword(String data) {
		enterByXpath(prop.getProperty("SignupPage.CofPassword.XPath"),data);
		return this;
	}
	
	public SignupPage selectSecurityQuestion(String data) {
		selectValueTextByXpath(prop.getProperty("SignupPage.SecurityQuestion.XPath"),data);
		return this;
	}
	
	public SignupPage enterSecurityAnswer(String data) {
		enterByXpath(prop.getProperty("SignupPage.SecurityAnswer.XPath"),data);
		return this;
	}
	
	public SignupPage clickOnDateOfBirth() {
		clickByXpath(prop.getProperty("SignupPage.DateOfBirth.XPath"));
		return this;
	}
	
	
	public SignupPage selectYear(String data) {
		selectValueTextByXpath(prop.getProperty("SignupPage.Year.XPath"),data);
		return this;
	}
	public SignupPage selectMonth(String data) {
		selectValueTextByXpath(prop.getProperty("SignupPage.Month.XPath"),data);
		return this;
	}
	
	public SignupPage clickOnDate() {
		clickByXpath(prop.getProperty("SignupPage.Date.XPath"));
		return this;
	}
	public SignupPage clickGender() {
		clickByXpath(prop.getProperty("SignupPage.Gender.XPath"));
		return this;
	}
	public SignupPage clickMaritalStauts() {
		clickByXpath(prop.getProperty("SignupPage.MaritalStauts.XPath"));
		return this;
	}
	public SignupPage enterEmail(String data) {
		enterByXpath(prop.getProperty("SignupPage.Email.XPath"),data);
		return this;
	}
	public SignupPage selectOccupation(String data) {
		selectValueTextByXpath(prop.getProperty("SignupPage.Occupation.XPath"),data);
		return this;
	}
	public SignupPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("SignupPage.FirstName.XPath"),data);
		return this;
	}
	public SignupPage enterMiddleName(String data) {
		enterByXpath(prop.getProperty("SignupPage.MiddleName.XPath"),data);
		return this;
	}
	public SignupPage enterLastName(String data) {
		enterByXpath(prop.getProperty("SignupPage.LastName.XPath"),data);
		return this;
	}
	
	public SignupPage selectNatinality(String data) {
		selectValueTextByXpath(prop.getProperty("SignupPage.Natinality.XPath")	,data);
		return this;
	}
	
	public SignupPage enterFlatNo(String data) {
		enterByXpath(prop.getProperty("SignupPage.FlatNo.XPath"),data);
		return this;
	}
	public SignupPage enterStreet(String data) {
		enterByXpath(prop.getProperty("SignupPage.Street.XPath"),data);
		return this;
	}
	public SignupPage enterArea(String data) {
		enterByXpath(prop.getProperty("SignupPage.Area.XPath"),data);
		return this;
	}
	public SignupPage enterMobile(String data) {
		enterByXpath(prop.getProperty("SignupPage.Mobile.XPath"),data);
		return this;
	}
	public SignupPage selectCountry(String data) {
		selectValueTextByXpath(prop.getProperty("SignupPage.Country.XPath"),data);
		return this;
	}
	public SignupPage enterPinCode(String data) {
		enterByXpath(prop.getProperty("SignupPage.PinCode.XPath"),data);
		return this;
	}
	
	
	public SignupPage selectCityName(String data) {
		selectValueTextByXpath(prop.getProperty("SignupPage.CityName.XPath"),data);
		return this;
	}
	public SignupPage selectState(String data) {
		selectValueTextByXpath(prop.getProperty("SignupPage.State.XPath"),data);
		return this;
	}
	public SignupPage selectPostOffice(String data) {
		selectValueTextByXpath(prop.getProperty("SignupPage.PostOffice.XPath"),data);
		return this;
	}
	public SignupPage clickSameAddress () {
		clickByXpath(prop.getProperty("SignupPage.SameAddress.XPath"));
		return this;
	}
	
	public SignupPage enterOfficeFlatNo(String data) {
		enterByXpath(prop.getProperty("SignupPage.OfficeFlatNo.XPath"),data);
		return this;
	}
	public SignupPage enterOfficeStreet(String data) {
		enterByXpath(prop.getProperty("SignupPage.OfficeStreet.XPath"),data);
		return this;
	}
	public SignupPage enterOfficeArea(String data) {
		enterByXpath(prop.getProperty("SignupPage.OfficeArea.XPath"),data);
		return this;
	}
	public SignupPage selectOfficeCountry(String data) {
		selectValueTextByXpath(prop.getProperty("SignupPage.OfficeCountry.XPath"),data);
		return this;
	}
	
	public SignupPage enterOfficeMobile(String data) {
		enterByXpath(prop.getProperty("SignupPage.OfficeMobile.XPath"),data);
		return this;
	}
	
	public SignupPage enterOfficePinCode(String data) {
		enterByXpath(prop.getProperty("SignupPage.OfficePinCode.XPath"),data);
		return this;
	}
	public SignupPage selectOfficeCity(String data) {
		selectValueTextByXpath(prop.getProperty("SignupPage.OfficeCity.XPath"),data);

		return this;
	}
	public SignupPage selectOfficeState(String data) {
		selectValueTextByXpath(prop.getProperty("SignupPage.OfficeState.XPath"),data);
		return this;
	}
	public SignupPage selectOfficePostOffice(String data) {
		selectValueTextByXpath(prop.getProperty("SignupPage.OfficePostOffice.XPath"),data);
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
}
