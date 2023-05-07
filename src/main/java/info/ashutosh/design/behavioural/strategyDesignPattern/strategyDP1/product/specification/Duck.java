package info.ashutosh.design.behavioural.strategyDesignPattern.strategyDP1.product.specification;

import info.ashutosh.design.behavioural.strategyDesignPattern.strategyDP1.behaior.fly.specification.IFlyBehavior;
import info.ashutosh.design.behavioural.strategyDesignPattern.strategyDP1.behaior.quack.specification.IQuackBehavior;

public abstract class Duck {
	IFlyBehavior iIFlyBehavior;
	IQuackBehavior iQuackBehavior;

	public Duck(IFlyBehavior iIFlyBehavior, IQuackBehavior iQuackBehavior) {
		this.iIFlyBehavior = iIFlyBehavior;
		this.iQuackBehavior = iQuackBehavior;
	}

	public Duck() {
		// TODO Auto-generated constructor stub
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
