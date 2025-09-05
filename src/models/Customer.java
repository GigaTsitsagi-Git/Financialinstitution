package models;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private int accountCount = 0;
    private String name;
    private Account[] accounts = new Account[10];
    private Bank bank;

    public Customer(String name, Bank bank) {
        this.name = name;
        this.bank = bank;
        bank.add_customer(this);
    }

    public String getName() {
        return name;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public int getAccountCount(){
        return accountCount;
    }
    public Account getAccauntByAccountNumber(String account_number) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber().equals(account_number)) {
                return accounts[i];
            }
        }
        return null;
    }

    public void addAccount(Account account) {
        accounts[accountCount] = account;
        accountCount++;
    }

    public Account[] getAccounts() {
        return accounts;
    }

}
