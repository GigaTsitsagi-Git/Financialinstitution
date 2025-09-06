package transaction;

import model.Account;
import model.Customer;

import java.math.BigDecimal;

public class Loan {
    private Customer borrower;
    private BigDecimal amount;
    private double interest_rate;

    public Loan(Customer borrower, String accountNumber, BigDecimal amount, double interest_rate) {
        this.borrower = borrower;
        this.amount = amount;
        this.interest_rate = interest_rate;

        Account acc = this.borrower.getAccauntByAccountNumber(accountNumber);
        acc.setBalance(acc.getBalance().add(this.amount));
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setInterestRate(double interest_rate) {
        this.interest_rate = interest_rate;
    }

    public double getInterestRate() {
        return interest_rate;
    }
}
