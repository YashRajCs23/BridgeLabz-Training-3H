package com.gla.ecommerce;
public class Order {
    private String orderId;
    private double amount;
    private Invoice invoice; // Composition
    public Order(String orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
        this.invoice = new Invoice(this); // Invoice cannot exist without Order
    }
    public void showOrder() {
        System.out.println("Order ID: " + orderId + ", Amount: ₹" + amount);
        invoice.printInvoice();
    }
}