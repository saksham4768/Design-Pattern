package org.example.creational.factory;

public class PaymentFactory {
    public static Payment getPayment(String paymentType) {
        if(paymentType == null)  return  null;
        if(paymentType.equalsIgnoreCase("CREDIT_CARD")) return new CreditCard();
        if(paymentType.equalsIgnoreCase("UPI")) return new UPI();
        if(paymentType.equalsIgnoreCase("PAYPAL")) return new UPI();
        return null;
    }
}
