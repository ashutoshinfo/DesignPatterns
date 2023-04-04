package info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.test;

import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.bike.BajajBike;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.factory.BajajBikeFectory;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.factory.impl.NagporFactory;

public class SouthCustomer {
	public static void main(String[] args) {
		BajajBikeFectory nagporFactory = new NagporFactory();
		BajajBike orderBike = nagporFactory.orderBike("platina");
		orderBike.drive();

	}

}
