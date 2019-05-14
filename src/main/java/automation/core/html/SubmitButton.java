package automation.core.html;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SubmitButton extends HtmlElement {
	public SubmitButton(RemoteWebDriver driver, String selector) {
		super(driver, selector);
	}

	public SubmitButton(WebElement element) {
		super(element);
	}

}
