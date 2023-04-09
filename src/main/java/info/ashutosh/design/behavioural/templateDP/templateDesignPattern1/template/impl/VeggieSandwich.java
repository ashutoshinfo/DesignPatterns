package info.ashutosh.design.behavioural.templateDP.templateDesignPattern1.template.impl;

import info.ashutosh.design.behavioural.templateDP.templateDesignPattern1.template.Sandwich;

public class VeggieSandwich extends Sandwich {

	@Override
	protected void addMeat() {
		// No meat for veggie sandwich
	}

	@Override
	protected void addVegetables() {
		System.out.println("Adding lettuce, tomato, and avocado");
	}

	@Override
	protected void addCondiments() {
		System.out.println("Adding hummus and hot sauce");
	}
}
