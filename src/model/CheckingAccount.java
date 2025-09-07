package model;

import java.math.BigDecimal;

public class CheckingAccount {

    private Account baseAccount;
    private BigDecimal overdraftLimit;

    public CheckingAccount(Customer customer, Account baseAccount, BigDecimal overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
        this.baseAccount = baseAccount;
        customer.addAccount(baseAccount);
    }

    public BigDecimal getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(BigDecimal overdraft_limit) {
        this.overdraftLimit = overdraft_limit;
    }

    public BigDecimal getTotalAmount() {
        return (baseAccount.getBalance().add(overdraftLimit));
    }
}
