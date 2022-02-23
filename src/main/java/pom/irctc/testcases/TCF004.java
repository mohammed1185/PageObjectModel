package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.PanIndApplication;
import wrappers.ProjectWrappers;

public class TCF004 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TCF004";
		testCaseDescription="PanInd Application";
		author="Arif";
		category="Smoke";
		url="https://panind.com/india/new_pan/";
	}
	
	@Test
	
	public void panIndForm() {
		
		
		new PanIndApplication()
		.selectNameTitle("1")
		.enterFirstname("Samon")
		.enterMiddleName("David")
		.enterLastName("Carr")
		.enterFatherFirstName("Robert")
		.enterFatherMiddleName("Foster")
		.enterFatherLastName("Carr")
		.enterMobileNumber("223456789")
		.enterEmailId("Samon@gmail.com")
		.selectIncome("2")
		.clickAddCommunication()
		.enterDOB("01021999")
		.enterHouseNo("1001")
		.enterRoadName("Taylor Fall Ave")
		.enterCityName("New Delhi")
		.selectState("Delhi (NCT)")
		.enterPinCode("110005")
		.waitForPanIndApplication(2000)
		.selectCountry(0)
		.enterOfficeName("Arif Testing Center")
		.enterOffBuildingNo("1500")
		.enterOffStreetName("Never Come Back")
		.waitForPanIndApplication(2000)
		.selectOffState("Karnataka")
		.enterOffPinCode("560003")
		.waitForPanIndApplication(2000)
		.enterOffCitytName("Bangalore")
		.waitForPanIndApplication(1000)
		.selectOffCountry(0)
		.selectIdentityProof("1")
		.selectAddressProof("6")
		.selectDobProof("6")
		.selectAadhaarProof("Copy of Aadhaar Card/Letter")
		.selectOfficeAddressProof("3")
		.clickOnCheckBoxAgree()
		;
		
	}

}
