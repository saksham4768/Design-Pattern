package org.example.creational.factory;

public class PayPal implements Payment{
    @Override
    public void pay() {
        System.out.println("payment via PayPal");
    }
}
