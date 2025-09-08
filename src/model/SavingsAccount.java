package model;

import java.math.BigDecimal;

public class SavingsAccount {

    private Account base_account;
    private BigDecimal interestRate;

    public SavingsAccount(Customer customer, Account baseAccount, BigDecimal interestRate) {
        this.interestRate = interestRate;
        this.base_account = baseAccount;
        customer.addAccount(baseAccount);
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public BigDecimal getSavingsAccountBalanceAfterYear() {
        BigDecimal sum = base_account.getBalance().add((base_account.getBalance().multiply(interestRate)));
        base_account.setBalance(sum);
        return sum;
    }
}
