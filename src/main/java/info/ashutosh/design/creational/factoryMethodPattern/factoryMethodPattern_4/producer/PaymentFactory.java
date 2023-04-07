package info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_4.producer;

import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_4.product.Payment;

//Payment Factory interface
public interface PaymentFactory {
	Payment createPayment();
}
