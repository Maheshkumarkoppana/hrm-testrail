package seleniumUI.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class seleniumHelper {

	protected WebDriver driver;
	private WebDriverWait wait;

	public seleniumHelper(WebDriver driver) {
		this.driver = driver;
	}

	protected void waitforElementbePresent(WebElement e) {
		int waitcount = 0;
		boolean isDisplayed = e.isDisplayed();
		while (!isDisplayed) {
			waitcount = waitcount + 1;
			waitForSeconds(2);
			isDisplayed = e.isDisplayed();
			if (waitcount == 60) {
				System.err.println("element not present in the page");
				break;
			}

		}
		Assert.assertTrue(isDisplayed);
	}

	public WebElement findElementWithXPath(String params1) {
		WebElement findElement = driver.findElement(By.xpath(params1));
		return findElement;
	}

	protected void waitForSeconds(int s) {
		try {
			Thread.sleep(s * 1000);
		} catch (InterruptedException e) {
			System.err.print(e.getMessage());
		}
	}

	protected void switchToIframeWithXpath(WebElement ele) {

		driver.switchTo().frame(ele);

	}

	protected void switchToDefaultContentFromIframe() {
		driver.switchTo().defaultContent();
	}

	protected void waitForElementToBeClickable(WebElement ele) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}

	protected void waitForElementToClickableRefresed(WebElement ele) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(ele)));
	}

	protected void click(WebElement ele) {
		waitForElementToBeClickable(ele);
		ele.click();
	}
	
	protected String getText(WebElement ele) {
 		waitForElementToBeClickable(ele);
		return ele.getText();
	}

	protected void typeText(WebElement ele, String text) {
		waitForElementToBeClickable(ele);
		ele.clear();
		ele.sendKeys(text);
	}

	protected void waitForElementToBeNotVisible(WebElement ele) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.invisibilityOf(ele));
	}
}
