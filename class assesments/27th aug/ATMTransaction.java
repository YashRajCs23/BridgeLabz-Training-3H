import java.util.Scanner;
public class ATMTransaction {
    static Scanner sc = new Scanner(System.in);
    static int balance = 0;
    public static void userInput() {
        int choice;
        do {
            System.out.println("\nWELCOME TO ATM");
            System.out.println("1. DEPOSIT");
            System.out.println("2. CHECK BALANCE");
            System.out.println("3. WITHDRAW");
            System.out.println("4. EXIT");
            System.out.print("ENTER YOUR CHOICE: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the amount you want to deposit: ");
                    int deposit = sc.nextInt();
                    depositAmount(deposit);
                    break;
                case 2:
                    System.out.println("Your Current Balance = " + checkBalance());
                    break;
                case 3:
                    System.out.print("Enter the amount you want to withdraw: ");
                    int withdraw = sc.nextInt();
                    withdrawAmount(withdraw);
                    break;
                case 4:
                    System.out.println("Thanks for using the ATM");
                    break;
                default:
                    System.out.println("Please enter a valid choice");
            }
        } while (choice != 4);
    }
    private static void depositAmount(int deposit) {
        if (deposit > 0) {
            balance += deposit;
            System.out.println("Successfully Deposited: " + deposit);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    private static void withdrawAmount(int withdraw) {
        if (withdraw > balance) {
            System.out.println("You don't have sufficient funds in your account");
        } else if (withdraw <= 0) {
            System.out.println("Invalid withdraw amount");
        } else {
            balance -= withdraw;
            System.out.println("Successfully Withdrawn: " + withdraw);
        }
    }
    private static int checkBalance() {
        return balance;
    }
    public static void main(String[] args) {
        userInput();
    }
}