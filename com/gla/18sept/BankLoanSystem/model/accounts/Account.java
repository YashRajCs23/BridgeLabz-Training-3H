package com.gla.BankLoanSystem.model.accounts;

import com.gla.BankLoanSystem.model.exceptions.InsufficientBalanceException;

/**
 * Abstract Account with immutable accountNumber (final).
 */
public abstract class Account {
    private final String accountNumber;
    protected double balance;
    protected String owner;

    public Account(String accountNumber, double balance, String owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public void deposit(double amount) {
        if (amount <= 0) return;
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) return;
        if (balance < amount) {
            throw new InsufficientBalanceException(
                    "Insufficient funds in account " + accountNumber + ". Required: " + amount + ", Available: " + balance);
        }
        balance -= amount;
    }

    @Override
    public String toString() {
        return String.format("%s[accNo=%s, owner=%s, balance=%.2f]",
                this.getClass().getSimpleName(), accountNumber, owner, balance);
    }
}
