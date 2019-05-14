package automation.pages.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import automation.core.html.HtmlElement;
import automation.core.html.Label;
import automation.core.html.Link;

public class NavigationPanel extends HtmlElement {

	public NavigationPanel(WebElement element) {
		super(element);
	}

	public NavigationPanel(RemoteWebDriver driver, String selector) {
		super(driver, selector);
	}

	public Link Previous() {
		return new Link(this.getElement().findElement(By.cssSelector("li.prev")));
	}
	
	public Link Next() {
		return new Link(this.getElement().findElement(By.cssSelector("li.next")));
	}
	
	public Label DisplayLabel() {
		return new Label(this.getElement().findElement(By.cssSelector("li.current>a")));
	}
}
