package com.gla.ecommerce;
public class Seller extends User {
    public Seller(String name, String email) {
        super(name, email);
    }
    @Override
    public String getRole() {
        return "Seller";
    }
    public void placeOrder(String product) {
        System.out.println(name + " added stock for product: " + product);
    }
}