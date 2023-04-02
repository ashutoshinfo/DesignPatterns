package info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.factory;

import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.bike.BajajBike;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.bike.BajajDiscoverBike;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.bike.BajajPlatinaBike;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.bike.BajajPulerBike;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.enums.ModelType;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.method.BajajBikeFectory;

public class ChennaiFactory extends BajajBikeFectory {

	@Override
	public void painting() {
		System.out.println("ChennaiFactory.painting()");
	}

	@Override
	public void assambling() {
		System.out.println("ChennaiFactory.assambling()");
	}

	@Override
	public void engineTest() {
		System.out.println("ChennaiFactory.engineTest()");
	}

	@Override
	public void roadTest() {
		System.out.println("ChennaiFactory.roadTest()");
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

	public BajajBike orderBike() {
		System.out.println("ChennaiFactory.orderBike() : gapala");
		return null;
	}

}
