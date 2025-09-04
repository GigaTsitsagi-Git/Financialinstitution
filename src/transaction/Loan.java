package transaction;

import models.Account;
import models.Customer;

public class Loan
{
    private Customer _borrower;
    private double _amount;
    private double _interest_rate;

    public Loan(Customer borrower, double amount, double interest_rate)
    {
        _borrower = borrower;
        _amount = amount;
        _interest_rate = interest_rate;

        Account acc = _borrower.get_accaunt_by_account_number("1");
        acc.set_balance(acc.get_balance() + amount);
    }
    public void set_amount(double _amount)
    {
        this._amount = _amount;
    }
    public double get_amount()
    {
        return _amount;
    }
    public void set_interest_rate(double _interest_rate)
    {
        this._interest_rate = _interest_rate;
    }
    public double get_interest_rate()
    {
        return _interest_rate;
    }
}
