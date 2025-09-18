package com.gla.telecom.customer;

import java.util.ArrayList;
import java.util.List;
import com.gla.telecom.plans.Plan;

public class Customer {
    private String name;
    private List<Plan> plans = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlan(Plan plan) {
        plans.add(plan);
    }

    public List<Plan> getPlans() {
        return plans;
    }
}
