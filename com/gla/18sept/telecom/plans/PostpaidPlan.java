package com.gla.telecom.plans;

import com.gla.telecom.customer.UsageDetails;

public class PostpaidPlan extends Plan {

    public PostpaidPlan(String mobileNumber, double balance, UsageDetails usage) {
        super(mobileNumber, balance, usage);
    }

    @Override
    public double calculateBill() {
        double base = 199; // monthly rental
        double extra = (usage.calls * 0.3) + (usage.sms * 0.1) + (usage.data * 5);
        double bill = base + extra;
        bill += bill * networkTax;
        return bill;
    }
}