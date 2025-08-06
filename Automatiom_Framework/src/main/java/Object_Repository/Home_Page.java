package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Siddhesh Jain
 */
public class Home_Page {
	
	@FindBy(linkText = "Log out")
	private WebElement logOutLink;
	
	@FindBy(partialLinkText = "BOOKS")
	private WebElement booksLink;
	
	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement computersLink;
	
	@FindBy(partialLinkText = "ELECTRONICS")
	private WebElement electronicsLink;
	
	@FindBy(partialLinkText = "JEWELRY")
	private WebElement jewelryLink;

	
	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	public WebElement getLogOutLink() {
		return logOutLink;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}
	
	public WebElement getJewelryLink() {
		return jewelryLink;
	}
}
