package info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_1.service.Impl;

import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_1.service.Notification;

public class EmailNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Sending an e-mail notification");
		Integer.valueOf(0);
	}
}
