package info.ashutosh.design.behavioural.strategyDesignPattern.strategyDP1.behaior.quack;

import info.ashutosh.design.behavioural.strategyDesignPattern.strategyDP1.behaior.quack.specification.IQuackBehavior;

public class Squeak implements IQuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak.quack()");
	}
}
