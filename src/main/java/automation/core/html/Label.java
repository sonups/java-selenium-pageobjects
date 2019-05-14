package automation.core.html;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Label extends HtmlElement {
	public Label(RemoteWebDriver driver, String selector) {
		super(driver, selector);
	}

	public Label(WebElement element) {
		super(element);
	}

}
