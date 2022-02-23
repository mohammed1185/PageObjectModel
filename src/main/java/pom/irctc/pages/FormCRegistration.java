package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FormCRegistration extends GenericWrappers {

		public FormCandFormS clickOnSignUp() {
		clickByXpath(prop.getProperty("FormCandFormS.SignUp.XPath"));
		return new FormCandFormS();
		
		}
	
		
	
	
	
}
