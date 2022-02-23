package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FacebookSignup extends GenericWrappers{

	
	public FacebookSignup enterFirstName(String data) {
		enterByXpath(prop.getProperty("FacebookSignupPage.FirstName.XPath"),data);
		//enterByXpath("//input[@id='userId']",data);
		return this;
	}
	
	public FacebookSignup enterLastName(String data) {
		enterByXpath(prop.getProperty("FacebookSignupPage.LastName.XPath"),data);
		return this;
	}
	
	public FacebookSignup enterMobileNumber(String data) {
		enterByXpath(prop.getProperty("FacebookSignupPage.MobileNumber.XPath"),data);
		return this;
	}
	
	public FacebookSignup enterPassword(String data) {
		enterByXpath(prop.getProperty("FacebookSignupPage.Password.XPath"),data);
		return this;
	}
	
	public FacebookSignup clickOnBirthMonth(String data) {
		selectValueTextByXpath(prop.getProperty("FacebookSignupPage.BirthMonth.XPath"),data); 
		return this;
	}
	
	public FacebookSignup clickOnBirthDay(String data) {
		selectValueTextByXpath(prop.getProperty("FacebookSignupPage.BirthDay.XPath"),data); 
		return this;
	}
	public FacebookSignup clickOnBirthYear(String data) {
		selectValueTextByXpath(prop.getProperty("FacebookSignupPage.BirthYear.XPath") ,data); 
		return this;
	}
	public FacebookSignup clickOnGender() {
		clickByXpath(prop.getProperty("FacebookSignupPage.Gender.XPath"));
		return this;
	}
	public FacebookSignup clickOnSignup() {
		clickByXpath(prop.getProperty("FacebookSignupPage.Signup.XPath"));
		return this;
	}
	public FacebookSignup waitForFacebookSignup(long time) {
		waitProperty(time);
		return this;
	}
}
