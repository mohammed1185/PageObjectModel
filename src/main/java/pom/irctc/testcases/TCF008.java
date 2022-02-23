package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TCF008 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TCF008";
		testCaseDescription="IRCTC Charter";
		author="Arif";
		category="Smoke";
		url="https://www.irctc.co.in/nget/train-search";


	}

	@Test
	
	public void irctcCharter() {
		
		new CovidAlertPage()
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.swithWindowAccommodationPage()
		.waitForAccommodationPage(2500)
		.clickMenu() 
		.clickOnCharter()
		.waitForCharterPage(3000)
		.clickOnEnquiryForm()	
		.enterApllicantName("Nelson Robert")
		.enterOrganizationName("Tester Information Inc")
		.enterAddress("144 Park Ave N")
		.enterMobileNo("7155598")
		.enterEmailAddress("Nelson.Robert@yahoo.com")
		.selectRequest("Saloon Charter")
		.waitForCharterPage(4000)
		.enterOriginatingStationName("Puna")
		.enterDestinationStationName("Kolkata")
		.clickOnDepartureCal()
		.waitForCharterPage(2000)
		.clickOnDate()
		.waitForCharterPage(2000)
		.clickOnArrivalCal()
		.waitForCharterPage(2000)
		.clickOnArrDate()
		.waitForCharterPage(3000)
		.enterDurationDays("13")
		.waitForCharterPage(2000)
		.enterNumberTypeCoaches("2 and Uppper Sleeper")
		.enterNumberPassengers("4")
		.enterPurposeChater("Enjoy beautiful day")
		.enterServiceRequired("Do not disturb")
		.clickSubmitButton()
		.verifyMobile("Mobile no. not valid")
		.waitForCharterPage(1000)
		;
		
	}

}
