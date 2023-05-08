package info.ashutosh.design.behavioural.templateDP.templateDesignPattern1.template.impl;

import info.ashutosh.design.behavioural.templateDP.templateDesignPattern1.template.Sandwich;

public class TurkeySandwich extends Sandwich {

	@Override
	protected void addPaneer() {
		System.out.println("Adding turkey");
	}

	@Override
	protected void addVegetables() {
		System.out.println("Adding lettuce and tomato");
	}

	@Override
	protected void addCondiments() {
		System.out.println("Adding mayonnaise and mustard");
	}
}
