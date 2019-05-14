package automation.core.html;

import java.util.Arrays;
import java.util.MissingResourceException;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import automation.core.AutomationError;
import automation.utils.WaitHelper;

public abstract class HtmlElement {
	private WebElement element;
	private RemoteWebDriver driver;
	private String selector;
	private int actionWaitTimeout;
	private static final Logger LOGGER = Logger.getLogger("backbase-automation");

	public HtmlElement(RemoteWebDriver driver, String selector) {
		this.driver = driver;
		this.selector = selector;
		
		try {
			
			this.element = this.driver.findElement(By.cssSelector(this.selector));
		} catch (NullPointerException | NoSuchElementException var) {
			this.element = null;
		}	
	//	waitForDocumentReady();
	}

	public HtmlElement(WebElement element) {
		WaitHelper.waitInSeconds(1);
		if (element != null)
			this.element = element;
	}

	public WebElement getElement() {
		try {
			return this.element;
		} catch (Exception var) {
			LOGGER.warning("Exception caught while seeking element " + var.getMessage()
					+ Arrays.toString(var.getStackTrace()) + var);
			return null;
		}
	}

	public boolean isInDOM() {
		return this.element != null;
	}

	public String toString() {
		return this.element.toString();
	}

	public String getText() {
		return this.element.getText();
	}
	
	public void click() {
//		if(isInDOM())
		this.element.click();
		
	}

	public int getActionWaitTimeout() {
		if (this.actionWaitTimeout == 0) {
			this.getProperties();
		}

		return this.actionWaitTimeout;
	}

	private void getProperties() {
		try {
			String frameworkWait = System.getProperty("framework.wait");
			if (frameworkWait != null) {
				this.actionWaitTimeout = Integer.parseInt(frameworkWait);
			}
		} catch (MissingResourceException var) {
			this.actionWaitTimeout = 30;
			LOGGER.info("update of wait timeout from properties is invalid: " + var.getMessage()
					+ Arrays.toString(var.getStackTrace()) + var);
		}

	}

	public void SendKeys(String keys) {
		
		if (!this.isInDOM()) {
			throw new AutomationError("Element was not visible in DOM");
		} else {
			this.getElement().sendKeys(new CharSequence[] { keys });
			this.getElement().sendKeys(new CharSequence[] { Keys.TAB });
		
		}
	}


}
