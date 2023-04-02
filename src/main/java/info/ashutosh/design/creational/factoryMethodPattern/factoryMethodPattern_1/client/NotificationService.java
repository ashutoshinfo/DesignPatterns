package info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_1.client;

import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_1.enums.NotifyType;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_1.factory.NotificationFactory;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_1.service.Notification;

public class NotificationService {
	public static void main(String[] args) {
		NotificationFactory notificationFactory = new NotificationFactory();
		Notification notification = notificationFactory.createNotification(NotifyType.PUSH);
		notification.notifyUser();
	}
}
