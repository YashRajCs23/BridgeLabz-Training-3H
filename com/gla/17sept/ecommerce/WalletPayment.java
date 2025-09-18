package com.gla.ecommerce;
public class WalletPayment implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via Wallet.");
    }
    @Override
    public void refund(double amount) {
        System.out.println("Refunded ₹" + amount + " to Wallet.");
    }
}