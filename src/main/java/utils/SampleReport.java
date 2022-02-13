package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {
	
	@Test
	public void generateReport() {
		
		
		ExtentReports report = new ExtentReports("./reports/Result.html");
		
		ExtentTest test = report.startTest("TC001", "To verify IRCTC Registration");
		
		test.log(LogStatus.PASS, "The browser launched with given url");
		
		test.log(LogStatus.PASS, "The browser launched with given url");
		test.log(LogStatus.PASS, "The browser launched with given url");
		test.log(LogStatus.PASS, "The browser launched with given url");
		test.log(LogStatus.PASS, "The browser launched with given url");
		test.log(LogStatus.PASS, "The browser launched with given url");
		test.log(LogStatus.PASS, "The browser launched with given url");
		
		report.endTest(test);
		report.flush();
		
		
	}

}
