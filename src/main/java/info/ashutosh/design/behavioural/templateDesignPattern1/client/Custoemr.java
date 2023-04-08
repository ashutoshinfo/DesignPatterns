package info.ashutosh.design.behavioural.templateDesignPattern1.client;

import info.ashutosh.design.behavioural.templateDesignPattern1.template.Sandwich;
import info.ashutosh.design.behavioural.templateDesignPattern1.template.impl.TurkeySandwich;
import info.ashutosh.design.behavioural.templateDesignPattern1.template.impl.VeggieSandwich;

public class Custoemr {
	public static void main(String[] args) {
		Sandwich turkeySandwich = new TurkeySandwich();
		turkeySandwich.makeSandwich();

		System.out.println("-----------------");

		Sandwich veggieSandwich = new VeggieSandwich();
		veggieSandwich.makeSandwich();
	}

}
