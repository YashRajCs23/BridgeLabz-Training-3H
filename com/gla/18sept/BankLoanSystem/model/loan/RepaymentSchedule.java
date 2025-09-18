package com.gla.BankLoanSystem.model.loan;
public class RepaymentSchedule {
    private int monthsRemaining;

    public RepaymentSchedule(int tenureMonths) {
        if (tenureMonths < 0) tenureMonths = 0;
        this.monthsRemaining = tenureMonths;
    }

    public int getMonthsRemaining() {
        return monthsRemaining;
    }

    public void payOneMonth() {
        if (monthsRemaining > 0) monthsRemaining--;
    }

    public boolean isComplete() {
        return monthsRemaining == 0;
    }

    @Override
    public String toString() {
        return "RepaymentSchedule[monthsRemaining=" + monthsRemaining + "]";
    }
}