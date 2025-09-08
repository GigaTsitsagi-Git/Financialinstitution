package model;

import transaction.Loan;

import java.util.Arrays;

public class Customer {

    private int accountCount = 0;
    private String name;
    private int loanCount = 0;
    private Loan[] loans = new Loan[10];
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

    public void addLoan(Loan loan) {
        if (loanCount == loans.length) {
            loans = Arrays.copyOf(loans, loans.length * 2);
        }
        loans[loanCount] = loan;
        loanCount++;
    }

    public Loan[] getLoans() {
        return loans;
    }
}
