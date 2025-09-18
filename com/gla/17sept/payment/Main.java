package com.gla.payment;
public class Main extends Payment {
    public static void main(String[] args) {
        Payment p;
        p = new CreditCard();
        p.pay(1200.50);     // Output: Paid ₹1200.5 using Credit Card.
        p = new DebitCard();
        p.pay(850.00);      // Output: Paid ₹850.0 using Debit Card.
        p = new UPI();
        p.pay(299.99);      // Output: Paid ₹299.99 using UPI.
    }
}