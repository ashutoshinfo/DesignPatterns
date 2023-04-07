package info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_4.producer.impl;

import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_4.producer.PaymentFactory;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_4.product.Payment;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_4.product.impl.PayPalPayment;
//Payment Processor class
//Concrete Credit Card Payment Factory class
public class PayPalPaymentFactory implements PaymentFactory {
	@Override
	public Payment createPayment() {
		return new PayPalPayment();
	}
}


