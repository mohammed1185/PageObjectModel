package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CoachTrainNewUserPage extends GenericWrappers{
	
	public CoachTrainNewUserPage swithWindowCoachTrainNewUserPage() {
		switchToLastWindow();
		return this;
	}
	
	public CoachTrainNewUserPage waitForCoachTrainNewUserPage(long time) {
		waitProperty(time);
		return this;
	}
	
	public SignupPage clickNewUserSignup() {
		clickByXpath(prop.getProperty("SignupPage.NewUserSignup.XPath"));
		return new SignupPage();
	}

	

}
