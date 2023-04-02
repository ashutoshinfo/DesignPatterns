package info.ashutosh.design.creational.test2;

import java.util.ArrayList;
import java.util.List;

public class Button implements Subject {
	private List<Observer> observers = new ArrayList<>();
	private boolean isClicked = false;

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

	public void click() {
		isClicked = true;
		notifyObservers();
	}

	public boolean isClicked() {
		return isClicked;
	}
}

// Concrete Observer class
