package info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_4.product.impl;

import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_4.product.Payment;

//Payment Processor class
//Concrete Credit Card Payment Factory class
public class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of amount " + amount);
    }
}


