package com.gla.AirlineSystem;
import java.util.*;
public class Airline {
    public static String airlineName = "SkyHigh Airlines"; // Static field
    private List<Flight> flights = new ArrayList<>();
    public void addFlight(Flight f) {
        flights.add(f);
        System.out.println("Flight " + f.getFlightNumber() + " added to Airline " + airlineName);
    }
    public List<Flight> getFlights() {
        return flights;
    }
}