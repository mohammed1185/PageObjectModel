package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TCF001 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
	testCaseName="TCF001";
	testCaseDescription="IRCTC Registration";
	author="Arif";
	category="Smoke";
	url="http://www.irctc.in";
	sheetName="TC001";
	}
	
	@Test(dataProvider="fetchData")
	
	public void irctcRegistration (
			String userName,
			String password,
			String securityAns,
			String firstName,
			String middleName,
			String lastName,
			String year,
			String month,
			String country,
			String email,
			String mobileNo,
			String resAddress1,
			String resAddress2,
			String resAddress3,
			String resPinCode,
			String resPhone,
			String resCity,
			String resPostOffice,
			String offAddress1,
			String offAddress2,
			String offAddress3,
			String offPinCode,
			String offPhone,
			String offCity,
			String offPostOffice) {
		
		
		new CovidAlertPage()
		.clickOnOk()
		.waitForHomePage(10000)
		.clickOnRegister()
		.waitForRegistrationPage(10000)
		.enterUserName(userName)
		.enterPassword(password)
		.enterConfirmPassword(password)
		.clickPreferredLanguage()
		.waitForRegistrationPage(2000)
		.clickOnPreferredLanguage()
		.waitForRegistrationPage(1000)
		.clickSecurtyQuestions()
		.waitForRegistrationPage(1000)
		.clickOnSecurtyQuestions()		
		.enterSecurtyAnswer(securityAns)					
		.clickOnContinueButton()					
		//Personal Details
		.enterFirstName(firstName)
		.enterMiddleName(middleName)
		.enterLastName(lastName)
		.clickOccupation()	
		.selectOccupation()
		.waitForRegistrationPage(2000)
		.clickDateOfBirth()	
		.clickDateOfBirthYear(year)
		.waitForRegistrationPage(2000)
		.clickDateOfBirthMonth(month)	
		.waitForRegistrationPage(2000)
		.clickDateOfBirthDay("11")
		.waitForRegistrationPage(1000)
		.clickOnMarried()			
		.clickOnCountry(country)			
		.clickOnGender()			
		.enterEmail(email)		
		.enterMobile(mobileNo)		
		.clickOnNationality(country)		
		.clickContinueButton()	
		.waitForRegistrationPage(3000)
		//Address	
		.enterFlatNo(resAddress1)		
		.enterStreetName(resAddress2)		
		.enterArea(resAddress3)		
		.enterPinCode(resPinCode)	
		.waitForRegistrationPage(3000)
		.enterResPhone(resPhone)
		.waitForRegistrationPage(2000)
		.clickOnCity(resCity)
		.waitForRegistrationPage(2000)
		.clickPostOffice(resPostOffice)	
		.waitForRegistrationPage(1000)
		.clickOnCopyAddress()		
		.enterOfficeFlat(offAddress1)		
		.enterOfficeStreet(offAddress2)	
		.enterOfficeArea(offAddress3)		
		.enterOfficePinCode(offPinCode)
		.waitForRegistrationPage(2000)
		.enterOfficePhone(offPhone)	
		.waitForRegistrationPage(1000)
		.clickOfficeCity(offCity)
		.waitForRegistrationPage(2000)
		.clickOfficePostOffice(offPostOffice)
		.waitForRegistrationPage(2000)
		.clickOfficeCountry()
		.waitForRegistrationPage(2000)
		.clickOfficeCountryName()
		.waitForRegistrationPage(3000)
		
		;
		
		
	}
	
}
