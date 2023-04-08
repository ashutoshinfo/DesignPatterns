package info.ashutosh.design.creational.factoryPattern.factoryPattern2.problem.client;

import info.ashutosh.design.creational.factoryPattern.factoryPattern2.problem.producer.impl.BudgetCar;

public class Client3 {

	public static void main(String[] args) {

		BudgetCar budgetCar = new BudgetCar();
		budgetCar.assemble();
		budgetCar.roadTest();
		budgetCar.drive();
	}

}
