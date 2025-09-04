package models;

public class SavingsAccount
{
    private Account _base_account;
    private double _intereset_rate = 0.1;

    public  SavingsAccount(Customer customer, Account _base_account, double _intereset_rate)
    {
        this._intereset_rate = _intereset_rate;
        this._base_account = _base_account;
        customer.add_account(_base_account);
    }

    public void set_intereset_rate(double _intereset_rate)
    {
        this._intereset_rate = _intereset_rate;
    }
    public double get_intereset_rate()
    {
        return _intereset_rate;
    }

    public double get_savings_account_balance_after_year()
    {
        double sum = _base_account.get_balance() + (_base_account.get_balance() * _intereset_rate);
        _base_account.set_balance(sum);
        return sum;
    }
}
