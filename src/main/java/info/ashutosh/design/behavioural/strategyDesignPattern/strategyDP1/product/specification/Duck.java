package info.ashutosh.design.behavioural.strategyDesignPattern.strategyDP1.product.specification;

import info.ashutosh.design.behavioural.strategyDesignPattern.strategyDP1.behaior.fly.specification.IFlyBehavior;
import info.ashutosh.design.behavioural.strategyDesignPattern.strategyDP1.behaior.quack.specification.IQuackBehavior;

public abstract class Duck {

	protected IFlyBehavior iIFlyBehavior;
	protected IQuackBehavior iQuackBehavior;

	public Duck() {
		System.out.println("Duck.Duck()");
	}

	public void performQuack() {
		iQuackBehavior.quack();
	}

	public void performFly() {
		iIFlyBehavior.fly();
	}

	public abstract void swim();

	public abstract void display();

}
