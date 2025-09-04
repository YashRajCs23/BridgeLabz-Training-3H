package Practice_Problems.BankAccount System;
public class BankAccountMain {
    public static void main(String[] args) {
        
        // Create two bank accounts
        BankAccount account1 = new BankAccount("Lynda Princy", "ACC12345", 1000.00);
        BankAccount account2 = new BankAccount("Prince Danish", "ACC67890", 500.00);

        // Use instanceof before displaying details
        System.out.println("\nAccount 1 Details:");
        if (account1 instanceof BankAccount) {
            account1.displayAccountDetails();
        }

        System.out.println("\nAccount 2 Details:");
        if (account2 instanceof BankAccount) {
            account2.displayAccountDetails();
        }

        // Check total accounts
        BankAccount.getTotalAccounts();

        // Deposit and withdraw operations
        System.out.println("\nPerforming transactions on Account 1:");
        account1.deposit(200);
        account1.withdraw(150);
        account1.displayAccountDetails();

        System.out.println("\nPerforming transactions on Account 2:");
        account2.displayAccountDetails();
        account2.deposit(100);
        account2.withdraw(800);
    }
}