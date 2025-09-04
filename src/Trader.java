public class Trader
{
    private String _trader_id;
    private Customer _customer;

    public Trader(String trader_id, Customer customer)
    {
        _trader_id = trader_id;
        _customer = customer;
    }
    public void set_customer(Customer _customer) {
        this._customer = _customer;
    }
    public void set_trader_id(String trader_id)
    {
        _trader_id = trader_id;
    }
    public String get_trader_id()
    {
        return _trader_id;
    }

    public void show_customer_accounts() {
        if (_customer != null && _customer.get_accounts() != null) {
            System.out.println("Accounts for customer " + _customer.get_name() + ":");
            for (Account acc : _customer.get_accounts()) {
                System.out.println(" - " + acc.get_account_number() + " : " + acc.get_balance());
            }
        } else {
            System.out.println("No customer or accounts found for this trader.");
        }
    }

}
