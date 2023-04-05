package info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.factory.impl;

import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.bike.BajajBike;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.bike.BajajDiscoverBike;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.bike.BajajPlatinaBike;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.bike.BajajPulerBike;
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
	public BajajBike createBike(String model) {
		BajajBike bajajBike = null;

		if (model.equalsIgnoreCase("pulser")) {
			bajajBike = new BajajPulerBike();
		} else if (model.equalsIgnoreCase("discover")) {
			bajajBike = new BajajDiscoverBike();
		} else if (model.equalsIgnoreCase("platina")) {
			bajajBike = new BajajPlatinaBike();
		} else {
			throw new IllegalArgumentException("Invaliv Bike Name !");
		}

		return bajajBike;
	}

}
