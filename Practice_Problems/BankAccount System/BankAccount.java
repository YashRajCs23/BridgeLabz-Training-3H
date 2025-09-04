package Practice_Problems.BankAccountSystem;
public class BankAccount {
    // Static final variable (constant) shared across all accounts
    private static final String bankName = "State Bank of India";
    private static int totalAccounts = 0;

    // Final variable to ensure account number cannot be changed once assigned
    private final String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor using 'this' to avoid ambiguity
    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;  // Final variable assigned only once
        this.balance = balance;
        totalAccounts++;   // Increment total accounts with each new account
    }

    // Static method to get the total number of accounts
    public static void getTotalAccounts() {
        System.out.println("Total number of accounts: " + totalAccounts);
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    // Getters and setters
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("New Balance: $" + balance);
        } else {
            System.err.println("Insufficient balance or invalid amount.");
        }
    }
}
