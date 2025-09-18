package com.gla.ecommerce;
public interface PaymentGateway {
    void pay(double amount);
    void refund(double amount);
}