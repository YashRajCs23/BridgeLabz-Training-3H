import java.util.Scanner;
public class FitnessCenter {
    static Scanner sc = new Scanner(System.in);
    static int totalMembers = 0;
    static double totalFees = 0;
    public static void main(String[] args) {
        System.out.println("=== Welcome to Fitness Center Membership System ===");
        boolean keepRunning = true;
        do {
            System.out.print("\nEnter number of members to register: ");
            int n = sc.nextInt();
            registerMembers(n);
            showSummary();
            System.out.print("\nDo you want to register more members? (y/n): ");
            char more = sc.next().charAt(0);
            if (more == 'n' || more == 'N') {
                keepRunning = false;
            }
        } while (keepRunning);
        showFinalSummary();
        sc.close();
    }
    public static void registerMembers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("\nRegistering Member " + i);
            double fee = selectMembership();
            fee = applyDiscount(fee);
            totalMembers++;
            totalFees += fee;
        }
    }
    public static double selectMembership() {
        System.out.println("Select Membership Type:");
        System.out.println("1. Monthly (₹1000)");
        System.out.println("2. Quarterly (₹2500)");
        System.out.println("3. Yearly (₹9000)");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        double fee;
        switch (choice) {
            case 1: fee = 1000; break;
            case 2: fee = 2500; break;
            case 3: fee = 9000; break;
            default:
                System.out.println("Invalid choice! Defaulting to Monthly.");
                fee = 1000;
        }
        return fee;
    }
    public static double applyDiscount(double fee) {
        System.out.print("Are you a Student (s) or Senior Citizen (c)? (y/n): ");
        char discountChoice = sc.next().charAt(0);
        if (discountChoice == 'y' || discountChoice == 'Y') {
            fee *= 0.8; 
            System.out.println("Discount applied! Final Fee: ₹" + fee);
        } else {
            System.out.println("No discount. Final Fee: ₹" + fee);
        }
        return fee;
    }
    public static void showSummary() {
        System.out.println("\nCurrent Registration Summary:");
        System.out.println("Total Members Registered: " + totalMembers);
        System.out.println("Total Fees Collected: ₹" + totalFees);
    }
    public static void showFinalSummary() {
        System.out.println("\n=== Center Closed ===");
        System.out.println("Final Members Registered: " + totalMembers);
        System.out.println("Final Fees Collected: ₹" + totalFees);
    }
}