package Practice_Problems.Vehicle Registration System;

public class VehicleMain {
    public static void main(String[] args) {
        // Update the registration fee for all vehicles
        Vehicle.updateRegistrationFee(150.0); // Set registration fee to $150.0

        // Create new vehicle instances
        Vehicle vehicle1 = new Vehicle("Honest Raj", "Sedan", "ABC123");
        Vehicle vehicle2 = new Vehicle("Price Danish", "SUV", "XYZ789");
        // Display vehicle registration details
        vehicle1.displayRegistrationDetails();
        System.out.println();
        vehicle2.displayRegistrationDetails();
    }
}
