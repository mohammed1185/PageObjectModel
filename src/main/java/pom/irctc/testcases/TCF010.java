package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.FormCRegistration;
import wrappers.ProjectWrappers;

public class TCF010 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TCF010";
		testCaseDescription="User Registration wit Hotel Owner's Details'";
		author="Arif";
		category="Smoke";
		url="https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";


	}

	@Test
	
	public void indianFrroSignup() {
		
		new FormCRegistration ()
		.clickOnSignUp()
		.enterUserID("Arif99Test")
		.enterPassword("P@$$w0rd!")
		.enterRePassword("P@$$w0rd!")
		.selectSecuQuestion("3")
		.enterYourAnswer("MyTest is going on")
		.enterName("Robert Worden")
		.selectGender("M")
		.enterDateOfBirth("03/01/1980")
		.enterDesignation("Manager")
		.enterEmailId("Robert.Worden@gmail.com")
		.enterMobileNo("0194511234")
		.enterPhoneNo("0191234567")
		.selectnationality("IND")
		.enterHotelName("Romiz Tower")
		.enterCapacity("200")
		.enterAddress("205 First Door, DELHI, INDIA")
		.selectState("8")
		.selectDistrict("1C")
		.selectAccomType("BB")
		.selectAccomGrade("2s")
		.enterEmail("info@gamadan.com")
		.enterMobileC("0194564564")
		.enterPhoneC("0184564545")
		.enterNameOwner("Arif Mohammed")
		.enterAddressOwner("205 Lake View Road")
		.selectStateOwner("15")
		.selectCityOwner("5C")
		.enterEmailOwner("Arif@Ramadan.com")
		.enterPhoneOwner("0194564577")
		.enterMobileOwner("0184564599")
		.clickAdd()
		
		.enterNameOwner("Halem Bashar")
		.enterAddressOwner("500 Lake View Road")
		.selectStateOwner("15")
		.selectCityOwner("5C")
		.enterEmailOwner("Halem@Ramadan.com")
		.enterPhoneOwner("0194564544")
		.enterMobileOwner("0184564555")
		.clickAdd()
		
		.enterNameOwner("Sakeeb Hassan")
		.enterAddressOwner("11 Front View Road")
		.selectStateOwner("15")
		.selectCityOwner("5C")
		.enterEmailOwner("Sakeeb@Ramadan.com")
		.enterPhoneOwner("0194564511")
		.enterMobileOwner("0184564522")
		.clickAdd()
		
		
		;
		
	}
	

}
