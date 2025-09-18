package com.gla.ecommerce;
public class ECommerceDemo {
    interface DiscountStrategy {
        double getDiscountedPrice(double amount);
    }
    public static void main(String[] args) {
        Marketplace market = new Marketplace();
        market.termsAndConditions();
        Customer c1 = new Customer("Alice", "alice@example.com");
        Seller s1   = new Seller("Bob", "bob@seller.com");
        market.addCustomer(c1);
        market.addSeller(s1);
        market.listUsers();
        // Polymorphism
        c1.placeOrder("Laptop");
        s1.placeOrder("Laptop");
        // Association & Composition
        Order o1 = new Order("ORD123", 49999.0);
        o1.showOrder();
        // Interface example
        PaymentGateway pg = new CreditCardPayment();
        pg.pay(49999.0);
        pg.refund(2000.0);
        // Anonymous inner class for a one-time discount
        DiscountStrategy festivalDiscount = new DiscountStrategy() {
            @Override
            public double getDiscountedPrice(double amount) {
                double discount = amount * 0.10;
                System.out.println("One-time festival discount of 10% applied: -₹" + discount);
                return amount - discount;
            }
        };
        double discountedPrice = festivalDiscount.getDiscountedPrice(10000.0);
        System.out.println("Final Price after discount: ₹" + discountedPrice);
    }
}