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
//import seleniumUI.pages.DragAndDropPage;
//import seleniumUI.pages.MyProfilePage;
//import seleniumUI.testCaseBase.testBase;
//
//public class DragAndDropTestCase1 extends testBase {
//
//	MyProfilePage homepage;
//	DragAndDropPage dragAndDropPage;
//	private ExtentTest extentTest;
//
//	@BeforeMethod
//	public void beforeMethod(ITestContext context) throws Exception {
//
//		setUp(context);
//	}
//
//	@Test
//	public void VerifyDragAndDropCase1() {
//
//		extentTest = ExtentTestManager.getTest();
//
//		homepage = pages().getHomepage();
//		dragAndDropPage = pages().getDragAndDropPage();
//
//		homepage.clickOnDroppableMenu();
//		extentTest.log(Status.INFO, "clicked on droppable menu");
//		Assert.assertTrue(dragAndDropPage.performDragAndDrop(), "Drag and Drop failure");
//		extentTest.log(Status.INFO, "Drag and Drop successful");
//
//	}
//
//	@AfterMethod
//
//	public void cleanUp() {
//		driver.quit();
//	}
//}
