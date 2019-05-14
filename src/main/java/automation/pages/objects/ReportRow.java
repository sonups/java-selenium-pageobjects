package automation.pages.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import automation.core.html.HtmlElement;
import automation.core.html.Label;
import automation.core.html.Link;

public class ReportRow extends HtmlElement {

	public ReportRow(WebElement element) {
		super(element);
	}

	public Link ComputerName() {
		return new Link(this.getElement().findElement(By.cssSelector("a[href]")));
	}

	public Label Introduced() {
		return new Label(this.getElement().findElement(By.cssSelector("td:nth-of-type(2)")));
	}

	public Label Discontinued() {
		return new Label(this.getElement().findElement(By.cssSelector("td:nth-of-type(3)")));
	}

	public Label Company() {
		return new Label(this.getElement().findElement(By.cssSelector("td:nth-of-type(4)")));
	}

}
