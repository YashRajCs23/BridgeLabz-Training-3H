package com.gla.telecom;

import com.gla.telecom.customer.Customer;
import com.gla.telecom.plans.Plan;

public class BillingSystem {
    public static void generateMonthlyBill(Customer c) {
        System.out.println("\nMonthly Bill for: " + c.getName());
        double total = 0;
        for (Plan p : c.getPlans()) {
            double bill = p.calculateBill();
            System.out.println("Mobile: " + p.getMobileNumber() + " | Bill: ₹" + bill);
            total += bill;
        }
        System.out.println("Total Payable: ₹" + total);
    }
}