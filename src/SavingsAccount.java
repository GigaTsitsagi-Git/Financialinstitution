public class SavingsAccount
{
    private Account _base_account;
    private double _intereset_rate = 0.1;

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
        return _base_account.get_balance() + (_base_account.get_balance() * _intereset_rate);
    }
}
