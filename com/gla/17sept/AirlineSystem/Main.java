package com.gla.AirlineSystem;
public class Main {
    public static void main(String[] args) {
        // Aggregation: Airline can exist without flights, flights can exist without airline
        Airline airline = new Airline();
        Flight f1 = new Flight("AI101");
        Flight f2 = new Flight("AI202");
        airline.addFlight(f1);
        airline.addFlight(f2);
        // Persons (Abstraction & Dynamic Dispatch)
        Person p1 = new Passenger("Alice", 28, "alice@example.com");
        Person p2 = new Pilot("Captain Bob", 45, "bob@example.com");
        Person p3 = new CabinCrew("Charlie", 32, "charlie@example.com");
        System.out.println("\n--- Dynamic Dispatch Demo ---");
        Person[] people = { p1, p2, p3 };
        for (Person p : people) {
            System.out.println(p.name + " is a " + p.getRole());
            p.checkIn(); // runtime binding to correct overridden method
        }
        // Subclass-specific actions
        Passenger passenger = (Passenger) p1;
        passenger.bookFlight(f1);
        passenger.bookFlight(f2);
        Pilot pilot = (Pilot) p2;
        pilot.flyPlane();  // Interface method
        // Final class usage
        Ticket ticket = new Ticket("T123", passenger, f1);
        ticket.printTicket();
        // Composition demo
        f1.cancelFlight(); // Cockpit destroyed with flight
    }
}