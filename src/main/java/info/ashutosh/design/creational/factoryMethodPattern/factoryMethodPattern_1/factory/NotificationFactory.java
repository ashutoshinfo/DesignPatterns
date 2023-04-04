package info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_1.factory;

import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_1.enums.NotifyType;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_1.service.NotificationService;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_1.service.Impl.EmailNotificationService;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_1.service.Impl.PushNotificationService;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_1.service.Impl.SMSNotificationService;

public class NotificationFactory {
	public NotificationService createNotification(NotifyType notifyType) {
		if (notifyType == null)
			return null;
		switch (notifyType) {
		case SMS:
			return new SMSNotificationService();
		case EMAIL:
			return new EmailNotificationService();
		case PUSH:
			return new PushNotificationService();
		default:
			throw new IllegalArgumentException("Unknown notifyType " + notifyType);
		}
	}
}
