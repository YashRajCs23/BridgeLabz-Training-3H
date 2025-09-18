package com.gla.BankLoanSystem.service;
import com.gla.BankLoanSystem.model.accounts.Account;
import com.gla.BankLoanSystem.model.exceptions.InsufficientBalanceException;
import com.gla.BankLoanSystem.model.loan.Loan;
public class LoanService {
    public static boolean autoDebitEMI(Loan loan) {
        double emi = loan.calculateEMI();
        boolean paid = false;

        for (Account acc : loan.getCustomer().getAccounts()) {
            try {
                acc.withdraw(emi);
                loan.payOneMonth();
                System.out.printf("EMI %.2f debited from %s (owner %s). Remaining months: %d%n",
                        emi, acc.getAccountNumber(), acc.getOwner(), loan.getRepaymentSchedule().getMonthsRemaining());
                paid = true;
                break;
            } catch (InsufficientBalanceException e) {
                System.err.printf("Insufficient in %s: %s%n", acc.getAccountNumber(), e.getMessage());
            } catch (Exception ex) {
                System.err.printf("Failed to debit %s: %s%n", acc.getAccountNumber(), ex.getMessage());
            }
        }
        if (!paid) {
            System.err.println("Auto-debit failed: insufficient balance in all accounts for customer " +
                    loan.getCustomer().getName());
        }
        if (loan.isClosed()) {
            loan.closeLoan();
        }
        return paid;
    }
}