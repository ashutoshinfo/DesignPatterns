package info.ashutosh.design.behavioural.templateDesignPattern.client;

import info.ashutosh.design.behavioural.templateDesignPattern.template.Sandwich;
import info.ashutosh.design.behavioural.templateDesignPattern.template.impl.TurkeySandwich;
import info.ashutosh.design.behavioural.templateDesignPattern.template.impl.VeggieSandwich;

public class Custoemr {
	public static void main(String[] args) {
		Sandwich turkeySandwich = new TurkeySandwich();
		turkeySandwich.makeSandwich();

		Sandwich veggieSandwich = new VeggieSandwich();
		veggieSandwich.makeSandwich();
	}

}
