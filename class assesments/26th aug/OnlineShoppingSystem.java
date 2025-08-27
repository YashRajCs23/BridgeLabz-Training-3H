import java.util.Scanner;
public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean moreCustomers = true;
        // Handle multiple customers
        while (moreCustomers) {
            long totalAmount = 0;
            int n;
            System.out.println("\nWelcome to Online Shopping System!");
            // Ensure n >= 1 (customer must buy at least one product)
            while (true) {
                System.out.print("Enter number of items you want to buy (min 1): ");
                if (sc.hasNextInt()) {
                    n = sc.nextInt();
                    if (n >= 1) break;
                    else System.out.println("Please enter at least 1.");
                } else {
                    System.out.println("Invalid input! Please enter a number.");
                    sc.next();
                }
            }
            int itemsAdded = 0;
            // Ensure exactly n valid items using do-while
            do {
                System.out.println("\nProduct Menu:");
                System.out.println("1. Laptop - Rs. 40000");
                System.out.println("2. Phone - Rs. 20000");
                System.out.println("3. Headphones - Rs. 2000");
                System.out.println("4. Watch - Rs. 3000");
                System.out.print("Enter your choice: ");
                if (sc.hasNextInt()) {
                    int choice = sc.nextInt();
                    boolean validChoice = true;
                    // Switch-case for product selection
                    switch (choice) {
                        case 1: totalAmount += 40000; break;
                        case 2: totalAmount += 20000; break;
                        case 3: totalAmount += 2000; break;
                        case 4: totalAmount += 3000; break;
                        default:
                            System.out.println("Invalid choice! Please select again.");
                            validChoice = false;
                    }
                    if (validChoice) {
                        itemsAdded++;
                    }
                } else {
                    System.out.println("Invalid input! Enter a number (1-4).");
                    sc.next();
                }
            } while (itemsAdded < n);
            // Apply discount rule
            if (totalAmount >= 5000) {
                System.out.println("You got a 10% discount!");
                totalAmount = totalAmount - (totalAmount * 10 / 100);
            }
            System.out.println("Final Amount to Pay: Rs. " + totalAmount);
            // Ask for next customer
            System.out.print("\nNext customer? (yes/no): ");
            String next = sc.next().trim().toLowerCase();
            if (next.startsWith("n")) {
                moreCustomers = false;
            }
        }
        System.out.println("\nThank you for shopping with us!");
    }
}