package transaction;

import models.Account;
import models.Customer;

public class Loan {
    private Customer borrower;
    private double amount;
    private double interest_rate;

    public Loan(Customer borrower, String accountNumber, double amount, double interest_rate) {
        this.borrower = borrower;
        this.amount = amount;
        this.interest_rate = interest_rate;

        Account acc = this.borrower.getAccauntByAccountNumber(accountNumber);
        acc.setBalance(acc.getBalance() + amount);
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setInterestRate(double interest_rate) {
        this.interest_rate = interest_rate;
    }

    public double getInterestRate() {
        return interest_rate;
    }
}
