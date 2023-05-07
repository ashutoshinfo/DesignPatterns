package info.ashutosh.design.behavioural.strategyDesignPattern.strategyDP1.behaior.fly;

import info.ashutosh.design.behavioural.strategyDesignPattern.strategyDP1.behaior.fly.specification.IFlyBehavior;

public class FlyWithWings implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("FlyWithWings.fly()");
	}
}
