package com.gla.ecommerce;
public class Invoice {
    private Order order;
    public Invoice(Order order) {
        this.order = order;
    }
    public void printInvoice() {
        // Using hashCode only for demo uniqueness
        System.out.println("Invoice generated for Order ID: " + order.hashCode());
    }
}