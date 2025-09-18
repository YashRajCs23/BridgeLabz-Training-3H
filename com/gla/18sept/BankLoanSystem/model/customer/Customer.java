package com.gla.BankLoanSystem.model.customer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.gla.BankLoanSystem.model.accounts.Account;
public class Customer {
    private String name;
    private String customerId;
    private final List<Account> accounts = new ArrayList<>();

    public Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void addAccount(Account acc) {
        if (acc != null) accounts.add(acc);
    }

    public List<Account> getAccounts() {
        return Collections.unmodifiableList(accounts);
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%s, name=%s, accounts=%d]", customerId, name, accounts.size());
    }
}