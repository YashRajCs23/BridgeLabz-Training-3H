package com.gla.BankLoanSystem;
import com.gla.BankLoanSystem.model.accounts.CurrentAccount;
import com.gla.BankLoanSystem.model.accounts.SavingsAccount;
import com.gla.BankLoanSystem.model.customer.Customer;
import com.gla.BankLoanSystem.model.loan.HomeLoan;
import com.gla.BankLoanSystem.model.loan.Loan;
import com.gla.BankLoanSystem.service.LoanService;
public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Seema Srivastava", "C1001");
        c1.addAccount(new SavingsAccount("SAV123", 5000.00, "Seema Srivastava"));
        c1.addAccount(new CurrentAccount("CUR456", 3000.00, "Seema Srivastava"));
        Loan homeLoan = new HomeLoan(c1, 200000.00, 12);
        homeLoan.approveLoan();
        System.out.println("Calculated EMI: " + String.format("%.2f", homeLoan.calculateEMI()));
        for (int month = 1; month <= homeLoan.getTenureMonths(); month++) {
            System.out.println("\n--- Month " + month + " ---");
            boolean success = LoanService.autoDebitEMI(homeLoan);
            if (!success) {
                System.out.println("Auto-debit failed this month. Take further action (notify customer, retry, etc.)");
            }
            if (homeLoan.isClosed()) {
                System.out.println("Loan fully repaid on month " + month);
                break;
            }
        }
    }
}