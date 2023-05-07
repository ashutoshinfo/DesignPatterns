package info.ashutosh.design.behavioural.strategyDesignPattern.strategyDP1.product;

import info.ashutosh.design.behavioural.strategyDesignPattern.strategyDP1.behaior.fly.specification.IFlyBehavior;
import info.ashutosh.design.behavioural.strategyDesignPattern.strategyDP1.behaior.quack.specification.IQuackBehavior;
import info.ashutosh.design.behavioural.strategyDesignPattern.strategyDP1.product.specification.Duck;

public class MallardDuck extends Duck {

	public MallardDuck(IFlyBehavior iIFlyBehavior, IQuackBehavior iQuackBehavior) {
		super(iIFlyBehavior, iQuackBehavior);
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
