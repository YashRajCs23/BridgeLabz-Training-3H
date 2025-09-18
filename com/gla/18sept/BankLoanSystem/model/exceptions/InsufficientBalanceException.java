package com.gla.BankLoanSystem.model.exceptions;
public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}