//package seleniumUI.testCases;
//
//import org.testng.Assert;
//import org.testng.ITestContext;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//
//import reporter.ExtentTestManager;
//import seleniumUI.pages.ControlGroupPage;
//import seleniumUI.pages.MyProfilePage;
//import seleniumUI.testCaseBase.testBase;
//
//public class ControlGroupTestCase3 extends testBase {
//
//	MyProfilePage homepage;
//	ControlGroupPage controlGroupPage;
//	private ExtentTest extentTest;
//
//	@BeforeMethod
//	public void beforeMethod(ITestContext context) throws Exception {
//
//		setUp(context);
//	}
//
//	@Test
//	public void VerifyControlGroupCase3() {
//
//		extentTest = ExtentTestManager.getTest();
//
//		homepage = pages().getHomepage();
//		controlGroupPage = pages().getControlGroupPage();
//
//		homepage.clickOnControlGroupMenu();
//		extentTest.log(Status.INFO, "clicked on Control Group menu");
//
//		controlGroupPage.selectAutomatomaticTransmissionFromHorizontalGroup();
//		extentTest.log(Status.INFO, "select Automatic Transmission from Horizontal Group");
//
//		controlGroupPage.selectInsuranceFromHorizaontalGroup();
//		extentTest.log(Status.INFO, "select Insurance from Horizontal Group");
//
//		Assert.assertTrue(controlGroupPage.verifyAutomatomaticTransmissionIsSelectedInHorizontalGroup(),
//				"Automatic Transmission selection error in horizantal group");
//		extentTest.log(Status.INFO, "Automatic Transmission is selected from Horizontal Group");
//
//		Assert.assertTrue(controlGroupPage.verifyInsuranceIsSelectedInHorizontalGroup(),
//				"Insurance selection error in horizantal group");
//		extentTest.log(Status.INFO, "Insurance is selected from Horizontal Group");
//
//		controlGroupPage.selectAutomatomaticTransmissionFromVerticalGroup();
//		extentTest.log(Status.INFO, "select Automatic Transmission from Horizontal Group");
//
//		controlGroupPage.selectInsuranceFromVerticalGroup();
//		extentTest.log(Status.INFO, "select Insurance from Horizontal Group");
//
//		Assert.assertTrue(controlGroupPage.verifyAutomatomaticTransmissionIsSelectedInVerticalGroup(),
//				"Automatic Transmission selection error in veritcal group");
//		extentTest.log(Status.INFO, "Automatic Transmission is selected from Horizontal Group");
//
//		Assert.assertTrue(controlGroupPage.verifyInsuranceIsSelectedInVerticalGroup(),
//				"Insurance selection error in veritcal group");
//		extentTest.log(Status.INFO, "Insurance is selected from Horizontal Group");
//
//	}
//
//	@AfterMethod
//
//	public void cleanUp() {
//		driver.quit();
//	}
//}
