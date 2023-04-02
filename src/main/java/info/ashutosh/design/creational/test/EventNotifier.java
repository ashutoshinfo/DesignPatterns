package info.ashutosh.design.creational.test;

// Define a class that triggers events and notifies listeners
class MyEventNotifier {
	private EventListener listener;

	public void registerListener(EventListener listener) {
		this.listener = listener;
	}

	public void doSomething() {
		// Perform some action that triggers an event
		System.out.println("Something happened!");

		// Notify the listener that the event occurred
		if (listener != null) {
			listener.onEventOccurred();
		}
	}
}
