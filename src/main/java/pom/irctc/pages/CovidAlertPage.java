package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CovidAlertPage extends GenericWrappers{

	public HomePage clickOnOk() {
		clickByXpath(prop.getProperty("HomePage.OkButton.XPath"));
		return new HomePage();
	}
	
	
}
