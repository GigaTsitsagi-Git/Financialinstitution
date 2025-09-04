public class CheckingAccount
{
    private Account _base_account;
    private double _overdraft_limit;

    public CheckingAccount(Customer customer, Account _base_account, double _overdraft_limit)
    {
        this._overdraft_limit = _overdraft_limit;
        this._base_account = _base_account;
        customer.add_account(_base_account);
    }

    public double get_overdraft_limit()
    {
        return _overdraft_limit;
    }

    public void set_overdraft_limit(double _overdraft_limit)
    {
        this._overdraft_limit = _overdraft_limit;
    }

    public double get_total_amount()
    {
        return (_base_account.get_balance() + _overdraft_limit);
    }
}
