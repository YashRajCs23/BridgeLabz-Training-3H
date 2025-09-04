package Constructor.Instance vs. Class Variables and Methods.Vehicle;
public class VehicleMain {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Alice", "Car");
        Vehicle v2 = new Vehicle("Bob", "Motorbike");
        Vehicle v3 = new Vehicle("Charlie", "Truck");
        
        // Display initial details
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        v3.displayVehicleDetails();
        // Update registration fee using class method
        Vehicle.updateRegistrationFee(6000.0);
        // Display updated details (all vehicles reflect change)
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        v3.displayVehicleDetails();
    }
}