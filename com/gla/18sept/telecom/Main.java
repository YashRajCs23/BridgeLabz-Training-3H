package com.gla.telecom;

import com.gla.telecom.customer.*;
import com.gla.telecom.plans.*;

public class Main {
    public static void main(String[] args) {
        UsageDetails u1 = new UsageDetails(100, 50, 1.5);
        UsageDetails u2 = new UsageDetails(200, 20, 3);

        Plan prepaid = new PrepaidPlan("9876543210", 300, u1);
        Plan postpaid = new PostpaidPlan("9123456780", 0, u2);

        // Inner class usage
        Plan.DataPack pack = prepaid.new DataPack(1.0);
        pack.addToUsage();

        Customer cust = new Customer("Seema");
        cust.addPlan(prepaid);
        cust.addPlan(postpaid);

        prepaid.recharge(100);

        BillingSystem.generateMonthlyBill(cust);
    }
}
