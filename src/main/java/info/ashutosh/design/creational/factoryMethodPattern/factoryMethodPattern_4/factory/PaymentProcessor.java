package info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_4.factory;

import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_4.producer.PaymentFactory;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_4.product.Payment;

public class PaymentProcessor {
	private PaymentFactory paymentFactory;

	public PaymentProcessor(PaymentFactory paymentFactory) {
		this.paymentFactory = paymentFactory;
	}

	public void processPayment(double amount) {
		Payment payment = paymentFactory.createPayment();
		payment.processPayment(amount);
	}
}

