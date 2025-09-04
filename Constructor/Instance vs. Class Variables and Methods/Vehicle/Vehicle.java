package Constructor.Instance vs. Class Variables and Methods.Vehicle;
public class Vehicle {
    // Instance variables
    String ownerName;
    String vehicleType;
    
    // Class variable (shared by all vehicles)
    static double registrationFee = 5000.0;
    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    // Instance method
    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName +
                           ", Vehicle Type: " + vehicleType +
                           ", Registration Fee: " + registrationFee);
    }
    // Class method
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: " + registrationFee);
    }
}