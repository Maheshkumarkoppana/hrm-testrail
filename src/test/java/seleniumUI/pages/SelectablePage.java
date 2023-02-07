//package seleniumUI.pages;
//
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//
//import seleniumUI.utils.seleniumHelper;
//
//public class SelectablePage extends seleniumHelper {
//
//	protected WebDriver driver;
//
//	protected boolean isValid;
//
//	@FindBy(how = How.XPATH, using = "//iframe[@class='demo-frame']")
//	private WebElement iframe;
//
//	@FindBy(how = How.ID, using = "selectable")
//	private WebElement selectableOptions;
//
//	String selectOption = "//ol[@id='selectable']//li[contains(text(),'%s')]";
//
//	String selectedOption = "//ol[@id='selectable']//li[contains(@class,'ui-selected') and contains(text(),'%s')]";
//
//	public SelectablePage(WebDriver driver) {
//		super(driver);
//		this.driver = driver;
//	}
//
//	public void selectOptions(String... selections) {
//
//		switchToIframeWithXpath(iframe);
//
//		Actions actions = new Actions(driver);
//		actions.keyDown(Keys.LEFT_CONTROL);
//
//		for (String selection : selections) {
//
//			String option = String.format(selectOption, selection);
//			actions.click(findElementWithXPath(option));
//
//		}
//
//		actions.keyUp(Keys.LEFT_CONTROL).build().perform();
//
//	}
//
//	public void assertSelectedOptions(String... selections) {
//
//		for (String selection : selections) {
//
//			String option = String.format(selectedOption, selection);
//			waitforElementbePresent(findElementWithXPath(option));
//
//		}
//	}
//}
