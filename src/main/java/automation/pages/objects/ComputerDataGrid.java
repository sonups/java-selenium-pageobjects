package automation.pages.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import automation.core.html.HtmlElement;

public class ComputerDataGrid extends HtmlElement {

	public ComputerDataGrid(RemoteWebDriver driver, String selector) {
		super(driver, selector);

	}

	public ReportHeader Header() {
		return new ReportHeader(this.getElement().findElement(By.cssSelector("thead")));
	}

	public ReportRow getReportRow(int index) {
		return new ReportRow(
				this.getElement().findElement(By.cssSelector("tbody>tr:nth-of-type(" + (index + 1) + ")")));
	}

}
