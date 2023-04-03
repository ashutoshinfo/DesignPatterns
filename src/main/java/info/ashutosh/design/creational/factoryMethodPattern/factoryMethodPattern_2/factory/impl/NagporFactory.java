package info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.factory.impl;

import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.bike.BajajBike;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.bike.impl.BajajDiscoverBike;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.bike.impl.BajajPlatinaBike;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.bike.impl.BajajPulerBike;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.enums.ModelType;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.factory.BajajBikeFectory;

public class NagporFactory extends BajajBikeFectory {

	@Override
	public void painting() {
		System.out.println("NagporFactory.painting()");
	}

	@Override
	public void assambling() {
		System.out.println("NagporFactory.assambling()");

	}

	@Override
	public void engineTest() {
		System.out.println("NagporFactory.engineTest()");

	}

	@Override
	public void roadTest() {
		System.out.println("NagporFactory.roadTest()");

	}

	@Override
	public BajajBike createBike(ModelType modelType) {

		if (modelType == null)
			return null;
		switch (modelType) {
		case PULSER:
			return new BajajPulerBike();
		case DISCOVER:
			return new BajajDiscoverBike();
		case PLATINA:
			return new BajajPlatinaBike();
		default:
			throw new IllegalArgumentException("Unknown Model Type " + modelType);
		}

	}

}
