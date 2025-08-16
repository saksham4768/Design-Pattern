package org.example.creational.factory;

public class CreditCard  implements Payment {
    @Override
    public void pay() {
        System.out.println("Paying with Credit Card");
    }
}
