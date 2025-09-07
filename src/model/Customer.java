package model;

import java.util.Arrays;

public class Customer {

    private int accountCount = 0;
    private String name;
    private Account[] accounts = new Account[10];

    public Customer(String name, Bank bank) {
        this.name = name;
        bank.addCustomer(this);
    }

    public String getName() {
        return name;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public int getAccountCount() {
        return accountCount;
    }

    public Account getAccauntByAccountNumber(String accountNumber) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                return accounts[i];
            }
        }
        return null;
    }

    public void addAccount(Account account) {
        if (accountCount == accounts.length) {
            accounts = Arrays.copyOf(accounts, accounts.length * 2);
        }
        accounts[accountCount] = account;
        accountCount++;
    }

    public Account[] getAccounts() {
        return accounts;
    }

}
