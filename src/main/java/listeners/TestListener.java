package listeners;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import reporter.ExtentManager;
import reporter.ExtentTestManager;

public class TestListener implements ITestListener {

	public void onStart(ITestContext context) {
		System.out.println("*** Test Suite " + context.getName() + " started ***");
		System.setProperty("org.freemarker.loggerLibrary", "none");
	}

	public void onFinish(ITestContext context) {
		System.out.println(("*** Test Suite " + context.getName() + " ending ***"));
		ExtentTestManager.endTest();
		ExtentManager.getInstance().flush();
	}

	public void onTestStart(ITestResult result) {
		System.out.println(("*** Running test method " + result.getMethod().getMethodName() + "..."));
		ExtentTestManager.startTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("*** Executed " + result.getMethod().getMethodName() + " test successfully...");
		ExtentTestManager.getTest().log(Status.PASS, "Test passed");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("*** Executed " + result.getMethod().getMethodName() + " test FAILED...");
		ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");
		ExtentTestManager.getTest().fail(result.getThrowable());

		StringWriter sw = new StringWriter();
		result.getThrowable().printStackTrace(new PrintWriter(sw));
		sw = null;

		WebDriver driver = (WebDriver) result.getTestContext().getAttribute("driver");
		String root = System.getProperty("user.dir");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File ss = ts.getScreenshotAs(OutputType.FILE);
		long random = System.currentTimeMillis();
		String des = root + "//target//screenshots//ss" + result.getMethod().getMethodName() + random + ".png";

		try {
			FileUtils.copyFile(ss, new File(des));
		} catch (IOException e) {
			e.printStackTrace();
		}

		ExtentTestManager.getTest().fail("Test skipped");
		ExtentTestManager.getTest().addScreenCaptureFromPath(des);

	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("*** Test " + result.getMethod().getMethodName() + " skipped...");
		ExtentTestManager.getTest().log(Status.SKIP, "Test Skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("*** Test failed but within percentage % " + result.getMethod().getMethodName());
	}

}