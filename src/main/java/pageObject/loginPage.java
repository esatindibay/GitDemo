package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	public WebDriver driver;

	public loginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "passp-field-login")
	WebElement username;

	public WebElement EnterUsername() {
		return username;
	}

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitusar;

	public WebElement submit_usernm() {
		return submitusar;
	}

	@FindBy(id = "passp-field-passwd")
	WebElement password;

	public WebElement EnterPassword() {
		return password;
	}

}
