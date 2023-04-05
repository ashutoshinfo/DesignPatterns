package info.ashutosh.design.creational.abstractFectory.poducer.battry;

import info.ashutosh.design.creational.abstractFectory.poducer.Parts;

public abstract class Battery implements Parts {

	public abstract void battry();

	// this method is not relevant to those who are Producing Battery.
	@Override
	public final void display() {
		throw new UnsupportedOperationException("display() is not supported in Battery Producer");
	}

}
