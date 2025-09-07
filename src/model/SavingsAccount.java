package model;

import java.math.BigDecimal;

public class SavingsAccount {

    private Account base_account;
    private double interesetRate = 0.1;

    public SavingsAccount(Customer customer, Account baseAccount, double interesetRate) {
        this.interesetRate = interesetRate;
        this.base_account = baseAccount;
        customer.addAccount(baseAccount);
    }

    public void setInteresetRate(double interesetRate) {
        this.interesetRate = interesetRate;
    }

    public double getInteresetRate() {
        return interesetRate;
    }

    public BigDecimal get_savings_account_balance_after_year() {
        BigDecimal sum = base_account.getBalance().add((base_account.getBalance().multiply(BigDecimal.valueOf(interesetRate))));
        base_account.setBalance(sum);
        return sum;
    }
}
