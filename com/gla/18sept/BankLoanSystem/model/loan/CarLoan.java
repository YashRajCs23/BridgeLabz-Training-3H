package com.gla.BankLoanSystem.model.loan;
import com.gla.BankLoanSystem.model.customer.Customer;
public class CarLoan extends Loan {
    public CarLoan(Customer c, double p, int t) {
        super(c, p, t);
    }

    @Override
    public void approveLoan() {
        System.out.println("Car Loan approved for " + customer.getName());
    }

    @Override
    public double calculateEMI() {
        double annual = baseInterestRate + 1.0;
        double monthlyRate = annual / 12.0 / 100.0;
        double rPow = Math.pow(1 + monthlyRate, tenureMonths);
        return (principal * monthlyRate * rPow) / (rPow - 1);
    }

    @Override
    public void closeLoan() {
        System.out.println("Car Loan closed for " + customer.getName());
    }
}