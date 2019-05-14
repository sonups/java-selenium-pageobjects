package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import automation.core.html.Label;
import automation.core.html.Link;
import automation.core.html.SelectMenu;
import automation.core.html.SubmitButton;
import automation.core.html.TextField;

public class AddComputerPage {
	private RemoteWebDriver driver;

	public AddComputerPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public Label HeadingLabel() {
		return new Label(this.driver.findElement(By.cssSelector("section[id='main']>h1")));
	}

	public TextField ComputerName() {
		return new TextField(this.driver.findElement(By.cssSelector("input#name")));
	}

	public TextField IntroducedDate() {
		return new TextField(this.driver.findElement(By.cssSelector("input#introduced")));
	}

	public TextField DiscontinuedDate() {
		return new TextField(this.driver.findElement(By.cssSelector("input#discontinued")));
	}

	public SelectMenu SelectComputerType() {
		return new SelectMenu(this.driver.findElement(By.cssSelector("select#company")));
	}

	public SubmitButton CreateComputer() {
		return new SubmitButton(this.driver.findElement(By.cssSelector("input.btn.primary")));
	}

	public Link Cancel() {
		return new Link(this.driver.findElement(By.cssSelector("a[href='/computers'].btn")));
	}

}
