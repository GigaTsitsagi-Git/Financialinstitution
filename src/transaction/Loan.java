package transaction;

import Interface.ITransferMoney;
import model.Customer;

import java.math.BigDecimal;

public class Loan implements ITransferMoney {

    private BigDecimal amount;
    private BigDecimal interestRate;

    public Loan(Customer borrower, BigDecimal amount, BigDecimal interestRate) {
        this.amount = amount;
        this.interestRate = interestRate;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public void printMoneyTransferred() {
        System.out.println("| LOAN | Money Transferred:" + amount);
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }
}
