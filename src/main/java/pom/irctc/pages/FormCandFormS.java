package pom.irctc.pages;

import wrappers.GenericWrappers;


public class FormCandFormS extends GenericWrappers{
	
	public FormCandFormS waitForFormCandFormS(long time) {
		waitProperty(time);
		return this;
	}
	public FormCandFormS enterUserID(String data) {
		enterByXpath(prop.getProperty("FormCandFormS.UserID.XPath"),data);
		return this;
	}
	
	public FormCandFormS enterPassword(String data) {
		enterByXpath(prop.getProperty("FormCandFormS.Password.XPath"),data);
		return this;
	}
	public FormCandFormS enterRePassword(String data) {
		enterByXpath(prop.getProperty("FormCandFormS.RePassword.XPath"),data);
		return this;
	}
	public FormCandFormS selectSecuQuestion(String data) {
		selectValueTextByXpath(prop.getProperty("FormCandFormS.SecuQuestion.XPath"),data);
		return this;
	}
	
	public FormCandFormS enterYourAnswer(String data) {
		enterByXpath(prop.getProperty("FormCandFormS.YourAnswer.XPath"),data);
		return this;
	}
	
	public FormCandFormS enterName(String data) {
		enterByXpath(prop.getProperty("FormCandFormS.Name.XPath"),data);
		return this;
	}
	public FormCandFormS selectGender(String data) {
	selectValueTextByXpath(prop.getProperty("FormCandFormS.Gender.XPath"), data);
	return this;
	}
	
	public FormCandFormS enterDateOfBirth(String data) {
	enterByXpath(prop.getProperty("FormCandFormS.DateOfBirth.XPath"),data);
	return this;
	}
	
	public FormCandFormS enterDesignation(String data) {
	enterByXpath(prop.getProperty("FormCandFormS.Designation.XPath"),data);
	return this;
	}
	
	public FormCandFormS enterEmailId(String data) {
	enterByXpath(prop.getProperty("FormCandFormS.EmailId.XPath")	,data);
	return this;
	}
	
	public FormCandFormS enterMobileNo(String data) {
	enterByXpath(prop.getProperty("FormCandFormS.MobileNo.XPath"),data);
	return this;
	}
	
	public FormCandFormS enterPhoneNo(String data) {
	enterByXpath(prop.getProperty("FormCandFormS.PhoneNo.XPath"),data);
	
	return this;
	}
	
	public FormCandFormS selectnationality(String data) {
	selectValueTextByXpath(prop.getProperty("FormCandFormS.Nationality.XPath"), data);
	return this;
	}
	
	
	public FormCandFormS enterHotelName(String data) {
	enterByXpath(prop.getProperty("FormCandFormS.HotelName.XPath"),data);
	return this;
	}
	public FormCandFormS enterCapacity(String data) {
	enterByXpath(prop.getProperty("FormCandFormS.Capacity.XPath"),data);
	return this;
	}
	public FormCandFormS enterAddress(String data) {
	enterByXpath(prop.getProperty("FormCandFormS.Address.XPath"),data);
	return this;
	}
	public FormCandFormS selectState(String data) {
	selectValueTextByXpath(prop.getProperty("FormCandFormS.State.XPath"), data);
	return this;
	}
	public FormCandFormS selectDistrict(String data) {
	selectValueTextByXpath(prop.getProperty("FormCandFormS.District.XPath"), data);
	return this;
	}
	public FormCandFormS selectAccomType(String data) {
	selectValueTextByXpath(prop.getProperty("FormCandFormS.AccomType.XPath"), data);
	return this;
	}
	public FormCandFormS selectAccomGrade(String data) {
	selectValueTextByXpath(prop.getProperty("FormCandFormS.AccomGrade.XPath"), data);
	return this;
	}
	public FormCandFormS enterEmail(String data) {
	enterByXpath(prop.getProperty("FormCandFormS.Email.XPath"),data);
	return this;
	}
	public FormCandFormS enterMobileC(String data) {
	enterByXpath(prop.getProperty("FormCandFormS.MobileC.XPath")	,data);
	return this;
	}
	public FormCandFormS enterPhoneC(String data) {
	enterByXpath(prop.getProperty("FormCandFormS.PhoneC.XPath"),data);
	return this;
	}
	
	public FormCandFormS enterNameOwner(String data) {
	enterByXpath(prop.getProperty("FormCandFormS.NameOwner.XPath"),data);
	return this;
	}
	public FormCandFormS enterAddressOwner(String data) {
	enterByXpath(prop.getProperty("FormCandFormS.AddressOwner.XPath"),data);
	return this;
	}
	public FormCandFormS selectStateOwner(String data) {
	selectValueTextByXpath(prop.getProperty("FormCandFormS.StateOwner.XPath"),data);
	return this;
	}
	
	public FormCandFormS selectCityOwner(String data) {
	selectValueTextByXpath(prop.getProperty("FormCandFormS.CityOwner.XPath"),data);
	return this;
	}
	public FormCandFormS enterEmailOwner(String data) {
	enterByXpath(prop.getProperty("FormCandFormS.EmailOwner.XPath"),data);
	return this;
	}
	public FormCandFormS enterPhoneOwner(String data) {
	enterByXpath(prop.getProperty("FormCandFormS.PhoneOwner.XPath"),data);
	return this;
	}
	public FormCandFormS enterMobileOwner(String data) {
	enterByXpath(prop.getProperty("FormCandFormS.MobileOwner.XPath"),data);
	return this;
	}
	
	public FormCandFormS clickAdd() {
	clickByXpath(prop.getProperty("FormCandFormS.Add.XPath"));
	return this;
	}
	
	
	

}
