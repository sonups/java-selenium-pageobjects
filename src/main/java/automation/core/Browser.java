package automation.core;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Logger;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import automation.utils.PathUtils;

public class Browser {

	private RemoteWebDriver driver;
	private Properties property;
	private boolean initializeState = true;
	private static final Logger LOGGER = Logger.getLogger("backbase-automation");

	public Browser() {
		if (initializeState == true) {
			getProperties();
			inititalizeBrowser(this.property.getProperty("browserName"));
			initializeState = false;
		}
	}

	public void tearDown() {
		this.driver.close();
		this.driver.quit();

	}

	private void getProperties() {
		if (this.property == null) {
			this.property = new Properties();
			File propertyFile = new File(
					PathUtils.getBasePath() + File.separator + "resources" + File.separator + "config.property");
			try {
				property.load(new FileInputStream(propertyFile));
			} catch (Exception e) {
			}
		}
	}

	public void inititalizeBrowser(String browserName) {
		switch (browserName) {
		case "chrome":
			setUpChromeDriver();
			break;
		case "firefox":
			setUpFirefoxDriver();
			break;
		case "chrome-headless":
			setUpChromeHeadless();
			break;
		default:
			break;
		}

		getUrl(property.getProperty("baseUrl"));
	}

	public void getUrl(String url) {
		this.driver.get(url);
	}

	public void get(String url) {
		this.driver.get(url);
	}

	private void setUpChromeDriver() {
		String chromeDriverName = property.getProperty("chromeDriverName");
		try {
			File file = new File(PathUtils.getBasePath() + File.separator + "lib" + File.separator + chromeDriverName);
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		} catch (Exception var) {
			LOGGER.info(var.getMessage() + Arrays.toString(var.getStackTrace()) + var);
			// throw new AutomationError("failure getting file of Chrome driver looking
			// for:" + PathUtils.getBasePath()) + File.separator + "lib" + File.separator +
			// chromeDriverName));
		}
		this.driver = new ChromeDriver();
	}

	private void setUpChromeHeadless() {

	}

	private void setUpFirefoxDriver() {

	}

	protected RemoteWebDriver getDriver() {
		return this.driver;
	}

}
