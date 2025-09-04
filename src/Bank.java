import java.util.ArrayList;
import java.util.List;

public class Bank
{
    private FinancialInstitution _institution;
    private List<Customer> _customers;
    private List<Account> _accounts;

    public Bank()
    {
        _customers = new ArrayList<>();
        _accounts = new ArrayList<>();
    }

    public void set_institution(FinancialInstitution _institution)
    {
        this._institution = _institution;
    }
    public void add_customer(Customer customer)
    {
        _customers.add(customer);
    }
    public void add_account(Account account)
    {
        _accounts.add(account);
    }
}
