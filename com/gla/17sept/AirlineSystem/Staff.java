package com.gla.AirlineSystem;
public abstract class Staff extends Person {
    public Staff(String name, int age, String contact) {
        super(name, age, contact);
    }
    @Override
    public void checkIn() {
        System.out.println("Staff " + name + " checked in via crew gate.");
    }
}