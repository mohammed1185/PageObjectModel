package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TCF007 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TCF007";
		testCaseDescription="IRCTC Book Your Coach";
		author="Arif";
		category="Smoke";
		url="https://www.irctc.co.in/nget/train-search";


	}

	@Test
	
	public void irctcBookYourCoach() {
		
		new CovidAlertPage()
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.swithWindowAccommodationPage()
		.clickMenu() 
		.clickBookYourCoachTrain()
		.swithWindowCoachTrainNewUserPage()
		.waitForCoachTrainNewUserPage(2000)
		.clickNewUserSignup()
		.enterUserID("Arif12786")	
		.enterPassword("Password1")
		.enterCofPassword("Password1")	
		.selectSecurityQuestion("6")	
		.enterSecurityAnswer("My best Car")	
		.clickOnDateOfBirth()	
		.selectYear("1988")
		.waitForSignupPage(3000)
		.selectMonth("7")	
		.waitForSignupPage(3000)
		.clickOnDate()
		.clickGender()
		.clickMaritalStauts()
		.enterEmail("arif2g@gamil.com")
		.selectOccupation("EducationalInstitution")
		.enterFirstName("Robert")
		.enterMiddleName("Hold")
		.enterLastName("White")	
		.selectNatinality("94")	
		.enterFlatNo("652")
		.enterStreet("Lake Road")
		.enterArea("Poolbagan")
		.selectCountry("94")
		.waitForSignupPage(1000)
		.enterPinCode("110003")
		.waitForSignupPage(2000)
		.enterMobile("'7145278920")
		.selectCityName("South Delhi")
		.waitForSignupPage(2000)
		.selectState("DELHI")
		.waitForSignupPage(2000)
		.selectPostOffice("Kasturba Nagar S.O (South Delhi)")
		.clickSameAddress ()	
		.enterOfficeFlatNo("55")
		.enterOfficeStreet("Next Door Ave")
		.enterOfficeArea("Fatiabad")
		.selectOfficeCountry("94")
		.enterOfficePinCode("560003")
		.waitForSignupPage(2000)
		.enterOfficeMobile("7115278944")
		.selectOfficeCity("Bangalore")
		.waitForSignupPage(2000)
		.selectOfficeState("KARNATAKA")
		.waitForSignupPage(2000)
		.selectOfficePostOffice("Swimming Pool Extn S.O")
		.waitForSignupPage(2000)
		;
		
		
	}
	

}
