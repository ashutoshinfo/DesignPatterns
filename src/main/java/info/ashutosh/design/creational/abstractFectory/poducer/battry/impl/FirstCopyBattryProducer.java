package info.ashutosh.design.creational.abstractFectory.poducer.battry.impl;

import info.ashutosh.design.creational.abstractFectory.poducer.battry.Battry;

public class FirstCopyBattryProducer implements Battry {

	@Override
	public void battry() {
		System.out.println("FirstCopyDisplayProducer.battry()");
	}

}
