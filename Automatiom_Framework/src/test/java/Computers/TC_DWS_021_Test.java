package Computers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Generic_Utility.Base_Class;
import Generic_Utility.Listners_Utility;
import Generic_Utility.WebDriver_Utility;
import Object_Repository.Home_Page;

@Listeners(Listners_Utility.class)

public class TC_DWS_021_Test extends Base_Class {

	
	@Test
	public void clickOnDestopInComputers() {
		Home_Page hp = new Home_Page(driver);
		WebDriver_Utility wutility = new WebDriver_Utility();
		WebElement Computers = hp.getComputersLink();
		wutility.mouseHover(driver, Computers);
		driver.findElement(By.partialLinkText("Desktops")).click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Desktops","Desktop page is not displayed");
		test.log(Status.PASS, "Desktop page is displayed");
	}
	
}
