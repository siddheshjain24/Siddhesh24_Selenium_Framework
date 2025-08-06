package Books;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Generic_Utility.Base_Class;
import Generic_Utility.Listners_Utility;
import Object_Repository.Home_Page;

@Listeners(Listners_Utility.class)

public class TC_DWS_001_Test extends Base_Class{

	@Test
	public void clickOnBooks() {
		Home_Page hp = new Home_Page(driver);
		hp.getBooksLink();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Books", "Books page is not displayed");
		test.log(Status.PASS, "Books page is displayed");
	}
}
