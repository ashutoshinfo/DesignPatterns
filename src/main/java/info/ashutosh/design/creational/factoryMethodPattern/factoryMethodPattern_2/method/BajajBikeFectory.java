package info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.method;

import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.bike.BajajBike;

// Factory Method Pattern
public abstract class BajajBikeFectory {
	public abstract void painting();

	public abstract void assambling();

	public abstract void engineTest();

	public abstract void roadTest();

	public abstract BajajBike createBike(String model);

	public BajajBike orderBike(String model) {
		BajajBike bajajBike = createBike(model);
		painting();
		assambling();
		engineTest();
		roadTest();
		return bajajBike;
	}

}