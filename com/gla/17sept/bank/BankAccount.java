package com.gla.bank;
public class BankAccount {
    private String accountNumber;
    private double balance;
    private final int pin;
    public BankAccount(String accountNumber, double initialBalance, int pin) {
        this.accountNumber = accountNumber;
        if (initialBalance < 0) {
            System.out.println("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
        this.pin = pin;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited: " + amount + ". New Balance: " + balance);
    }
    public void withdraw(double amount, int enteredPin) {
        if (enteredPin != pin) {
            System.out.println("Incorrect PIN. Withdrawal denied.");
            return;
        }
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return;
        }
        balance -= amount;
        System.out.println("Withdrew: " + amount + ". New Balance: " + balance);
    }
    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}