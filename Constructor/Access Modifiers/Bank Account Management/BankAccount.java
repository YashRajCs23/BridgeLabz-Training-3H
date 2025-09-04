package Constructor.Access Modifiers.Bank Account Management;
public class BankAccount {
    // Public: accessible everywhere
    public String accountNumber;
    
    // Protected: accessible within package and subclasses
    protected String accountHolder;
    // Private: only accessible inside this class
    private double balance;
    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    // Public getter for balance
    public double getBalance() {
        return balance;
    }
    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }
    // Display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber +
                           ", Account Holder: " + accountHolder +
                           ", Balance: " + balance);
    }
}
// Subclass
class SavingsAccount extends BankAccount {
    double interestRate;
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }
    // Demonstrate access to public and protected members
    public void displaySavingsDetails() {
        // accountNumber -> public (accessible)
        // accountHolder -> protected (accessible)
        // balance -> private (NOT directly accessible, must use getter)
        System.out.println("Savings Account Number: " + accountNumber +
                           ", Holder: " + accountHolder +
                           ", Balance: " + getBalance() +
                           ", Interest Rate: " + interestRate + "%");
    }
}