package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import automation.core.html.Label;
import automation.core.html.Link;
import automation.core.html.SubmitButton;
import automation.core.html.TextField;
import automation.pages.objects.ComputerDataGrid;

public class ViewComputersPage {

	private RemoteWebDriver driver;
	private ComputerDataGrid computerDataGrid;
	private TextField filterField;
	private SubmitButton searchFilter;
	private Link addNewComputer;

	public ViewComputersPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

//	public Label HeadingLabel() {
//		return new Label(this.driver.findElement(By.cssSelector("section[id='main']>h1")));
//	}

	public ComputerDataGrid ComputerDataGrid() {
		if (computerDataGrid == null) {
			computerDataGrid = new ComputerDataGrid(this.driver, "table.computers.zebra-striped");
		}
		return computerDataGrid;
	}

	public TextField FilterField() {
		if (filterField == null) {
			filterField = new TextField(this.driver, "input#searchbox");
		}
		return filterField;
	}
	
	
	public Label AlertMessage() {
		return new Label(this.driver.findElement(By.cssSelector("div.alert-message.warning")));
	}

	public Label HeadingLabel() {
		return new Label(this.driver.findElement(By.cssSelector("section[id='main']>h1")));
	}
	
	public SubmitButton SearchSubmitButton() {
		if (searchFilter == null) {
			searchFilter = new SubmitButton(this.driver, "input#searchsubmit");
		}
		return searchFilter;
	}

	public Link AddNewComputer() {
		if (addNewComputer == null) {
			addNewComputer = new Link(this.driver, "a#add");
		}
		return addNewComputer;
	}

}
