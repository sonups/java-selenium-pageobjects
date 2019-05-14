package automation.core;

@SuppressWarnings("serial")
public class AutomationError extends AssertionError {
	public AutomationError() {
	}

	public AutomationError(Object detailMessage) {
		super(detailMessage);
	}
}
