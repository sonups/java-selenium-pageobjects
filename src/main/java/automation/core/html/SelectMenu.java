package automation.core.html;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMenu extends HtmlElement {
	public SelectMenu(RemoteWebDriver driver, String selector) {
		super(driver, selector);
	}

	public SelectMenu(WebElement element) {
		super(element);
	}

	public void selectItemByIndex(int index) {
		WebElement selectElement = this.getElement();
		Select item = new Select(selectElement);
		item.selectByIndex(index);
	}

	public void selectItemByText(String text) {
		WebElement selectElement = this.getElement();
		Select item = new Select(selectElement);
		item.selectByVisibleText(text);
	}
	
}
