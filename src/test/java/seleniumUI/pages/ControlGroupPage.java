//package seleniumUI.pages;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//
//import seleniumUI.utils.seleniumHelper;
//
//public class ControlGroupPage extends seleniumHelper {
//
//	protected WebDriver driver;
//
//	protected boolean isValid;
//
//	@FindBy(how = How.XPATH, using = "//iframe[@class='demo-frame']")
//	private WebElement iframe;
//
//	@FindBy(how = How.XPATH, using = "//div[contains(@class,'controlgroup-horizontal')]//label[contains(@for,'transmission-automatic')]")
//	private WebElement horizontalGroupAutomaticTransmission;
//
//	@FindBy(how = How.XPATH, using = "//div[contains(@class,'controlgroup-vertical')]//label[contains(@for,'transmission-automatic')]")
//	private WebElement verticalGroupAutomaticTransmission;
//
//	@FindBy(how = How.XPATH, using = "//div[contains(@class,'controlgroup-horizontal')]//label[contains(@for,'insurance')]")
//	private WebElement horizontalGroupInsurance;
//
//	@FindBy(how = How.XPATH, using = "//div[contains(@class,'controlgroup-vertical')]//label[contains(@for,'insurance')]")
//	private WebElement verticalGroupAutomaticInsurance;
//
////	private String automaticTransmission = "//label[contains(@for,'transmission-automatic')]";
////
////	private String insurance = "//label[contains(@for,'insurance')]";
//
//	public ControlGroupPage(WebDriver driver) {
//		super(driver);
//		this.driver = driver;
//	}
//
//	public void selectAutomatomaticTransmissionFromHorizontalGroup() {
//		switchToIframeWithXpath(iframe);
//		waitForElementToBeClickable(horizontalGroupAutomaticTransmission);
//		click(horizontalGroupAutomaticTransmission);
//		switchToDefaultContentFromIframe();
//
//	}
//
//	public void selectInsuranceFromHorizaontalGroup() {
//		switchToIframeWithXpath(iframe);
//		waitForElementToBeClickable(horizontalGroupInsurance);
//		click(horizontalGroupInsurance);
//		switchToDefaultContentFromIframe();
//
//	}
//
//	public boolean verifyAutomatomaticTransmissionIsSelectedInHorizontalGroup() {
//
//		switchToIframeWithXpath(iframe);
//		if (horizontalGroupAutomaticTransmission.getAttribute("class").contains("checked")) {
//			isValid = true;
//		}
//		switchToDefaultContentFromIframe();
//		return isValid;
//	}
//
//	public boolean verifyInsuranceIsSelectedInHorizontalGroup() {
//
//		switchToIframeWithXpath(iframe);
//		if (horizontalGroupInsurance.getAttribute("class").contains("checked")) {
//			isValid = true;
//		}
//		switchToDefaultContentFromIframe();
//		return isValid;
//	}
//
//	public void selectAutomatomaticTransmissionFromVerticalGroup() {
//		switchToIframeWithXpath(iframe);
//		waitForElementToBeClickable(verticalGroupAutomaticTransmission);
//		click(verticalGroupAutomaticTransmission);
//		switchToDefaultContentFromIframe();
//
//	}
//
//	public void selectInsuranceFromVerticalGroup() {
//		switchToIframeWithXpath(iframe);
//		waitForElementToBeClickable(verticalGroupAutomaticInsurance);
//		click(verticalGroupAutomaticInsurance);
//		switchToDefaultContentFromIframe();
//
//	}
//
//	public boolean verifyAutomatomaticTransmissionIsSelectedInVerticalGroup() {
//
//		switchToIframeWithXpath(iframe);
//		if (verticalGroupAutomaticTransmission.getAttribute("class").contains("checked")) {
//			isValid = true;
//		}
//		switchToDefaultContentFromIframe();
//		return isValid;
//	}
//
//	public boolean verifyInsuranceIsSelectedInVerticalGroup() {
//
//		switchToIframeWithXpath(iframe);
//		if (verticalGroupAutomaticInsurance.getAttribute("class").contains("checked")) {
//			isValid = true;
//		}
//		switchToDefaultContentFromIframe();
//		return isValid;
//	}
//
//}
