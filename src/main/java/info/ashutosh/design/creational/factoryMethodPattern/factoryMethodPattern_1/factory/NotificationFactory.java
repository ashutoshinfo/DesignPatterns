package info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_1.factory;

import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_1.enums.NotifyType;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_1.service.Notification;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_1.service.Impl.EmailNotification;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_1.service.Impl.PushNotification;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_1.service.Impl.SMSNotification;

public class NotificationFactory {
	public Notification createNotification(NotifyType notifyType) {
		if (notifyType == null)
			return null;
		switch (notifyType) {
		case SMS:
			return new SMSNotification();
		case EMAIL:
			return new EmailNotification();
		case PUSH:
			return new PushNotification();
		default:
			throw new IllegalArgumentException("Unknown notifyType " + notifyType);
		}
	}
}
