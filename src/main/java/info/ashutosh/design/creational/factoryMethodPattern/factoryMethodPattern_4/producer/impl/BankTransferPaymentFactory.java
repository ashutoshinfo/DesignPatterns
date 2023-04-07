package info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_4.producer.impl;

import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_4.producer.PaymentFactory;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_4.product.Payment;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_4.product.impl.BankTransferPayment;
//Payment Processor class
//Concrete Bank Transfer Payment Factory class
public class BankTransferPaymentFactory implements PaymentFactory {
	@Override
	public Payment createPayment() {
		return new BankTransferPayment();
	}
}


