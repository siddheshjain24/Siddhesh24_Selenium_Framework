package Generic_Utility;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
/**
 * @author Siddhesh Jain
 */
public class WebDriver_Utility {

	/**
	 * This method Will Maximise the Window
	 * @param driver
	 */
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	
	/**
	 * This method Will Minimize the Window
	 * @param driver
	 */
	public void minimize(WebDriver driver) {
		driver.manage().window().minimize();
	}
	
	
	/**
	 * This method Will point the mouse cursor to that particular Element
	 * @param driver
	 */
	public void mouseHover(WebDriver driver,WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	
	/**
	 * This method Will Scroll to that particular Element Location
 	 * @param driver
	 */
	public void scrollToElement(WebDriver driver,WebElement element) {
		Actions act = new Actions(driver);
		act.scrollToElement(element).perform();
	}
	
	
	/**
	 * This method Will Scroll to that particular Amount given by Caller
 	 * @param driver
	 */
	public void scrollBYAmount(WebDriver driver,WebElement element,int x,int y) {
		Actions act = new Actions(driver);
		act.scrollByAmount(x,y).perform();
	}
	
	
	/**
	 * This method Will Right Click on that particular Element
 	 * @param driver
	 */
	public void rightClick(WebDriver driver,WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick(element).perform();
	}
	
	
	/**
	 * This method Will Select the particular element DropDown by index
 	 * @param driver
	 */
	public void selectDropDown(WebElement element,int index) {
		Select sec = new Select(element);
		sec.selectByIndex(index);
	}
	
	
	/**
	 * This method Will Select the particular element DropDown by Value
 	 * @param driver
	 */
	public void selectDropDown(WebElement element,String value) {
		Select sec = new Select(element);
		sec.selectByValue(value);
	}
	
	
	/**
	 * This method Will Select the particular element DropDown by VisibleText
 	 * @param driver
	 */
	public void selectDropDown(String text,WebElement element) {
		Select sec = new Select(element);
		sec.selectByVisibleText(text);
	}
	
	
	public List<WebElement> selectByGetOption(WebElement element) {
		Select sec = new Select(element);
		return sec.getOptions();
	}
	
	
	/**
	 * This method Will Switch to frame according to index 
 	 * @param driver
	 */
	public void switchToFrame(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	
	
	/**
	 * This method Will Switch to frame according to nameOrId 
 	 * @param driver
	 */
	public void switchToFrame(WebDriver driver,String nameORId) {
		driver.switchTo().frame(nameORId);
	}
	
	
	/**
	 * This method Will Switch to frame according to particular element 
 	 * @param driver
	 */
	public void switchToFrame(WebDriver driver,WebElement element) {
		driver.switchTo().frame(element);
	}
	
	
	/**
	 * This method Will Switch to Alert Popup & acc to Caller he will perform action(accept,dismiss,getText)
 	 * @param driver
	 */
	public Alert switchToAlert(WebDriver driver) {
		return driver.switchTo().alert();
	}
	
	
	/**
	 * This method Will take Screenshot and Store it in the Screenshots folder and will get real time also previous also
 	 * @param driver
	 */
	public void getPhoto(WebDriver driver) throws IOException {
		Java_Utility jutil = new Java_Utility();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/"+jutil.getSystemTime()+".png");
		FileHandler.copy(temp, dest);
	}
	
	
	/**
	 * This method Will Switch to Window and perform action acc. to window id  
 	 * @param driver
	 */
	public void switchToWindow(WebDriver driver,String expUrl) {
		Set<String> allWindowIds = driver.getWindowHandles();
		for (String id : allWindowIds) {
			driver.switchTo().window(id);
			String acctUrl = driver.getCurrentUrl();
			if(acctUrl.contains(expUrl)) {
				break;
			}
		}
	}
	
	
	/**
	 * This method Will Switch to Window and perform action acc. to window Title  
 	 * @param driver
	 */
	public void switchToWindow(String expTitle,WebDriver driver) {
		Set<String> allWindowIds = driver.getWindowHandles();
		for (String id : allWindowIds) {
			driver.switchTo().window(id);
			String acctUrl = driver.getTitle();
			if(acctUrl.contains(expTitle)) {
				break;
			}
		}
	}
}
	

