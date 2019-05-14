package automation.core;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {
	private Browser browser;
	private RemoteWebDriver driver;
	private long actionWaitTimeout = 30;

	public Page(Browser browser) {
		this.initialBrowserSetup(browser);
		this.waitForPage();
	}

	private void initialBrowserSetup(Browser browser) {
		this.browser = browser;
		this.driver = this.browser.getDriver();
	}

	protected RemoteWebDriver getDriver() {
		return this.browser.getDriver();
	}

	private void waitForPage() {
		try {
			String state = (String) this.driver.executeScript("return document.readyState;", new Object[0]);
			if (!"complete".equals(state)) {
				(new WebDriverWait(this.driver, (long) this.actionWaitTimeout)).until((driver1) -> {
					return Boolean.valueOf("complete".equals(((JavascriptExecutor) driver1)
							.executeScript("return document.readyState;", new Object[0])));
				});
			}
		} catch (WebDriverException var) {
			;
		}
	}

}
