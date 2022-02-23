package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.FacebookHomePage;

import wrappers.ProjectWrappers;

public class TCF006 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TCF006";
		testCaseDescription="FaceBook Signup";
		author="Arif";
		category="Smoke";
		url="https://www.facebook.com/";
		sheetName="TC006";

	}

	@Test(dataProvider="fetchData")


	public void faceBookSignup(	
			String firstName,
			String lastName, 
			String phoneNumber,
			String password,
			String birthMonth, 
			String birthDay, 
			String birthYear 
		 
			) {


		new FacebookHomePage()
		.waitForFacebookHomePage(1000)
		.clickOnCreateNewAccount()
		.waitForFacebookSignup(2000)
		.enterFirstName(firstName)	
		.enterLastName(lastName)			
		.enterMobileNumber(phoneNumber)	
		.enterPassword(password)	
		.clickOnBirthMonth(birthMonth)	
		.waitForFacebookSignup(2000)
		.clickOnBirthDay(birthDay)
		.waitForFacebookSignup(2000)
		.clickOnBirthYear(birthYear)
		.waitForFacebookSignup(2000)
		.clickOnGender()
		.waitForFacebookSignup(1000)
		.clickOnSignup()

		;


	}

}
