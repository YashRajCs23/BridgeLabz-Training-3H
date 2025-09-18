package com.gla.AirlineSystem;
import java.util.List;
import java.util.ArrayList;
public class Passenger extends Person{
    private List<Flight> bookedFlights = new ArrayList<>();
    public Passenger(String name, int age, String contact) {
        super(name, age, contact);
    }
    @Override
    public String getRole() {
        return "Passenger";
    }
    @Override
    public void checkIn() {
        System.out.println("Passenger " + name + " checked in at the counter.");
    }
    public void bookFlight(Flight f) {
        bookedFlights.add(f);
        System.out.println(name + " booked flight " + f.getFlightNumber());
    }
    public List<Flight> getBookedFlights() {
        return bookedFlights;
    }
}