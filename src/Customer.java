import java.util.List;

public class Customer
{
    private String _name;
    private List<Account> _accounts;

    public String get_name()
    {
        return _name;
    }
    public void set_name(String name)
    {
        _name = name;
    }

    public Account get_accaunt_by_account_number(String account_number)
    {
        for(int i = 0; i < _accounts.size(); i++)
        {
            if (_accounts.get(i).get_account_number().equals(account_number))
            {
                return _accounts.get(i);
            }
        }
        Account new_acc = new Account();
        _accounts.add(new_acc);
        return new_acc;
    }
    public void add_account(Account account)
    {
        if (!_accounts.contains(account))
        {
            _accounts.add(account);
        }
    }
    public void delete_account(String acc_number)
    {
        if(_accounts.isEmpty())
        {
            return;
        }
        for(int i = 0; i < _accounts.size(); i++)
        {
            if (_accounts.get(i).get_account_number().equals(acc_number))
            {
                _accounts.remove(i);
            }
        }
    }

    public List<Account> get_accounts()
    {
        return _accounts;
    }

}
