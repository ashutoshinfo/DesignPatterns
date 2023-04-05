package info.ashutosh.design.creational.abstractFectory.poducer.display;

import info.ashutosh.design.creational.abstractFectory.poducer.Parts;

public abstract class Display implements Parts {

	public abstract void display();

	// this method is not relevant to those who are Producing Displays.
	@Override
	public final void battry() {
		throw new UnsupportedOperationException("battry() is not supported in Display Producer");
	}
}
