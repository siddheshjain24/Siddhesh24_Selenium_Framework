package Jewelry;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Generic_Utility.Base_Class;
import Generic_Utility.Excel_Utility;
import Generic_Utility.Listners_Utility;
import Generic_Utility.WebDriver_Utility;
import Object_Repository.Home_Page;

@Listeners(Listners_Utility.class)

public class TC_DWS_062_Test extends Base_Class {

	@Test
	public void clickOnSortLowToHighInJewelry() throws EncryptedDocumentException, IOException {
		Home_Page hp = new Home_Page(driver);
		hp.getJewelryLink().click();
		WebElement sortBy = driver.findElement(By.id("products-orderby"));
		WebDriver_Utility wutility = new WebDriver_Utility();
		Excel_Utility eutility = new Excel_Utility();
		String sort = eutility.getStringDataFromExcel("sheet1", 1, 7);
		sortBy.click();
		wutility.selectDropDown(sort, sortBy);
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Jewelry","Low to high is not displayed");
		test.log(Status.PASS, "Low to high is displayed");
	}
}
