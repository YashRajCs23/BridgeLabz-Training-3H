package com.gla.BankLoanSystem.model.loan;
public interface LoanOperations {
    void approveLoan();
    double calculateEMI();
    void closeLoan();
}