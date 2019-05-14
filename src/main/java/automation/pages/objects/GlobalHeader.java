package automation.pages.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import automation.core.html.HtmlElement;
import automation.core.html.Link;

public class GlobalHeader extends HtmlElement {

	public GlobalHeader(WebElement element) {
		super(element);
	}

	public GlobalHeader(RemoteWebDriver driver, String selector) {
		super(driver, selector);
	}

	public Link PlaySampleLink() {
		return new Link(this.getElement().findElement(By.cssSelector("a[href='/']")));
	}
}
