package org.example.creational.factory;

public class UPI implements Payment {
    @Override
    public void pay() {
        System.out.println("Pay using UPI");
    }
}
