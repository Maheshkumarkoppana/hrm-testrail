//package seleniumUI.pages;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//
//import seleniumUI.utils.seleniumHelper;
//
//public class DragAndDropPage extends seleniumHelper {
//
//	protected WebDriver driver;
//
//	protected boolean isValid;
//
//	@FindBy(how = How.XPATH, using = "//iframe[@class='demo-frame']")
//	private WebElement iframe;
//
//	@FindBy(how = How.ID, using = "draggable")
//	private WebElement dragMeToTarget;
//
//	@FindBy(how = How.ID, using = "droppable")
//	private WebElement dropMe;
//
//	public DragAndDropPage(WebDriver driver) {
//		super(driver);
//		this.driver = driver;
//	}
//
//	public boolean performDragAndDrop() {
//
//		switchToIframeWithXpath(iframe);
//
//		// Using Actions class for drag and drop.
//		Actions act = new Actions(driver);
//
//		int dragMeX = dragMeToTarget.getLocation().getX();
//
//		int dragMeY = dragMeToTarget.getLocation().getY();
//
//		int dropMeX = dropMe.getLocation().getX();
//
//		int dropMeY = dropMe.getLocation().getY();
//
//		// Dragged and dropped.
//		act.dragAndDrop(dragMeToTarget, dropMe).build().perform();
//
//		int afterDroppingDragMeX = dragMeToTarget.getLocation().getX();
//
//		int afterDroppingDragMeY = dragMeToTarget.getLocation().getY();
//
//		if (afterDroppingDragMeX > dragMeX && afterDroppingDragMeX > dropMeX && afterDroppingDragMeY > dragMeY
//				&& afterDroppingDragMeY > dropMeY) {
//			isValid = true;
//		}
//
//		return isValid;
//
//	}
//}
