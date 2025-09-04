public class Stock
{
    private String _company_name;
    private int _shares;
    private double _price_per_share;

    public Stock(String company_name, int shares, int price_per_share)
    {
        _company_name = company_name;
        _shares = shares;
        _price_per_share = price_per_share;
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
    public double get_price_per_share()
    {
        return _price_per_share;
    }
    public void set_price_per_share(double _price_per_share)
    {
        this._price_per_share = _price_per_share;
    }

    public double get_net_worth()
    {
        return _shares * _price_per_share;
    }
}
