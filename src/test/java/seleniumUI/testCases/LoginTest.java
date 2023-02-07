package seleniumUI.testCases;

import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import reporter.ExtentTestManager;
import seleniumUI.pages.LoginPage;
import seleniumUI.pages.MyProfilePage;
import seleniumUI.testCaseBase.testBase;

public class LoginTest extends testBase {

	private ExtentTest extentTest;
	LoginPage loginPage;
	MyProfilePage myProfilePage;

	@BeforeMethod
	public void beforeMethod(ITestContext context) throws Exception {

		setUp(context);

	}

	@Test
	public void VerifyLogin() {

		// initalize the page objects
		loginPage = pages().getLoginpage();
		myProfilePage = pages().getMyProfilepage();
		extentTest = ExtentTestManager.getTest();

		loginPage.login("ATPL037", "userRr6755");
		myProfilePage.assertLoginSuccessfulMessageIsDisplayed();
		extentTest.log(Status.INFO, "Login successful with the given credentails");

	}

	@AfterMethod

	public void cleanUp() {
		driver.quit();
	}
}
