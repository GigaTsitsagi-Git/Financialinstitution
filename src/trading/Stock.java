package trading;

import transaction.FinancialExchange;

import java.math.BigDecimal;

public class Stock {

    private String companyName;
    private int shares;
    private BigDecimal pricePerShare;

    public Stock(String companyName, int shares, BigDecimal pricePerShare, FinancialExchange financialExchange) {
        this.companyName = companyName;
        this.shares = shares;
        this.pricePerShare = pricePerShare;
        financialExchange.addStock(this);
    }

    public void set_company_name(String companyName) {
        this.companyName = companyName;
    }

    public String get_company_name() {
        return companyName;
    }

    public void set_shares(int shares) {
        this.shares = shares;
    }

    public int get_shares() {
        return shares;
    }

    public BigDecimal get_price_per_share() {
        return pricePerShare;
    }

    public void set_price_per_share(BigDecimal pricePerShare) {
        this.pricePerShare = pricePerShare;
    }

    public BigDecimal get_net_worth() {
        return BigDecimal.valueOf(shares).multiply(pricePerShare);
    }
}
