package Constructor.Access Modifiers.Bank Account Management;
public class BankAccountMain {
        public static void main(String[] args) {
            
        BankAccount acc1 = new BankAccount("A101", "Alice", 5000);
        acc1.displayAccountDetails();
        // Deposit & Withdraw
        acc1.deposit(2000);
        acc1.withdraw(1500);
        // Access balance via getter
        System.out.println("Balance via getter: " + acc1.getBalance());
        // Create SavingsAccount object
        SavingsAccount sa1 = new SavingsAccount("S202", "Bob", 10000, 4.5);
        sa1.displaySavingsDetails();
        // Deposit & Withdraw via SavingsAccount
        sa1.deposit(500);
        sa1.withdraw(1200);
        sa1.displaySavingsDetails();
    }
}