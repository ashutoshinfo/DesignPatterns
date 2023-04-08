package info.ashutosh.design.creational.factoryPattern.factoryPattern2.problem.client;

import info.ashutosh.design.creational.factoryPattern.factoryPattern2.problem.producer.impl.LuxuryCar;

public class Client2 {

	public static void main(String[] args) {

		LuxuryCar luxuryCar = new LuxuryCar();
		luxuryCar.assemble();
		luxuryCar.roadTest();
		luxuryCar.drive();
	}

}
