package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CoachTrainNewUserPage;
import wrappers.ProjectWrappers;

public class TCF002 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName = "TCF002";
		testCaseDescription ="IRCTS Sighup";
		author = "Arif";
		category="Smoke";
		url="https://www.ftr.irctc.co.in/ftr/";
		sheetName="TC002";
	}
	
	@Test(dataProvider="fetchData")
	
	public void irctcSignup(
			String userID,
			String password,
			String securityQ,
			String securityA,
			String dOBYear,
			String DOBMonth,
			String eMail,
			String occuPation,
			String firstName,
			String middleName,
			String lastName,
			String country,
			String flatNo,
			String streetAddress,
			String area,
			String mobile,
			String pinCode,
			String city,
			String state,
			String postOffice,
			String offFlatNo,
			String offStreetAddress,
			String offArea,
			String offMobile,
			String offPinCode,
			String offCity,
			String offState,
			String offPostOffice
			) {
		
		new CoachTrainNewUserPage()
		.clickNewUserSignup()
		.enterUserID(userID)
		.enterPassword(password)
		.enterCofPassword(password)
		.selectSecurityQuestion(securityQ)
		.enterSecurityAnswer(securityA)
		.clickOnDateOfBirth()
		.selectYear(dOBYear)
		.selectMonth(DOBMonth)
		.clickOnDate()
		.waitForSignupPage(2000)
		.clickGender()
		.clickMaritalStauts()
		.enterEmail(eMail)
		.selectOccupation(occuPation)
		.enterFirstName(firstName)
		.enterMiddleName(middleName)
		.enterLastName(lastName)
		.selectNatinality(country)
		.enterFlatNo(flatNo)
		.enterStreet(streetAddress)
		.enterArea(area)
		.selectCountry(country)
		.enterPinCode(pinCode)
		.enterMobile(mobile)
		.selectCityName(city)
		.selectState(state)
		.selectPostOffice(postOffice)
		.clickSameAddress ()
		.enterOfficeFlatNo(offFlatNo)
		.enterOfficeStreet(offStreetAddress)
		.enterOfficeArea(offArea)
		.selectOfficeCountry(country)
		.enterOfficePinCode(offPinCode)
		.waitForSignupPage(2000)
		.enterOfficeMobile(offMobile)
		.selectOfficeCity(offCity)
		.selectOfficeState(offState)
		.selectOfficePostOffice(offPostOffice)
		;
		
		
	}
	

}
