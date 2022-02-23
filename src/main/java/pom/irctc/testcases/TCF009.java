package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TCF009 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TCF009";
		testCaseDescription="IRCTC Hotel Booking";
		author="Arif";
		category="Smoke";
		url="https://www.irctc.co.in";


	}

	@Test
	public void irctcHotelBooking() {
		
		new CovidAlertPage()
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.swithWindowAccommodationPage()
		.waitForAccommodationPage(5000)
		.clickOnHotelLinkPage()
		.clickOnHotel()
		.waitForHotelPage(2000)
		.swithWindowHotelPage()
		.waitForHotelPage(6000)
		.clickOnLogin()	
		.waitForHotelPage(5000)
		.clickGusetUserLogin()
		.waitForHotelPage(2000)
		.emailAddress("Tester1@gmail.com")
		.enterMobileNumber("3458881234")
		.waitForHotelPage(3000)
		.clickLoginButton()
		.waitForHotelPage(10000)
		.enterCityName("Kolkata")
		.waitForHotelPage(7000)
		.clickCityName()
		.waitForHotelPage(8000)
		.clickOnDateIn()
		.waitForHotelPage(1000)
		.waitForHotelPage(2000)
		.clickOnInDateonTop()
		.clickOnInYear()
		.waitForHotelPage(1000)
		.clickInOnMonth()
		.waitForHotelPage(1000)
		.clickInOnDay()
		.waitForHotelPage(1000)
		.clickOnDateOut()
		.clickOnOutDateonTop()
		.waitForHotelPage(1000)
		.clickOnOutYear()
		.waitForHotelPage(1000)
		.clickOnOutMonth()
		.waitForHotelPage(1000)
		.clickOnOutDay()
		.waitForHotelPage(1000)
		.clickOnRoomGusets()
		.clickOnNoRoom("1")
		.waitForHotelPage(2000)
		.clickOnNoAdults("3")
		.waitForHotelPage(1000)
		.clickOnDone()
		.waitForHotelPage(2000)
		.clickOnFindHotelButton()
		.waitForHotelPage(10000)
		.clickOnHotelName()
		.waitForHotelListPage(8000)
		.swithWindowHotelListPage()
		.waitForHotelListPage(2000)
		.getHotelName()
		.waitForHotelListPage(8000)
		.getRoomPrice()
		.waitForHotelListPage(6000)
		.clickContinueToBook()
		.waitForHotelPersonaDetails(2000)
		.selectTitle("1")
		.enterFirstName("Fahad")
		.enterLastName("Uddin")
		.selectCountry("India")
		.selectState("WB")
		.selectGST("No")
		.waitForHotelPersonaDetails(2000)
		.clickContinueButton()
		.waitForHotelSummaryPage(3000)
		.verifyHotelName() 
		.waitForHotelSummaryPage(3000)
		.getRoomPrice()
		.waitForHotelSummaryPage(3000)
		.verifyRoomPrice()
		.waitForHotelSummaryPage(3000)
		.clickOnAgreeTerms()
		.clickOnMakePayment()
		.clickOnVerifyButton()
		.verifyRequired("otp is required.")
		.waitForHotelSummaryPage(3000)
		
		
		;
		
		
	}
	
	

}
