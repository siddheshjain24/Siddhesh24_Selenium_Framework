package Generic_Utility;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Object_Repository.Home_Page;
import Object_Repository.Login_Page;
import Object_Repository.Welcome_Page;

public class Base_Class {

	public static WebDriver driver;//public(to access outside the Package also)  static(same)
	public static ExtentReports ereports; /*static(we want only one  report while we run pom.xml inside how many 
													testCases we have means ==> only one instance at a time)*/
										 //public(to access outside the Package also)
	public Java_Utility jutil = new Java_Utility();  //public(to access outside the Package also)
	public WebDriver_Utility wutil = new WebDriver_Utility();
	public File_Utility futil = new File_Utility();
	public Excel_Utility eutil = new Excel_Utility();
	public static ExtentTest test; //becoz in Listners_Utility we have one override method OnTestStart so before every script 
								   //execution started it will first Start OnTestStart method first for every Script and Overrider
								   //@Listners in every script

	
	
	@BeforeSuite
	public void reportConfig() {
		ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_Reports/ExtentReports_"+jutil.getSystemTime()+".html");
		ereports = new ExtentReports();
		ereports.attachReporter(spark);
	} 
	
	@BeforeClass
	public void openBrowser() throws IOException {
		driver = new ChromeDriver();
		wutil.maximize(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//String URL = futil.getDataFromProperty("url"); we can create like this also but waste of line of code
		driver.get(futil.getDataFromProperty("url")); //here use that URL(no need)
	}
	
	@BeforeMethod
	public void login() throws IOException {
		Welcome_Page wp = new Welcome_Page(driver);
		wp.getLoginLink().click();
		
		Login_Page lp = new Login_Page(driver);
		lp.getEmail().sendKeys(futil.getDataFromProperty("email"));
		lp.getPassword().sendKeys(futil.getDataFromProperty("password"));
		lp.getLoginbutton().click();	
	}
	
	@AfterMethod
	public void logout() {
		Home_Page hp = new Home_Page(driver);
		hp.getLogOutLink().click();
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	
	@AfterSuite
	public void reportBackup() {
		ereports.flush();
	}
	// Hi Siddhesh
}
