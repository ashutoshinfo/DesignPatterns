package info.ashutosh.design.creational.factoryPattern.problem.client;

import info.ashutosh.design.creational.factoryPattern.problem.producer.impl.LuxuryCar;

public class Client2 {

	public static void main(String[] args) {

		LuxuryCar luxuryCar = new LuxuryCar();
		luxuryCar.assemble();
		luxuryCar.roadTest();
		luxuryCar.drive();
	}

}
