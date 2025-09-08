package transaction;

import model.Account;
import model.Bank;
import model.Customer;

import java.math.BigDecimal;

public class Loan {

    private BigDecimal amount;
    private double interestRate;

    public Loan(Customer borrower, String accountNumber, BigDecimal amount, double interestRate) {
        this.amount = amount;
        this.interestRate = interestRate;

        Account acc = borrower.getAccauntByAccountNumber(accountNumber);
        acc.setBalance(acc.getBalance().add(this.amount));
        borrower.addLoan(this);
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
