package com.gla.AirlineSystem;
public final class Ticket {     // Final class
    private String ticketId;
    private Passenger passenger;
    private Flight flight;
    public Ticket(String ticketId, Passenger passenger, Flight flight) {
        this.ticketId = ticketId;
        this.passenger = passenger;
        this.flight = flight;
    }
    public void printTicket() {
        System.out.println("Ticket ID: " + ticketId + " | Passenger: " + passenger.name +
                " | Flight: " + flight.getFlightNumber());
    }
}