package com.gla.ecommerce;
import java.util.ArrayList;
import java.util.List;
public class Marketplace {
    static {
        System.out.println("Marketplace configuration loaded.");
    }
    public final void termsAndConditions() {
        System.out.println("Marketplace T&C: All sales are subject to policies.");
    }
    private List<Customer> customers = new ArrayList<>();
    private List<Seller> sellers = new ArrayList<>();
    public void addCustomer(Customer c) {
        customers.add(c);
    }
    public void addSeller(Seller s) {
        sellers.add(s);
    }
    public void listUsers() {
        System.out.println("=== Customers ===");
        for (Customer c : customers) System.out.println(c.name);
        System.out.println("=== Sellers ===");
        for (Seller s : sellers) System.out.println(s.name);
    }
}