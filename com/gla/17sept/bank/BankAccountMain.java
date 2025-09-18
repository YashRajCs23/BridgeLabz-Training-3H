package com.gla.bank;
public class BankAccountMain {
    public static void main(String[] args) {
        // Create a new bank account with account number, initial balance, and PIN
        BankAccount acc = new BankAccount("1234567890", 5000.0, 1234);
        // Display initial info
        acc.displayInfo();
        // Valid deposit
        acc.deposit(2000);
        // Invalid deposit
        acc.deposit(-500);
        // Withdrawal with wrong PIN
        acc.withdraw(1000, 1111);
        // Valid withdrawal
        acc.withdraw(1500, 1234);
        // Attempt to withdraw more than balance
        acc.withdraw(6000, 1234);
        // Final balance check
        System.out.println("Final Balance: " + acc.getBalance());
    }
}