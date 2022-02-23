package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.PhptravelsRegister;
import wrappers.ProjectWrappers;

public class TCF005 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
	testCaseName="TCF005";
	testCaseDescription="PHP Travels Registration";
	author="Arif";
	category="Smoke";
	url="https://www.phptravels.org/register.php";
	sheetName="TC005";
		
	}
	
	@Test(dataProvider="fetchData")
	public void phpTravelsRegister(	
			String firstName,
			String lastName, 
			String email,
			String phoneNumber, 
			String companyName, 
			String address1, 
			String address2, 
			String city, 
			String country, 
			String state,
			String zipCode, 
			String mobileNumber, 
			String password) {
		
		
		new PhptravelsRegister()
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterEmail(email)
		.clickPhoneCountryCode()
		.waitForPhptravelsRegister(2000)
		.clickPhoneCountryList()
		.waitForPhptravelsRegister(1000)
		.enterPhoneNo(phoneNumber)
		.enterCompanyName(companyName)
		.enterStreetAddress(address1)
		.enterStreetArea(address2)
		.enterCityName(city)
		.selectCountry(country)
		.waitForPhptravelsRegister(3000)
		.selectState(state)
		.enterPostCode(zipCode)
		.enterMobileNo(mobileNumber)
		.enterPassword(password)
		.enterConfPassword(password)
		.clickRegisterButton()
		;
		
	}
	

}
