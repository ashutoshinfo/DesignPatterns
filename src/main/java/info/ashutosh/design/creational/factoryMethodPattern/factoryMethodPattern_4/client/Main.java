package info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_4.client;

import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_4.factory.PaymentProcessor;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_4.producer.impl.PayPalPaymentFactory;

//Example usage
public class Main {
	public static void main(String[] args) {
		PaymentProcessor paymentProcessor = new PaymentProcessor(new PayPalPaymentFactory());
		paymentProcessor.processPayment(100.0);
	}
}
