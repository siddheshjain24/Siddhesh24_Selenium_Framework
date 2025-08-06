package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Siddhesh Jain
 */
public class Login_Page {

	@FindBy(id = "Email")
	private WebElement emailTF;
	
	@FindBy(id = "Password")
	private WebElement passwordTF;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginbutton;
	
	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getEmail() {
		return emailTF;
	}

	public WebElement getPassword() {
		return passwordTF;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
}
