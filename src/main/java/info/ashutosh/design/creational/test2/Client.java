package info.ashutosh.design.creational.test2;

public class Client {
	public static void main(String[] args) {
		Button button = new Button();
		ClickListener listener1 = new ClickListener(button);
		ClickListener listener2 = new ClickListener(button);
		ClickListener listener3 = new ClickListener(button);

		button.click();
		
		
	}
}
