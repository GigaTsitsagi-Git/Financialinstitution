package transaction;

import models.Account;

public class Transaction
{
    private String message;
    private Account from;
    private Account to;
    private double amount;

    public Transaction(Account from, Account to, double amount, String message)
    {
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.message = message;
        if(this.from.getBalance() > amount)
        {
            this.from.setBalance(this.from.getBalance() - amount);
            this.to.setBalance(this.to.getBalance() + amount);
            System.out.println("Transfer completed successfully. Message:" + message);
        }
        else
        {
            System.out.println("Failed. Insufficient funds");
        }
    }

    public void set_message(String message)
    {
        this.message = message;
    }
    public String get_message()
    {
        return message;
    }
    public void from_this_account(Account account)
    {
        from = account;
    }
    public void to_this_account(Account account)
    {
        to = account;
    }
    public void set_amount(double amount)
    {
        this.amount = amount;
    }
    public double get_amount()
    {
        return amount;
    }



}
