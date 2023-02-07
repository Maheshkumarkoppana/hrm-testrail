//package seleniumUI.testCases;
//
//import org.testng.ITestContext;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//
//import reporter.ExtentTestManager;
//import seleniumUI.pages.DragAndDropPage;
//import seleniumUI.pages.MyProfilePage;
//import seleniumUI.pages.SelectablePage;
//import seleniumUI.testCaseBase.testBase;
//
//public class SelectableTestCase2 extends testBase {
//
//	MyProfilePage homepage;
//	DragAndDropPage dragAndDropPage;
//	SelectablePage selectablePage;
//	private ExtentTest extentTest;
//
//	@BeforeMethod
//	public void beforeMethod(ITestContext context) throws Exception {
//
//		setUp(context);
//	}
//
//	@Test
//	public void VerifySelectableCase2() {
//
//		extentTest = ExtentTestManager.getTest();
//
//		homepage = pages().getHomepage();
//		dragAndDropPage = pages().getDragAndDropPage();
//		selectablePage = pages().getSelectablePage();
//
//		homepage.clickOnSelectableMenu();
//		extentTest.log(Status.INFO, "clicked on Selectable menu");		
//		
//		selectablePage.selectOptions("Item 1", "Item 3", "Item 7");
//		extentTest.log(Status.INFO, "items are selected");
//
//		selectablePage.assertSelectedOptions("Item 1", "Item 3", "Item 7");
//		extentTest.log(Status.INFO, "selected items are verified");
//		
//	}
//
//	@AfterMethod
//
//	public void cleanUp() {
//		driver.quit();
//	}
//}
