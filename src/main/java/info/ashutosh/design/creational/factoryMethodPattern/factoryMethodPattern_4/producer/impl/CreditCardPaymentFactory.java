package info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_4.producer.impl;

import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_4.producer.PaymentFactory;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_4.product.Payment;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_4.product.impl.CreditCardPayment;
//Payment Processor class
//Concrete Credit Card Payment Factory class
public class CreditCardPaymentFactory implements PaymentFactory {
	@Override
	public Payment createPayment() {
		return new CreditCardPayment();
	}
}
