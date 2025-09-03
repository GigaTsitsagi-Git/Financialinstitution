public class CheckingAccount
{
    private Account _base_account;
    private double _overdraft_limit;

    public double get_overdraft_limit()
    {
        return _overdraft_limit;
    }

    public void set_overdraft_limit(double _overdraft_limit)
    {
        this._overdraft_limit = _overdraft_limit;
    }

    public void print_total_amount()
    {
        System.out.println("total amount:" + _base_account.get_balance() + _overdraft_limit);
    }
}
