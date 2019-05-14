package automation.pages.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import automation.core.html.HtmlElement;
import automation.core.html.Link;

public class ReportHeader extends HtmlElement {
	public ReportHeader(WebElement element) {
		super(element);
		// TODO Auto-generated constructor stub
	}

	public Link ComputerName() {
		return new Link(this.getElement()).getToggleLink("a[href='/computers']", "a[href='/computers?s=-2']");
	};

	public Link Introduced() {
		return new Link(this.getElement()).getToggleLink("a[href='/computers?s=3']", "a[href='/computers?s=-3']");
	}

	public Link Discontinued() {
		return new Link(this.getElement()).getToggleLink("a[href='/computers?s=4']", "a[href='/computers?s=-4']");
	}

	public Link Company() {
		return new Link(this.getElement()).getToggleLink("a[href='/computers?s=5']", "a[href='/computers?s=-5']");
	}

	public String getCurrentSortedUpColumn() {
		if(this.getElement().findElements(By.cssSelector(".headerSortUp")).size()>0)
			return this.getElement().findElements(By.cssSelector(".headerSortUp")).get(0).getText();
		else return "";
	}

	public String getCurrentSortedDownColumn() {
		if(this.getElement().findElements(By.cssSelector(".headerSortDown")).size()>0)
			return this.getElement().findElements(By.cssSelector(".headerSortDown")).get(0).getText();
		else return "";
	}
}
