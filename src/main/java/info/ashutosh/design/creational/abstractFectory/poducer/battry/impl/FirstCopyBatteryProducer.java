package info.ashutosh.design.creational.abstractFectory.poducer.battry.impl;

import info.ashutosh.design.creational.abstractFectory.poducer.battry.Battery;

public class FirstCopyBatteryProducer extends Battery {

	@Override
	public void battry() {
		System.out.println("FirstCopyDisplayProducer.battry()");
	}

}
