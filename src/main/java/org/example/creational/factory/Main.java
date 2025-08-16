package org.example.creational.factory;

public class Main {
    public static void main(String[] args) {
        Payment payment = PaymentFactory.getPayment("CREDIT_CARD");
        payment.pay();

        payment = PaymentFactory.getPayment("UPI");
        payment.pay();

        //client give payment type paypal but bts i am using UPI
        payment = PaymentFactory.getPayment("PAYPAL");
        payment.pay();
    }
}
