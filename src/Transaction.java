public class Transaction
{
    private String _message;
    private Account _from;
    private Account _to;
    private double _amount;

    public void set_message(String _message)
    {
        this._message = _message;
    }
    public String get_message()
    {
        return _message;
    }
    public void from_this_account(Account account)
    {
        _from = account;
    }
    public void to_this_account(Account account)
    {
        _to = account;
    }
    public void set_amount(double _amount)
    {
        this._amount = _amount;
    }
    public double get_amount()
    {
        return _amount;
    }

    public void transaction()
    {
        if(_from.get_balance() > _amount)
        {
            _from.set_balance(_from.get_balance() - _amount);
            _to.set_balance(_to.get_balance() + _amount);
        }
        else
        {
            System.out.println("Failed. Insufficient funds");
        }
    }

}
