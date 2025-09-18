package com.gla.BankLoanSystem.model.loan;
import com.gla.BankLoanSystem.model.customer.Customer;
public abstract class Loan implements LoanOperations {
    protected static double baseInterestRate = 8.5; // static interest policy shared across all loans

    protected final Customer customer;
    protected final RepaymentSchedule schedule;
    protected final double principal;
    protected final int tenureMonths;

    public Loan(Customer customer, double principal, int tenureMonths) {
        if (customer == null) throw new IllegalArgumentException("Customer cannot be null");
        if (principal <= 0) throw new IllegalArgumentException("Principal must be positive");
        if (tenureMonths <= 0) throw new IllegalArgumentException("Tenure must be positive");

        this.customer = customer;
        this.principal = principal;
        this.tenureMonths = tenureMonths;
        this.schedule = new RepaymentSchedule(tenureMonths);
    }

    public static void setBaseInterestRate(double rate) {
        baseInterestRate = rate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public RepaymentSchedule getRepaymentSchedule() {
        return schedule;
    }

    public double getPrincipal() {
        return principal;
    }

    public int getTenureMonths() {
        return tenureMonths;
    }

    /**
     * Advance schedule by one month (used by LoanService after successful EMI debit).
     */
    public void payOneMonth() {
        schedule.payOneMonth();
    }

    /**
     * Returns true if loan is fully repaid according to schedule.
     */
    public boolean isClosed() {
        return schedule.isComplete();
    }

    @Override
    public String toString() {
        return String.format("%s[principal=%.2f, tenure=%d, remaining=%d]",
                this.getClass().getSimpleName(), principal, tenureMonths, schedule.getMonthsRemaining());
    }
}