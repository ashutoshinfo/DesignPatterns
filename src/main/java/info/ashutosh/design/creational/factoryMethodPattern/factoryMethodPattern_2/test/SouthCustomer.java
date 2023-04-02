package info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.test;

import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.bike.BajajBike;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.factory.NagporFactory;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.method.BajajBikeFectory;

public class SouthCustomer {
	public static void main(String[] args) {
		BajajBikeFectory nagporFactory = new NagporFactory();
		BajajBike orderBike = nagporFactory.orderBike("platina");
		orderBike.drive();

	}

}
