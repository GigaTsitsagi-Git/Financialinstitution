package model;

import java.math.BigDecimal;

public class CheckingAccount extends Account {

    private BigDecimal overdraftLimit;

    public CheckingAccount(String accountNumber, BigDecimal balance, BigDecimal overdraftLimit) {
        setAccountNumber(accountNumber);
        setBalance(balance);
        this.overdraftLimit = overdraftLimit;
    }

    public BigDecimal getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(BigDecimal overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public boolean withdraw(BigDecimal amount) {
        if (getBalance().add(overdraftLimit).compareTo(amount) >= 0) {
            setBalance(getBalance().subtract(amount));
            return true;
        } else {
            System.out.println("Insufficient funds including overdraft!");
            return false;
        }
    }

    public boolean isOverdraftInUse() {
        return getBalance().compareTo(BigDecimal.ZERO) < 0;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "accountNumber='" + getAccountNumber() + '\'' +
                ", balance=" + getBalance() +
                ", overdraftLimit=" + overdraftLimit +
                '}';
    }
}
