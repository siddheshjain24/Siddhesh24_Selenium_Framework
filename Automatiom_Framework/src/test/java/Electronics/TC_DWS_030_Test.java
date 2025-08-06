package Electronics;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Generic_Utility.Base_Class;
import Object_Repository.Home_Page;

public class TC_DWS_030_Test extends Base_Class {
	
	@Test
	public void clickOnElectronics() {
		Home_Page hp= new Home_Page(driver);
		hp.getElectronicsLink().click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Electronics","Electronics page is not displayed");
		test.log(Status.PASS, "Electronics page is displayed");
	}
}
