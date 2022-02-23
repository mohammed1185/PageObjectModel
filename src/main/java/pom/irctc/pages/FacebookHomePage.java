package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FacebookHomePage extends GenericWrappers{

	public FacebookSignup clickOnCreateNewAccount() {
		clickByXpath(prop.getProperty("FacebookHomePage.CreateNewAccount.XPath"));
		return new FacebookSignup();
	}
	public FacebookHomePage waitForFacebookHomePage(long time) {
		waitProperty(time);
		return this;
	}
}
