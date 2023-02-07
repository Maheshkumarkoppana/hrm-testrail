package seleniumUI.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageProvider {

	private final WebDriver driver;

	public PageProvider(WebDriver driver) {
		this.driver = driver;
	}

	public MyProfilePage getMyProfilepage() {
		return PageFactory.initElements(driver, MyProfilePage.class);
	}
	
	public LoginPage getLoginpage() {
		return PageFactory.initElements(driver, LoginPage.class);
	}

//	public SelectablePage getSelectablePage() {
//		return PageFactory.initElements(driver, SelectablePage.class);
//	}
//
//	public DragAndDropPage getDragAndDropPage() {
//
//		return PageFactory.initElements(driver, DragAndDropPage.class);
//	}
//
//	public ControlGroupPage getControlGroupPage() {
//		return PageFactory.initElements(driver, ControlGroupPage.class);
//	}

}
