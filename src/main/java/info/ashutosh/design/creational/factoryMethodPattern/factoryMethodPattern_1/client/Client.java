package info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_1.client;

import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_1.enums.NotifyType;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_1.factory.NotificationFactory;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_1.service.NotificationService;

public class Client {
	public static void main(String[] args) {
		NotificationFactory notificationFactory = new NotificationFactory();
		NotificationService notification = notificationFactory.createNotification(NotifyType.PUSH);
		notification.notifyUser();
	}
}
