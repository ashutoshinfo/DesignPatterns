package info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_1.service.Impl;

import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_1.service.NotificationService;

public class SMSNotificationService implements NotificationService {

	@Override
	public void notifyUser()
	{
		// TODO Auto-generated method stub
		System.out.println("Sending an SMS notification");
	}
}
