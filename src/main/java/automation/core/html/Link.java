package automation.core.html;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Link extends HtmlElement {
	public Link(RemoteWebDriver driver, String selector) {
		super(driver, selector);
	}

	public Link(WebElement element) {
		super(element);
	}

	public boolean isLinkDisabled() {
		if (this.getElement().getAttribute("class").contains("disabled")) {
			return true;
		}
		return false;
	}

	public void clickInnerLink() {
		this.getElement().findElement(By.cssSelector("a")).click();
	}

	public Link getToggleLink(String firstSelector, String secondSelector) {
		WebElement returnElement = null, firstElement = null, secondElement = null;
		if (this.getElement() != null) {
			try {
				firstElement = this.getElement().findElement(By.cssSelector(firstSelector));

			} catch (Exception e) {

			} finally {
				if (firstElement != null)
					returnElement = firstElement;
			}

			try {

				secondElement = this.getElement().findElement(By.cssSelector(secondSelector));
			} catch (Exception e) {

			} finally {

				if (secondElement != null)
					returnElement = secondElement;
			}

		}
		return new Link(returnElement);
	}
}
