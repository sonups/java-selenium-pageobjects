package automation.core;

import org.junit.After;

import automation.pages.MainPage;

public class AutomationContextContainer {

	private Browser browser;
	private MainPage mainPage;

	public MainPage getMainPage() {
		return this.mainPage;
	}

	public AutomationContextContainer() {
		if (this.browser == null)
			this.browser = new Browser();
		if (this.mainPage == null) {
			this.mainPage = new MainPage(this.browser);
		}
	}

	@After
	public void tearDown() {
		this.browser.tearDown();
	}

}
