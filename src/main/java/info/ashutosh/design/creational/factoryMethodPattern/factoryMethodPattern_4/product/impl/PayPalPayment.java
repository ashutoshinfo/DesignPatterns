package info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_4.product.impl;

import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_4.product.Payment;

//Concrete PayPal Payment class
public class PayPalPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of amount " + amount);
    }
}


