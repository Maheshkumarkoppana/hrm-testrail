package seleniumUI.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import seleniumUI.utils.seleniumHelper;

public class MyProfilePage extends seleniumHelper {

	protected WebDriver driver;
	boolean isValid;

	@FindBy(how = How.XPATH, using = "//div[@class='Toastify']//div[contains(.,'successfully logged into')]")
	private WebElement loginSuccessMessage;

	@FindBy(how = How.XPATH, using = "//button[contains(.,'Projects')]")
	private WebElement projectMainMenu;

	@FindBy(how = How.XPATH, using = "//div[@class='list-group']//a[contains(@href,'Projects')]")
	private WebElement projectSubMenu;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'card-subtitle') and contains(.,'Email')]")
	private WebElement emailInfo;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'card-subtitle') and contains(.,'Blood Group:')]")
	private WebElement bloodGroup;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'card-subtitle') and contains(.,'Phone Number:')]")
	private WebElement phoneNumber;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'card-subtitle') and contains(.,'Gender:')]")
	private WebElement genderInfo;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'card-subtitle') and contains(.,'Emergency Phone Number:')]")
	private WebElement emergencyphonenumberInfo;

	@FindBy(how = How.ID, using = "password")
	private WebElement requestionRequest;

	public MyProfilePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void assertLoginSuccessfulMessageIsDisplayed() {

		waitforElementbePresent(loginSuccessMessage);
	}

	public void selectProjectMainMenu() {
		click(projectMainMenu);
	}

	public void clickOnProjectSubMenu() {

		click(projectSubMenu);
	}

	public void assertEmailInfoIsDisplayed() {

		waitforElementbePresent(emailInfo);
	}

	public void assertBloodGroupInfoIsDisplayed() {

		waitforElementbePresent(bloodGroup);
	}

	public void assertPhoneNumberIsDisplayed() {

		waitforElementbePresent(phoneNumber);
	}

	public void assertGenderInfoIsDispalyed() {

		waitforElementbePresent(genderInfo);
	}

	public void assertEmergencyPhoneNumberIsDispalyed() {

		waitforElementbePresent(emergencyphonenumberInfo);
	}

	public void clickOnRequestionRequest() {

		click(requestionRequest);
	}

}
