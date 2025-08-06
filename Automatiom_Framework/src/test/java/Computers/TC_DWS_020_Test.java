package Computers;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Generic_Utility.Base_Class;
import Generic_Utility.Listners_Utility;
import Object_Repository.Home_Page;
@Listeners(Listners_Utility.class)

public class TC_DWS_020_Test extends Base_Class{
	@Test
	public void clickOnComputers() {
		Home_Page hp= new Home_Page(driver);
		hp.getComputersLink().click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Computers","computer page is not displayed");
		test.log(Status.PASS, "computer page is displayed");
	}
}
