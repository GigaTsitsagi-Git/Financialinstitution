package transaction;

import model.Account;
import model.Bank;

import java.math.BigDecimal;

public class Transaction {

    private String message;
    private Account from;
    private Account to;
    private BigDecimal amount;

    public Transaction(Account from, Account to, BigDecimal amount, Bank bank, String message) {
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.message = message;
        bank.addTransaction(this);
        if (this.from.getBalance().compareTo(amount) > 0) {
            this.from.setBalance(this.from.getBalance().subtract(amount));
            this.to.setBalance(this.to.getBalance().add(amount));
            System.out.println("Transfer completed successfully. Message:" + message);
        } else {
            System.out.println("Failed. Insufficient funds");
        }
    }

    public void set_message(String message) {
        this.message = message;
    }

    public String get_message() {
        return message;
    }

    public void from_this_account(Account account) {
        from = account;
    }

    public void to_this_account(Account account) {
        to = account;
    }

    public void set_amount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal get_amount() {
        return amount;
    }


}
