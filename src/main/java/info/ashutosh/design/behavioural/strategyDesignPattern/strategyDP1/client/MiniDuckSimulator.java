package info.ashutosh.design.behavioural.strategyDesignPattern.strategyDP1.client;

import info.ashutosh.design.behavioural.strategyDesignPattern.strategyDP1.product.MallardDuck;
import info.ashutosh.design.behavioural.strategyDesignPattern.strategyDP1.product.specification.Duck;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
	}
}