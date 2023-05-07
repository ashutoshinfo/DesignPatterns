package info.ashutosh.design.behavioural.strategyDesignPattern.strategyDP1.behaior.quack;

import info.ashutosh.design.behavioural.strategyDesignPattern.strategyDP1.behaior.quack.specification.IQuackBehavior;

public class Quack implements IQuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack.quack()");

	}

}
