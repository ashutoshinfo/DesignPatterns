package info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.factory.impl;

import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.bike.BajajBike;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.bike.BajajDiscoverBike;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.bike.BajajPlatinaBike;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.bike.BajajPulerBike;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.factory.BajajBikeFectory;

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

	public BajajBike orderBike() {
		System.out.println("ChennaiFactory.orderBike() : gapala");
		return null;
	}

}
