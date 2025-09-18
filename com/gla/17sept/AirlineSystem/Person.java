package com.gla.AirlineSystem;

public class Person {
    protected String name;
    protected int age;
    protected String contact;
    public Person(String name, int age, String contact) {
        this.name = name;
        this.age = age;
        this.contact = contact;
    }
    public abstract String getRole();
    public void checkIn() {
        System.out.println(name + " is checking in (default).");
    }
}