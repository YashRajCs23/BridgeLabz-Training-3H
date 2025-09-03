package Constructor.Level 1.CarRental;
public class CarRentalMain {
    public static void main(String[] args) {
        
        CarRental cr1 = new CarRental(); // default
        CarRental cr2 = new CarRental("Charlie", "Tesla Model 3", 5); // parameterized
        cr1.display();
        cr2.display();
    }
}