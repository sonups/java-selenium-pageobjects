package automation.pages;

import automation.core.Browser;
import automation.core.Page;
import automation.pages.objects.GlobalHeader;
import automation.pages.objects.NavigationPanel;

public class MainPage extends Page {

	public MainPage(Browser browser) {
		super(browser);
	}

	public GlobalHeader GlobalHeader() {
		return new GlobalHeader(this.getDriver(), "header.topbar");

	}

	public NavigationPanel NavigationPanel() {
		return new NavigationPanel(this.getDriver(), "body");
	}

	public ViewComputersPage ViewComputers() {
		return new ViewComputersPage(getDriver());
	}

	public DeleteComputerPage DeletComputer() {
		return new DeleteComputerPage(getDriver());
	}

	public EditComputerPage EditComputer() {
		return new EditComputerPage(getDriver());
	}

	public AddComputerPage AddComputerPage() {
		return new AddComputerPage(getDriver());
	}

//	public MainPage MainPage() {
//		if (!isBrowserSessionValid()) {
//			throw new AssertionError("Browser session is invalid");
//		}
//		return new MainPage(Browser());
//	}

}
