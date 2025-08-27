import java.util.Scanner;
public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "";
        // while loop → keep running until EXIT
        while (!choice.equalsIgnoreCase("EXIT")) {
            System.out.println("\nEnter Student Name:");
            sc.nextLine();
            String studentName = sc.nextLine();
            // do-while → ensure at least one calculation is done
            boolean moreBooks;
            do {
                System.out.println("Enter number of books borrowed:");
                int noOfBooks = sc.nextInt();
                int studentFine = 0; // total fine for the student
                // for loop → check multiple borrowed books
                for (int i = 1; i <= noOfBooks; i++) {
                    System.out.println("Enter book type for Book " + i + " (1. Regular, 2. Reference, 3. Magazine):");
                    int bookType = sc.nextInt();
                    String categoryName;
                    int finePerDay = 0;
                    // switch-case → book category
                    switch (bookType) {
                        case 1:
                            categoryName = "Regular";
                            break;
                        case 2:
                            categoryName = "Reference";
                            break;
                        case 3:
                            categoryName = "Magazine";
                            break;
                        default:
                            categoryName = "Invalid";
                            System.out.println("Invalid book type! Assuming Regular.");
                            categoryName = "Regular";
                    }
                    System.out.println("Enter total number of days you kept Book " + i + ": ");
                    int daysKept = sc.nextInt();
                    int daysLate = daysKept - 10; // validation: first 10 days free
                    int fine = 0;
                    // if-else → fine calculation
                    if (daysLate > 0 && daysLate <= 5) {
                        finePerDay = 10;
                        fine = daysLate * finePerDay;
                    } else if (daysLate >= 6 && daysLate <= 10) {
                        finePerDay = 20;
                        fine = daysLate * finePerDay;
                    } else if (daysLate > 10) {
                        finePerDay = 50;
                        fine = daysLate * finePerDay;
                    } else {
                        fine = 0;
                    }
                    studentFine += fine;
                    if (fine == 0) {
                        System.out.println("Book " + i + " (" + categoryName + "): Returned within 10 days → No Fine.");
                    } else {
                        System.out.println("Book " + i + " (" + categoryName + "): Days Late = " + daysLate + " → Fine ₹" + fine);
                    }
                }
                System.out.println(studentName + "'s Total Fine: ₹" + studentFine);
                System.out.println("Do you want to calculate fine for more books for this student? (true/false)");
                moreBooks = sc.nextBoolean();
            } while (moreBooks);
            System.out.println("Type EXIT to stop, or press Enter to continue...");
            sc.nextLine(); // consume newline
            choice = sc.nextLine();
        }
        System.out.println("\nFine calculation ended.");
    }
}