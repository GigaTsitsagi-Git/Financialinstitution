package model;

import java.math.BigDecimal;

public class CheckingAccount {

    private Account base_account;
    private BigDecimal overdraft_limit;

    public CheckingAccount(Customer customer, Account base_account, BigDecimal overdraft_limit) {
        this.overdraft_limit = overdraft_limit;
        this.base_account = base_account;
        customer.addAccount(base_account);
    }

    public BigDecimal getOverdraftLimit() {
        return overdraft_limit;
    }

    public void setOverdraftLimit(BigDecimal overdraft_limit) {
        this.overdraft_limit = overdraft_limit;
    }

    public BigDecimal getTotalAmount() {
        return (base_account.getBalance().add(overdraft_limit));
    }
}
