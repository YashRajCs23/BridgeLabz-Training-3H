import java.util.Scanner;
public class RailwayReservation {
    static Scanner sc = new Scanner(System.in);
    static int seatsAvailable, waitingList;
    static int booked = 0, waitCount = 0; 
    static String trainName = "";
    static int fare = 0;
    public static void main(String[] args) {
        System.out.println("=== Welcome to Railway Reservation System ===");
        selectTrain();
        bookingProcess();
        showFinalSummary();
    }
    public static void selectTrain() {
        System.out.println("Select Train:");
        System.out.println("1. Vande Bharat (Fare: 500)");
        System.out.println("2. Shatabdi (Fare: 800)");
        System.out.println("3. Rajdhani (Fare: 1200)");
        System.out.print("Enter your choice: ");
        int trainChoice = sc.nextInt();
        switch (trainChoice) {
            case 1: trainName = "Vande Bharat"; fare = 500; seatsAvailable = 5; waitingList = 3; break;
            case 2: trainName = "Shatabdi"; fare = 800; seatsAvailable = 6; waitingList = 4; break;
            case 3: trainName = "Rajdhani"; fare = 1200; seatsAvailable = 8; waitingList = 5; break;
            default:
                System.out.println("Invalid train choice. Exiting...");
                System.exit(0);
        }
        System.out.println("You selected " + trainName + " with fare: " + fare);
    }
    public static void bookingProcess() {
        char moreBooking;
        do {
            System.out.print("\nEnter number of passengers to book: ");
            int n = sc.nextInt();
            processPassengers(n);
            showBookingSummary();
            if (seatsAvailable == 0 && waitingList == 0) {
                System.out.println("\nTrain is FULL! No further bookings allowed.");
                break;
            }
            System.out.print("\nDo you want to book more tickets? (y/n): ");
            moreBooking = sc.next().charAt(0);
        } while (moreBooking == 'y' || moreBooking == 'Y');
    }
    public static void processPassengers(int n) {
        for (int i = 1; i <= n; i++) {
            if (seatsAvailable > 0) {
                System.out.println("Passenger " + i + " → Seat Confirmed");
                seatsAvailable--;
                booked++;
            } else if (waitingList > 0) {
                System.out.println("Passenger " + i + " → Added to Waiting List");
                waitingList--;
                waitCount++;
            } else {
                System.out.println("Passenger " + i + " → No seats available, booking failed");
            }
        }
    }
    public static void showBookingSummary() {
        System.out.println("\nBooking Summary:");
        System.out.println("Train: " + trainName);
        System.out.println("Confirmed Seats Booked: " + booked);
        System.out.println("Waiting List: " + waitCount);
        System.out.println("Seats Left: " + seatsAvailable);
        System.out.println("Waiting Slots Left: " + waitingList);
    }
    public static void showFinalSummary() {
        System.out.println("\n=== Reservation Closed ===");
        System.out.println("Train: " + trainName);
        System.out.println("Total Confirmed: " + booked + ", Waiting: " + waitCount);
    }
}