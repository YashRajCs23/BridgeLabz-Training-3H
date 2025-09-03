package Constructor.Level 1.Hotel Booking;
public class HotelBookingMain {
    public static void main(String[] args) {

        HotelBooking h1 = new HotelBooking(); // default
        HotelBooking h2 = new HotelBooking("Bob", "Deluxe", 3); // parameterized
        HotelBooking h3 = new HotelBooking(h2); // copy constructor
        h1.display();
        h2.display();
        h3.display();
    }
}