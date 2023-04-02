package info.ashutosh.design.creational.test2;

public class ClickListener implements Observer {
	private Button button;

	public ClickListener(Button button) {
		this.button = button;
		button.addObserver(this);
	}

	@Override
	public void update() {
		if (button.isClicked()) {
			System.out.println("Button was clicked!");
		}
	}
}

// Client code
