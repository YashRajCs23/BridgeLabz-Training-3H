import java.util.Scanner;
public class CinemaSeats {
    public static void main(String[] args) {
        int rows = 5, cols = 10;
        int[][] seats = new int[rows][cols];  // 0 = empty, 1 = booked
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Book Seats");
            System.out.println("2. Show Seats");
            System.out.println("3. Exit");
            int choice = sc.nextInt();
            if (choice == 1) {
                showSeats(seats);
                System.out.print("Enter row at which you want to book your seat (1-5): ");
                int row = sc.nextInt() - 1;
                System.out.print("Enter starting seat number (1-10): ");
                int start = sc.nextInt() - 1;
                System.out.print("Enter number of seats to book: ");
                int n = sc.nextInt();
                bookSeats(seats, row, start, n);
            }
            else if (choice == 2) {
                showSeats(seats);
            }
            else if (choice == 3) {
                break;
            }
        }
    }
    private static void bookSeats(int[][] seats, int row, int start, int n) {
        int rows = seats.length, cols = seats[0].length;
        if (row < 0 || row >= rows || start < 0 || start + n > cols) {
            System.out.println("Invalid row/seat selection.");
            return;
        }
        // check availability
        for (int j = start; j < start + n; j++) {
            if (seats[row][j] == 1) {
                System.out.println("Seats not available at Row " + (row+1) + " starting from Seat " + (start+1));
                return;
            }
        }
        // book seats
        for (int j = start; j < start + n; j++) {
            seats[row][j] = 1;
        }
        System.out.println("Successfully booked " + n + " seats at Row " + (row+1) + " Seats " + (start+1) + "-" + (start+n));
    }
    // Display seating arrangement
    private static void showSeats(int[][] seats) {
        System.out.println("\nSeat Layout (0 = empty, 1 = booked):");
        for (int i = 0; i < seats.length; i++) {
            System.out.print("Row " + (i+1) + ": ");
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }
}