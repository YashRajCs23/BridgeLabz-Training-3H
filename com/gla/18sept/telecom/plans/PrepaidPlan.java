package com.gla.telecom.plans;

import com.gla.telecom.customer.UsageDetails;

public class PrepaidPlan extends Plan {

    public PrepaidPlan(String mobileNumber, double balance, UsageDetails usage) {
        super(mobileNumber, balance, usage);
    }

    @Override
    public double calculateBill() {
        double bill = (usage.calls * 0.5) + (usage.sms * 0.2) + (usage.data * 10);
        bill += bill * networkTax;
        return bill;
    }
}