package info.ashutosh.design.creational.test;

// Define a class that listens for events and responds accordingly
class EventListenerImpl implements EventListener {
	public void onEventOccurred() {
		System.out.println("Event occurred!");
	}
}