package model;

import exception.InvalidAccountException;
import interfaces.ICalculable;
import interfaces.IStorable;

import java.math.BigDecimal;

public class Account implements ICalculable, IStorable {

    private String accountNumber;
    private BigDecimal balance;

    public Account(String accountNumber, BigDecimal balance) {
        if (accountNumber == null || accountNumber.isBlank()) {
            throw new InvalidAccountException("Account number cannot be empty");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    @Override
    public String toString() {
        return "Account number: " + accountNumber + ", Balance: " + balance;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Account account = (Account) obj;
        return accountNumber != null && accountNumber.equals(account.accountNumber);
    }

    @Override
    public int hashCode() {
        return accountNumber != null ? accountNumber.hashCode() : 0;
    }

    @Override
    public BigDecimal calculateTotalValue() {
        return balance;
    }

    @Override
    public void save() {
        System.out.println("Saved to some Database");
    }
}
