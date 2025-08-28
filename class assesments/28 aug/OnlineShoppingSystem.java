import java.util.Scanner;
public class OnlineShoppingSystem{
    static String[] productNames = {"Laptop", "Phone", "Headphones", "Watch"};
    static int[] productPrices = {40000, 20000, 2000, 3000};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean moreCustomers = true;
        while (moreCustomers) {
            System.out.println("\nWelcome to Online Shopping Cart System!");
            boolean keepShopping = true;
            int[] cart = new int[productNames.length];
            long totalAmount = 0;
            while (keepShopping) {
                showProductList();
                int itemCount = getItemCount(sc);
                totalAmount += processOrder(sc, itemCount, cart);
                System.out.print("\nDo you want to continue shopping? (yes/no): ");
                String ans = sc.next();
                if (ans.equalsIgnoreCase("no")) {
                    keepShopping = false;
                }
            }
            printReceipt(cart, totalAmount);
            System.out.print("\nNext customer? (yes/no): ");
            String response = sc.next();
            if (response.equalsIgnoreCase("no")) {
                moreCustomers = false;
                System.out.println("Thank you for using the Online Shopping Cart System!");
            }
            sc.close();
        }
    }
    // Show product menu
    public static void showProductList() {
        System.out.println("\n--- Product Menu ---");
        for (int i = 0; i < productNames.length; i++) {
            System.out.println((i + 1) + ". " + productNames[i] + " - Rs. " + productPrices[i]);
        }
    }
    // Get number of items
    public static int getItemCount(Scanner sc) {
        int n;
        while (true) {
            System.out.print("Enter number of items you want to buy (min 1): ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n >= 1) return n;
                else System.out.println("Please enter at least 1.");
            } else {
                System.out.println("Invalid input! Please enter a number.");
                sc.next();
            }
        }
    }
    // Process order and update cart
    public static long processOrder(Scanner sc, int itemCount, int[] cart) {
        long amount = 0;
        int itemsAdded = 0;
        while (itemsAdded < itemCount) {
            System.out.print("Enter your choice (1-" + productNames.length + "): ");
            if (sc.hasNextInt()) {
                int choice = sc.nextInt();
                if (choice >= 1 && choice <= productNames.length) {
                    cart[choice - 1]++; // increase quantity
                    amount += productPrices[choice - 1];
                    System.out.println(productNames[choice - 1] + " added to cart.");
                    itemsAdded++;
                } else {
                    System.out.println("Invalid choice! Please select again.");
                }
            } else {
                System.out.println("Invalid input! Enter a number (1-" + productNames.length + ").");
                sc.next();
            }
        }
        return amount;
    }
    // Print receipt
    public static void printReceipt(int[] cart, long totalAmount) {
        System.out.println("\n======= BILL RECEIPT =======");
        long subtotal = 0;
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] > 0) {
                long itemTotal = cart[i] * productPrices[i];
                subtotal += itemTotal;
                System.out.println(productNames[i] + " x " + cart[i] + " = Rs. " + itemTotal);
            }
        }
        System.out.println("-----------------------------");
        System.out.println("Subtotal: Rs. " + subtotal);
        long discount = 0;
        if (subtotal >= 5000) {
            discount = subtotal * 10 / 100;
            System.out.println("Discount (10%): Rs. " + discount);
        }
        long finalAmount = subtotal - discount;
        System.out.println("Final Amount to Pay: Rs. " + finalAmount);
        System.out.println("=============================");
    }
}