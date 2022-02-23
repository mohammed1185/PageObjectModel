package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.FormCRegistration;
import wrappers.ProjectWrappers;

public class TCF003 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TCF003";
		testCaseDescription="User Registration for Form 'C' and Form 'S'";
		author="Arif";
		category="Smoke";
		url="https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";


	}

	@Test
	
	public void indianFrroSignup() {
		
		new FormCRegistration ()
		.clickOnSignUp()
		.enterUserID("ArifTest1")
		.enterPassword("P@$$w0rd!")
		.enterRePassword("P@$$w0rd!")
		.selectSecuQuestion("4")
		.enterYourAnswer("Test is going on")
		.enterName("Stephen Worden")
		.selectGender("M")
		.enterDateOfBirth("03/01/1981")
		.enterDesignation("Manager")
		.enterEmailId("Stephen.Worden@gmail.com")
		.enterMobileNo("0194511234")
		.enterPhoneNo("0191234567")
		.selectnationality("IND")
		.enterHotelName("Ramadan Tower")
		.enterCapacity("200")
		.enterAddress("105 First Door, DELHI, INDIA")
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
		.enterPhoneOwner("0194564588")
		.enterMobileOwner("0184564525")
		.clickAdd()
		;
		
	}
	

}
