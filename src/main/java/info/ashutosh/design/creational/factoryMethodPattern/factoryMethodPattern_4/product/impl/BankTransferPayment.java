package info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_4.product.impl;

import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_4.product.Payment;

//Concrete Bank Transfer Payment class
public class BankTransferPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing bank transfer payment of amount " + amount);
    }
}


