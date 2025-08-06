package Generic_Utility;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class Listners_Utility extends Base_Class implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		test = ereports.createTest(result.getName());  /*why we have created here so that in every script 
														no need to create this again and again OnTestStart will 
														take care of it 
		 												*/
													   //result.getName() = becoz it will take Current
													   //script	Method Name									
		test.log(Status.INFO, "Test Execution Started");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		//why this one also becoz it will take Screenshot in Base64 Format and also Attach in the HTML_Report
		test.log(Status.FAIL, "Test Execution is Failed");
		TakesScreenshot ts = (TakesScreenshot) driver;
		test.addScreenCaptureFromBase64String(ts.getScreenshotAs(OutputType.BASE64));
		
		//this one will take Screenshot in file Format and store in Screenshots Folder
		try {
			wutil.getPhoto(driver);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
