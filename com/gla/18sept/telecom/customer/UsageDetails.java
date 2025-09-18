package com.gla.telecom.customer;

public class UsageDetails {
    public int calls;
    public int sms;
    public double data;

    public UsageDetails(int calls, int sms, double data) {
        this.calls = calls;
        this.sms = sms;
        this.data = data;
    }
}
