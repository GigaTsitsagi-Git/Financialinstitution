package trading;

import transaction.FinancialExchange;

import java.math.BigDecimal;

public class Stock
{
    private String company_name;
    private int shares;
    private BigDecimal price_per_share;
    private FinancialExchange financialExchange;

    public Stock(String company_name, int shares, BigDecimal price_per_share, FinancialExchange financialExchange)
    {
        this.company_name = company_name;
        this.shares = shares;
        this.price_per_share = price_per_share;
        this.financialExchange = financialExchange;
        this.financialExchange.addStock(this);
    }

    public void set_company_name(String company_name)
    {
        this.company_name = company_name;
    }
    public String get_company_name()
    {
        return company_name;
    }
    public void set_shares(int shares)
    {
        this.shares = shares;
    }
    public int get_shares()
    {
        return shares;
    }
    public BigDecimal get_price_per_share()
    {
        return price_per_share;
    }
    public void set_price_per_share(BigDecimal _price_per_share)
    {
        this.price_per_share = _price_per_share;
    }

    public BigDecimal get_net_worth()
    {
        return BigDecimal.valueOf(shares).multiply(price_per_share);
    }
}
