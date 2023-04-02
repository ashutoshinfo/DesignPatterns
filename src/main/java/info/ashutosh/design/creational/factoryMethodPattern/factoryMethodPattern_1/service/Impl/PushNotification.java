package info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_1.service.Impl;

import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_1.service.Notification;

public class PushNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Sending a push notification");
	}
}
