package com.gla.AirlineSystem;
public class Flight {
    private String flightNumber;
    private Cockpit cockpit; // Composition
    public Flight(String flightNumber) {
        this.flightNumber = flightNumber;
        this.cockpit = new Cockpit();
    }
    public String getFlightNumber() {
        return flightNumber;
    }
    public void cancelFlight() {
        System.out.println("Flight " + flightNumber + " is canceled.");
        cockpit = null; // Cockpit ceases to exist
    }
}