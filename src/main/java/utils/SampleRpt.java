package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleRpt {


	@Test
	public void generateReport() {

		// start report
		ExtentReports report = new ExtentReports("./reports/result.html", false);

		// start test
		ExtentTest test = report.startTest("TC006", "To verify IRCTC Registration for the new user");

		test.assignAuthor("Arif");
		test.assignCategory("Regression");
		test.addScreenCapture("./reports/Asiya.jpg");

		// log test steps
		test.log(LogStatus.PASS, "Application got launched with the given url successfully");
		test.log(LogStatus.PASS, "Application got launched with the given url successfully");
		test.log(LogStatus.PASS, "Application got launched with the given url successfully");
		test.log(LogStatus.FAIL, "Application got launched with the given url successfully");
		test.log(LogStatus.PASS, "Application got launched with the given url successfully");
		test.log(LogStatus.PASS, "Application got launched with the given url successfully");
		test.log(LogStatus.PASS, "Application got launched with the given url successfully");
		test.log(LogStatus.PASS, "Application got launched with the given url successfully");
		test.log(LogStatus.PASS, "Application got launched with the given url successfully");
		test.log(LogStatus.PASS, "Application got launched with the given url successfully");
		test.log(LogStatus.PASS, "Application got launched with the given url successfully");


		// end test
		report.endTest(test);

		// end report
		report.flush();
	}


}
