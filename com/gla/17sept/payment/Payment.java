package com.gla.payment;
public class Payment {
    void pay(double amount) {
        System.out.println("Generic payment of ₹" + amount);
    }
    class CreditCard extends Payment {
        @Override
        void pay(double amount) {
            System.out.println("Paid ₹" + amount + " using Credit Card.");
        }
    }
    class DebitCard extends Payment {
        @Override
        void pay(double amount) {
            System.out.println("Paid ₹" + amount + " using Debit Card.");
        }
    }
    class UPI extends Payment {
        @Override
        void pay(double amount) {
            System.out.println("Paid ₹" + amount + " using UPI.");
        }
    }
}