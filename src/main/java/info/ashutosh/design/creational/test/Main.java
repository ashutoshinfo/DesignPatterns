package info.ashutosh.design.creational.test;

// Example usage in main method
public class Main {
	public static void main(String[] args) {
		// Create an instance of the event notifier
		MyEventNotifier notifier = new MyEventNotifier();

		// Create an instance of the event listener
		EventListener listener = new EventListenerImpl();

		// Register the listener with the notifier
		notifier.registerListener(listener);

		// Trigger the event by calling the doSomething method
		notifier.doSomething();
	}
}
