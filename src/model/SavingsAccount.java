package model;

import java.math.BigDecimal;

public class SavingsAccount {

    private Account base_account;
    private double intereset_rate = 0.1;

    public SavingsAccount(Customer customer, Account base_account, double intereset_rate) {
        this.intereset_rate = intereset_rate;
        this.base_account = base_account;
        customer.addAccount(base_account);
    }

    public void setInteresetRate(double intereset_rate) {
        this.intereset_rate = intereset_rate;
    }

    public double getInteresetRate() {
        return intereset_rate;
    }

    public BigDecimal get_savings_account_balance_after_year() {
        BigDecimal sum = base_account.getBalance().add((base_account.getBalance().multiply(BigDecimal.valueOf(intereset_rate))));
        base_account.setBalance(sum);
        return sum;
    }
}
