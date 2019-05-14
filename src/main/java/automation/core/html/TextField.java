package automation.core.html;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TextField extends HtmlElement {
	public TextField(RemoteWebDriver driver, String selector) {
		super(driver, selector);
	}

	public TextField(WebElement element) {
		super(element);
	}

}
