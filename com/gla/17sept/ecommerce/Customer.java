package com.gla.ecommerce;
public class Customer extends User {
    public Customer(String name, String email) {
        super(name, email);
    }
    @Override
    public String getRole() {
        return "Customer";
    }
    public void placeOrder(String product) {
        System.out.println(name + " placed an order for " + product);
    }
}