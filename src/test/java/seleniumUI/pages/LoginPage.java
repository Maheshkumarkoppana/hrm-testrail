package seleniumUI.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import seleniumUI.utils.seleniumHelper;

public class LoginPage extends seleniumHelper {
	
	protected WebDriver driver;

	@FindBy(how = How.ID, using = "employeeId")
	private WebElement employeeId;
	
	
	@FindBy(how = How.ID, using = "password")
	private WebElement employeePassword;
	
	
	

	@FindBy(how = How.XPATH, using = "//button[contains(@class,'primary btn-lg')]")
	private WebElement Login_btn;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	
	public void login(final String userID, final String pwd) {
		
		typeText(employeeId, userID);
		typeText(employeePassword, pwd);
		click(Login_btn);
		
	}
	
	
	
	

}
