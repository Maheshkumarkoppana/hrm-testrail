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

public class MyProfileTest extends testBase {

	private ExtentTest extentTest;
	LoginPage loginPage;
	MyProfilePage myProfilePage;

	@BeforeMethod
	public void beforeMethod(ITestContext context) throws Exception {

		setUp(context);

	}

	@Test
	public void verifyPerosonalInfoUnderMyProfile() {

		// initalize the page objects
		loginPage = pages().getLoginpage();
		myProfilePage = pages().getMyProfilepage();
		extentTest = ExtentTestManager.getTest();

		loginPage.login("ATPL037", "userRr6755");
		myProfilePage.assertLoginSuccessfulMessageIsDisplayed();
		extentTest.log(Status.INFO, "Login successful with the given credentails");
		
		myProfilePage.assertBloodGroupInfoIsDisplayed();
		extentTest.log(Status.INFO, "Blood Group Info is displayed successfully");
		
		myProfilePage.assertPhoneNumberIsDisplayed();
		extentTest.log(Status.INFO, "Phone Number Info is displayed successfully");
		
		myProfilePage.assertEmailInfoIsDisplayed();
		extentTest.log(Status.INFO, "Email Info is displayed successfully");
		
		myProfilePage.assertGenderInfoIsDispalyed();
		extentTest.log(Status.INFO, "Gender Info is displayed successfully");

	}
	
	@Test
	public void verifyIfTheUserCanRiseRequestionAndUseIt() {

		// initalize the page objects
		loginPage = pages().getLoginpage();
		myProfilePage = pages().getMyProfilepage();
		extentTest = ExtentTestManager.getTest();

		loginPage.login("ATPL034", "userVd205");
		myProfilePage.assertLoginSuccessfulMessageIsDisplayed();
		extentTest.log(Status.INFO, "Login successful with the given credentails");
		
		
		myProfilePage.clickOnRequestionRequest();
		
	}


	@AfterMethod

	public void cleanUp() {
		driver.quit();
	}
}
