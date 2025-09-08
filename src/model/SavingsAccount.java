package model;

import java.math.BigDecimal;

// SavingsAccount subclass
public class SavingsAccount extends Account {

    private BigDecimal interestRate;

    public SavingsAccount(String accountNumber, BigDecimal balance, BigDecimal interestRate) {
        setAccountNumber(accountNumber);
        setBalance(balance);
        this.interestRate = interestRate;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        BigDecimal interest = getBalance().multiply(interestRate);
        setBalance(getBalance().add(interest));
    }

    public BigDecimal calculateFutureBalance() {
        BigDecimal interest = getBalance().multiply(interestRate);
        return getBalance().add(interest);
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "accountNumber='" + getAccountNumber() + '\'' +
                ", balance=" + getBalance() +
                ", interestRate=" + interestRate +
                '}';
    }
}
