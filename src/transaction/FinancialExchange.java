package transaction;

import trading.Stock;
import trading.Trader;

import java.util.Arrays;

public class FinancialExchange {

    private int stockCount = 0;
    private int traderCount = 0;
    private String name;

    private Stock[] listedStocks = new Stock[10];
    private Trader[] traders = new Trader[10];

    public FinancialExchange(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Stock[] getListedStocks() {
        return listedStocks;
    }

    public Trader[] getTraders() {
        return traders;
    }

    public void addStock(Stock stock) {
        if (stockCount == listedStocks.length) {
            listedStocks = Arrays.copyOf(listedStocks, listedStocks.length * 2);
        }
        listedStocks[stockCount] = stock;
        stockCount++;
    }

    public void addTrader(Trader trader) {
        if (traderCount == traders.length) {
            traders = Arrays.copyOf(traders, traders.length * 2);
        }
        traders[traderCount] = trader;
        traderCount++;
    }

    public void showExchangeInfo() {
        System.out.println("Exchange: " + name);
        System.out.println("Listed Stocks: " + (listedStocks.length - 1));
        System.out.println("Active Traders: " + (traders.length - 1));
    }
}
