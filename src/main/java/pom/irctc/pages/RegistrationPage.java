package pom.irctc.pages;

import wrappers.GenericWrappers;

//Completed

public class RegistrationPage extends GenericWrappers{

	
	public RegistrationPage waitForRegistrationPage(long time) {
		waitProperty(time);
		return this;
	}
	//Basic Details
	public RegistrationPage enterUserName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.UserName.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterPassword(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Password.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.ConfirmPassword.XPath"), data);
		return this;
	}
	public RegistrationPage clickPreferredLanguage() {
		
		clickByXpath(prop.getProperty("RegistrationPage.PreferredLanguage.XPath")); 
		return this;
	}
	
	public RegistrationPage clickOnPreferredLanguage() {
		clickByXpath(prop.getProperty("RegistrationPage.SelectPreferredLanguage.XPath"));
		return this;
	}
	public RegistrationPage clickSecurtyQuestions() {
		clickByXpath(prop.getProperty("RegistrationPage.SecurtyQuestions.XPath"));
		return this;
	}
	
	public RegistrationPage clickOnSecurtyQuestions() {
		clickByXpath(prop.getProperty("RegistrationPage.ClickSecurtyQuestions.XPath"));
		return this;
	}
	public RegistrationPage enterSecurtyAnswer(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.SecurtyAnswer.XPath"), data);
		return this;
	}
	
	public RegistrationPage clickOnContinueButton() {
		clickByXpath(prop.getProperty("RegistrationPage.ContinueButton.XPath"));
		return this;
	}
	
	//Personal Details
	
	public RegistrationPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.FirstName.XPath"), data);
		return this;
	}
	public RegistrationPage enterMiddleName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.MiddleName.XPath"), data);
		return this;
	}
	public RegistrationPage enterLastName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.LastName.XPath"), data);
		return this;
	}
	
	public RegistrationPage clickOccupation() {
		clickByXpath(prop.getProperty("RegistrationPage.Occupation.XPath"));
		return this;
	}
	public RegistrationPage selectOccupation() {
		clickByXpath(prop.getProperty("RegistrationPage.SelectOccupation.XPath"));
		return this;
	}	
	public RegistrationPage clickDateOfBirth() {
		clickByXpath(prop.getProperty("RegistrationPage.DateOfBirth.XPath")	);
		return this;
	}	
		
	public RegistrationPage clickDateOfBirthYear(String data) {
		selectValueTextByXpath(prop.getProperty("RegistrationPage.DateOfBirthYear.XPath"),data);
		return this;
	}		
	public RegistrationPage clickDateOfBirthMonth(String data) {
		selectValueTextByXpath(prop.getProperty("RegistrationPage.DateOfBirthMonth.XPath"),data);
		return this;
	}
	
	public RegistrationPage clickDateOfBirthDay(String data) {
		clickByLink(data);
		return this;
	}	
	public RegistrationPage clickOnMarried() {
		clickByXpath(prop.getProperty("RegistrationPage.Married.XPath"));
		return this;
	}	
	public RegistrationPage clickOnCountry(String data) {
		selectValueTextByXpath(prop.getProperty("RegistrationPage.Country.XPath"),data); 
		return this;
	}
	
	public RegistrationPage clickOnGender() {
		clickByXpath(prop.getProperty("RegistrationPage.Gender.XPath"));
		return this;
	}	
	public RegistrationPage enterEmail(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Email.XPath"), data);
		return this;
	}
	public RegistrationPage enterMobile(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Mobile.XPath"), data);
		return this;
	}
	public RegistrationPage clickOnNationality(String data) {
		selectValueTextByXpath(prop.getProperty("RegistrationPage.Nationality.XPath"),data);
		return this;
	}
	public RegistrationPage clickContinueButton() {
		clickByXpath(prop.getProperty("RegistrationPage.ContinueButton.XPath"));
		return this;
	}
	//Address
	
	public RegistrationPage enterFlatNo(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.FlatNo.XPath"), data);
		return this;
	}
	public RegistrationPage enterStreetName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.StreetName.XPath"), data);
		return this;
	}
	public RegistrationPage enterArea(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Area.XPath"), data);
		return this;
	}
	public RegistrationPage enterPinCode(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.PinCode.XPath"), data);
		return this;
	}
	public RegistrationPage enterResPhone(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.ResPhone.XPath"), data);
		return this;
	}
	public RegistrationPage clickOnCity(String data) {
		selectValueTextByXpath(prop.getProperty("RegistrationPage.City.XPath"),data);
		return this;
	}
	public RegistrationPage clickPostOffice(String data) {
		selectValueTextByXpath(prop.getProperty("RegistrationPage.PostOffice.XPath"),data);
		return this;
	}
	public RegistrationPage clickOnCopyAddress() {
		clickByXpath(prop.getProperty("RegistrationPage.CopyAddress.XPath"));
		return this;
	}
	public RegistrationPage enterOfficeFlat(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficeFlat.XPath"), data);
		return this;
	}
	public RegistrationPage enterOfficeStreet(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficeStreet.XPath"), data);
		return this;
	}
	public RegistrationPage enterOfficeArea(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficeArea.XPath"), data);
		return this;
	}
	public RegistrationPage enterOfficePinCode(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficePinCode.XPath"), data);
		return this;
	}
	public RegistrationPage enterOfficePhone(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficePhone.XPath"), data);
		return this;
	}
	
	public RegistrationPage clickOfficeCountry() {
		clickByXpath(prop.getProperty("RegistrationPage.OfficeCountry.XPath"));
		return this;
	}
	public RegistrationPage clickOfficeCountryName() {
		
		clickByXpath(prop.getProperty("RegistrationPage.OfficeCountryName.XPath"));
		return this;
	}
	public RegistrationPage clickOfficeCity(String data) {
		selectValueTextByXpath(prop.getProperty("RegistrationPage.OfficeCity.XPath"),data);
		return this;
	}
	public RegistrationPage clickOfficePostOffice(String data) {
		
		selectValueTextByXpath(prop.getProperty("RegistrationPage.OfficePostOffice.XPath"),data);
		return this;
	}
	
	public RegistrationPage clickOnCheckBox() {
		clickByXpath(prop.getProperty("RegistrationPage.CheckBox.XPath"));
		return this;
	}
	public RegistrationPage clickonTermCheckBox() {
		clickByXpath(prop.getProperty("RegistrationPage.TermCheckBox.XPath"));
		return this;
	}
	
	
}
