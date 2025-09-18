package com.gla.telecom.plans;

import com.gla.telecom.customer.UsageDetails;
import com.gla.telecom.interfaces.Rechargeable;

public abstract class Plan implements Rechargeable {
    protected final String mobileNumber;        // Final: immutable
    protected double balance;
    protected UsageDetails usage;
    protected static double networkTax = 0.05;   // Static: same for all plans

    // Inner class for extra data
    public class DataPack {
        private double extraData;
        public DataPack(double extraData) {
            this.extraData = extraData;
        }
        public void addToUsage() {
            usage.data += extraData;
            System.out.println(extraData + " GB extra data added.");
        }
    }

    public Plan(String mobileNumber, double balance, UsageDetails usage) {
        this.mobileNumber = mobileNumber;
        this.balance = balance;
        this.usage = usage;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public abstract double calculateBill();

    @Override
    public void recharge(double amount) {
        balance += amount;
        System.out.println("Recharged ₹" + amount + ". New balance: ₹" + balance);
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}
