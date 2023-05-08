package info.ashutosh.design.behavioural.strategyDesignPattern.strategyDP1.product;

import info.ashutosh.design.behavioural.strategyDesignPattern.strategyDP1.behaior.fly.FlyWithWings;
import info.ashutosh.design.behavioural.strategyDesignPattern.strategyDP1.behaior.quack.Quack;
import info.ashutosh.design.behavioural.strategyDesignPattern.strategyDP1.product.specification.Duck;

public class MallardDuck extends Duck {

	public MallardDuck() {
		iQuackBehavior = new Quack();
		iIFlyBehavior = new FlyWithWings();
	}

	@Override
	public void swim() {
		System.out.println("MallardDuck.swim()");
	}

	@Override
	public void display() {
		System.out.println("MallardDuck.display()");
	}

}
