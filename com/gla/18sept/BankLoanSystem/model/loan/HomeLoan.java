package com.gla.BankLoanSystem.model.loan;
import com.gla.BankLoanSystem.model.customer.Customer;
public class HomeLoan extends Loan {
    public HomeLoan(Customer c, double p, int t) {
        super(c, p, t);
    }

    @Override
    public void approveLoan() {
        System.out.println("Home Loan approved for " + customer.getName());
    }

    @Override
    public double calculateEMI() {
        double monthlyRate = baseInterestRate / 12.0 / 100.0;
        double rPow = Math.pow(1 + monthlyRate, tenureMonths);
        return (principal * monthlyRate * rPow) / (rPow - 1);
    }

    @Override
    public void closeLoan() {
        System.out.println("Home Loan closed for " + customer.getName());
    }
}