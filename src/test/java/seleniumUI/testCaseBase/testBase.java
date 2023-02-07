package seleniumUI.testCaseBase;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.Listeners;

import io.github.bonigarcia.wdm.WebDriverManager;
import listeners.TestListener;
import seleniumUI.pages.PageProvider;

@Listeners(TestListener.class)
public class testBase {

	protected WebDriver driver;
	private static Properties prop = new Properties();
	private static String URL;
	private static String BROWSER;
	private static String USERNAME;
	private static String PASSWORD;

	public static void loadConfigProp(String propertyFileName) throws IOException {
		prop.load(ClassLoader.getSystemResource(propertyFileName).openStream());
		URL = prop.getProperty("desktop.aut.url");
		BROWSER = prop.getProperty("desktop.aut.browser");
		USERNAME = prop.getProperty("desktop.aut.username");
		PASSWORD = prop.getProperty("desktop.aut.password");
		
	}

	public void setUp(ITestContext context) throws IOException {

		loadConfigProp("config.properties");
		launchBrowser(BROWSER);
		driver.manage().window().maximize();
		context.setAttribute("driver", driver);
		launchUrl(URL);

	}

	public void launchUrl(String url) {
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public WebDriver launchBrowser(String browserName) {

		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			return driver;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			return driver;

		default:
			WebDriverManager.chromedriver().setup();
			return new ChromeDriver();
		}

	}

	protected PageProvider pages() {
		return new PageProvider(driver);
	}

}
