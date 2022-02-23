package pom.irctc.pages;

import wrappers.GenericWrappers;

public class PanIndApplication extends GenericWrappers{

	
	public PanIndApplication waitForPanIndApplication(long time) {
		waitProperty(time);
		return this;
	}
	
	public PanIndApplication selectNameTitle(String data) {
		selectValueTextByXpath(prop.getProperty("PanIndApplication.NameTitle.XPath"),data);
		return this;
	}
	public PanIndApplication enterFirstname(String data) {
	enterByXpath(prop.getProperty("PanIndApplication.Firstname.XPath"),data);
	return this;
	}
	public PanIndApplication enterMiddleName(String data) {
	enterByXpath(prop.getProperty("PanIndApplication.MiddleName.XPath"),data);
	return this;
	}
	public PanIndApplication enterLastName(String data) {
	enterByXpath(prop.getProperty("PanIndApplication.LastName.XPath"),data);
	return this;
	}
	public PanIndApplication enterFatherFirstName(String data) {
	enterByXpath(prop.getProperty("PanIndApplication.FatherFirstName.XPath"),data);
	return this;
	}
	public PanIndApplication enterFatherMiddleName(String data) {
	enterByXpath(prop.getProperty("PanIndApplication.FatherMiddleName.XPath"),data);
	return this;
	}
	public PanIndApplication enterFatherLastName(String data) {
	enterByXpath(prop.getProperty("PanIndApplication.FatherLastName.XPath"),data);
	return this;
	}
	public PanIndApplication enterMobileNumber(String data) {
	enterByXpath(prop.getProperty("PanIndApplication.MobileNumber.XPath"),data);
	return this;
	}
	public PanIndApplication enterEmailId(String data) {
	enterByXpath(prop.getProperty("PanIndApplication.EmailId.XPath"),data);
	return this;
	}
	public PanIndApplication selectIncome(String data) {
	selectValueTextByXpath(prop.getProperty("PanIndApplication.Income.XPath"), data);
	return this;
	}
	public PanIndApplication clickAddCommunication() {
	clickByXpath(prop.getProperty("PanIndApplication.AddCommunication.XPath")	);
	return this;
	}
	public PanIndApplication enterDOB(String data) {
	enterByXpath(prop.getProperty("PanIndApplication.DOB.XPath"),data);
	return this;
	}
	//Residence Address
	public PanIndApplication enterHouseNo(String data) {
	enterByXpath(prop.getProperty("PanIndApplication.HouseNo.XPath"),data);
	return this;
	}
	public PanIndApplication enterRoadName(String data) {
	enterByXpath(prop.getProperty("PanIndApplication.RoadName.XPath"),data);
	return this;
	}
	public PanIndApplication enterCityName(String data) {
	enterByXpath(prop.getProperty("PanIndApplication.CityName.XPath"),data);
	return this;
	}
	public PanIndApplication selectState(String data) {
	selectValueTextByXpath(prop.getProperty("PanIndApplication.State.XPath"),data);
	return this;
	}
	public PanIndApplication enterPinCode(String data) {
	enterByXpath(prop.getProperty("PanIndApplication.PinCode.XPath"),data);
	return this;
	}
	public PanIndApplication selectCountry(int data) {
		selectIndexByXpath(prop.getProperty("PanIndApplication.Country.XPath"),data);
	return this;
	}
	//Office Address
	
	public PanIndApplication enterOfficeName(String data) {
	enterByXpath(prop.getProperty("PanIndApplication.OfficeName.XPath"),data);
	return this;
	}
	public PanIndApplication enterOffBuildingNo(String data) {
	enterByXpath(prop.getProperty("PanIndApplication.OffBuildingNo.XPath"),data);
	return this;
	}
	public PanIndApplication enterOffStreetName(String data) {
	enterByXpath(prop.getProperty("PanIndApplication.OffStreetName.XPath"),data);
	return this;
	}
	public PanIndApplication enterOffCitytName(String data) {
	enterByXpath(prop.getProperty("PanIndApplication.OffCitytName.XPath"),data);
	return this;
	}
	public PanIndApplication selectOffState(String data) {
	selectValueTextByXpath(prop.getProperty("PanIndApplication.OffState.XPath"), data);
	return this;
	}
	public PanIndApplication enterOffPinCode(String data) {
	enterByXpath(prop.getProperty("PanIndApplication.OffPinCode.XPath"),data);
	return this;
	}
	public PanIndApplication selectOffCountry(int data) {
		selectIndexByXpath(prop.getProperty("PanIndApplication.OffCountry.XPath"),data);
	return this;
	}

	//Documents Submitted as Proof
	public PanIndApplication selectIdentityProof(String data) {
	selectValueTextByXpath(prop.getProperty("PanIndApplication.IdentityProof.XPath"), data);
	return this;
	}
	public PanIndApplication selectAddressProof(String data) {
	selectValueTextByXpath(prop.getProperty("PanIndApplication.AddressProof.XPath"),data);
	return this;
	}
	public PanIndApplication selectDobProof(String data) {
	selectValueTextByXpath(prop.getProperty("PanIndApplication.DobProof.XPath"), data);
	return this;
	}
	public PanIndApplication selectAadhaarProof(String data) {
	selectValueTextByXpath(prop.getProperty("PanIndApplication.AadhaarProof.XPath"),data);
	return this;
	}
	public PanIndApplication selectOfficeAddressProof(String data) {
	selectValueTextByXpath(prop.getProperty("PanIndApplication.OfficeAddressProof.XPath"), data);
	return this;
	}
	public PanIndApplication clickOnCheckBoxAgree() {
	clickByXpath(prop.getProperty("PanIndApplication.CheckBoxAgree.XPath"));
	return this;
	}
	
	
	
	
	
	
}
