public class Stock
{
    private String _company_name;
    private int _shares;

    public Stock(String company_name, int shares)
    {
        _company_name = company_name;
        _shares = shares;
    }

    public void set_company_name(String company_name)
    {
        _company_name = company_name;
    }
    public String get_company_name()
    {
        return _company_name;
    }
    public void set_shares(int shares)
    {
        _shares = shares;
    }
    public int get_shares()
    {
        return _shares;
    }
}
