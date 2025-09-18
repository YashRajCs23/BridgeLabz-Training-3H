package com.gla.AirlineSystem;
public class CabinCrew extends Staff {
    public CabinCrew(String name, int age, String contact) {
        super(name, age, contact);
    }
    @Override
    public String getRole() {
        return "Cabin Crew";
    }
}