package com.gla.AirlineSystem;
public class Pilot extends Staff implements Flyable {
    public Pilot(String name, int age, String contact) {
        super(name, age, contact);
    }
    @Override
    public String getRole() {
        return "Pilot";
    }
    @Override
    public void flyPlane() {
        System.out.println("Pilot " + name + " is flying the plane.");
    }
}