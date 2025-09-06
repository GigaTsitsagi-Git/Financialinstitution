package model;

import java.math.BigDecimal;

public class Account {

    private String account_number;
    private BigDecimal balance;


    public String getAccountNumber() {
        return this.account_number;
    }

    public void setAccountNumber(String accountNumber) {
        this.account_number = accountNumber;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
