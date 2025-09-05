package models;

public class Account {

    private String account_number;
    private double balance;


    public String getAccountNumber() {
        return this.account_number;
    }

    public void setAccountNumber(String accountNumber) {
        this.account_number = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
